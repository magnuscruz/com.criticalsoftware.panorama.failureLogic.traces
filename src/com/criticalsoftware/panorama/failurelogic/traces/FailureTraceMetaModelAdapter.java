package com.criticalsoftware.panorama.failurelogic.traces;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.capra.core.adapters.AbstractMetaModelAdapter;
import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.adapters.TraceMetaModelAdapter;
import org.eclipse.capra.core.adapters.TracePersistenceAdapter;
import org.eclipse.capra.core.helpers.ArtifactHelper;
import org.eclipse.capra.core.helpers.ExtensionPointHelper;
import org.eclipse.capra.generic.artifactmodel.GenericArtifactMetaModelAdapter;
import org.eclipse.capra.generic.tracemodel.GenericMetaModelAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelFactory;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;

public class FailureTraceMetaModelAdapter extends GenericMetaModelAdapter implements TraceMetaModelAdapter {
	
	private static final Logger LOG = LoggerFactory.getLogger(FailureTraceMetaModelAdapter.class);

	private static final int DEFAULT_INITIAL_TRANSITIVITY_DEPTH = 1;

	public FailureTraceMetaModelAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public EObject createModel() {
		return FailureTraceMetaModelFactory.eINSTANCE.createFailureTraceModel();
	}

	@Override
	public Collection<EClass> getAvailableTraceTypes(List<EObject> selection) {
		Collection<EClass> traceTypes = new ArrayList<>();
		if (selection.size() > 1) {
			traceTypes.add(FailureTraceMetaModelPackage.eINSTANCE.getPropagateTo());
		}
		traceTypes.addAll(super.getAvailableTraceTypes(selection));
		return traceTypes;
	}

	@Override
	public EObject createTrace(EClass traceType, EObject traceModel, List<EObject> selection) {
		FailureTraceModel tm = (FailureTraceModel) traceModel;
		EObject trace = FailureTraceMetaModelFactory.eINSTANCE.create(traceType);
		PropagateTo PropagateToTrace = (PropagateTo) trace;
		PropagateToTrace.getItem().addAll(selection);
		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(new ResourceSetImpl());
		ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);

		// String builder to build the name of the trace link so by adding the
		// elements it connects so as to make it easy for a user to visually
		// differentiate trace links
		StringBuilder name = new StringBuilder();
		for (Object obj : selection) {
			name.append(" ")
					.append(artifactHelper.getHandler(artifactHelper.unwrapWrapper(obj)).get()
							.withCastedHandler(artifactHelper.unwrapWrapper(obj), (h, e) -> h.getDisplayName(e))
							.orElseGet(obj::toString));
		}
		PropagateToTrace.setName(name.toString());
		tm.getTraces().add(PropagateToTrace);
		return PropagateToTrace;
	}

	@Override
	public boolean isThereATraceBetween(EObject firstElement, EObject secondElement, EObject traceModel) {
		FailureTraceModel root = (FailureTraceModel) traceModel;
		List<PropagateTo> relevantLinks = new ArrayList<PropagateTo>();
		List<PropagateTo> allTraces = root.getPropagateTraces();

		for (PropagateTo trace : allTraces) {
			if (!firstElement.equals(secondElement)) {
				if (trace.getItem().contains(firstElement) && trace.getItem().contains(secondElement)) {
					relevantLinks.add(trace);
				}
			}
		}
		return relevantLinks.size() > 0;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel) {
		FailureTraceModel root = (FailureTraceModel) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<PropagateTo> traces = root.getPropagateTraces();

		if (element instanceof PropagateTo) {
			PropagateTo trace = (PropagateTo) element;
			connections.add(new Connection(element, trace.getItem(), trace));
		} else {
			for (PropagateTo trace : traces) {
				if (trace.getItem().contains(element)) {
					connections.add(new Connection(element, trace.getItem(), trace));
				}
			}
		}
		return connections;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel,
			List<String> selectedRelationshipTypes) {
		FailureTraceModel root = (FailureTraceModel) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<PropagateTo> traces = root.getPropagateTraces();

		if (selectedRelationshipTypes.size() == 0 || selectedRelationshipTypes
				.contains(FailureTraceMetaModelPackage.eINSTANCE.getPropagateTo().getName())) {
			if (element instanceof PropagateTo) {
				PropagateTo trace = (PropagateTo) element;
				connections.add(new Connection(element, trace.getItem(), trace));
			} else {
				for (PropagateTo trace : traces) {
					if (trace.getItem().contains(element)) {
						connections.add(new Connection(element, trace.getItem(), trace));
					}
				}
			}
		}
		return connections;
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel);
		List<Connection> allElements = new ArrayList<>();

		int currDepth = currentDepth + 1;
		for (Connection connection : directElements) {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				for (EObject e : connection.getTargets()) {
					if (maximumDepth == 0 || currDepth <= maximumDepth) {
						allElements.addAll(
								getTransitivelyConnectedElements(e, traceModel, accumulator, currDepth, maximumDepth));
					}
				}
			}
		}
		return allElements;
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, DEFAULT_INITIAL_TRANSITIVITY_DEPTH, maximumDepth);
	}

	@Override
	public List<Connection> getAllTraceLinks(EObject traceModel) {
		FailureTraceModel model = (FailureTraceModel) traceModel;
		List<Connection> allLinks = new ArrayList<>();

		for (PropagateTo trace : model.getPropagateTraces()) {
			List<EObject> allItems = new ArrayList<>();
			allItems.addAll(trace.getItem());
			EObject origin = allItems.get(0);
			allItems.remove(0);
			allLinks.add(new Connection(origin, allItems, trace));
		}
		return allLinks;
	}

	@Override
	public void deleteTrace(List<Connection> toDelete, EObject traceModel) {
		if (traceModel instanceof FailureTraceModel) {
			FailureTraceModel tModel = (FailureTraceModel) traceModel;
			EList<PropagateTo> links = tModel.getPropagateTraces();
			ResourceSet resourceSet = new ResourceSetImpl();
			for (Connection c : toDelete) {
				links.remove(c.getTlink());
			}
			FailureTraceModel newTraceModel = FailureTraceMetaModelFactory.eINSTANCE.createFailureTraceModel();
			newTraceModel.getTraces().addAll(links);
			URI traceModelURI = EcoreUtil.getURI(traceModel);
			Resource resourceForTraces = resourceSet.createResource(traceModelURI);
			resourceForTraces.getContents().add(newTraceModel);
	
			try {
				resourceForTraces.save(null);
                          	// TODO: Think of a way to let the developer handle such sitations (e.g., via an Exception)
			} catch (IOException e) {
				LOG.error("Trace model could not be saved.", e);
			}
		}
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, selectedRelationshipTypes, DEFAULT_INITIAL_TRANSITIVITY_DEPTH,
				maximumDepth);
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, List<String> selectedRelationshipTypes, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel, selectedRelationshipTypes);
		List<Connection> allElements = new ArrayList<>();
		int currDepth = currentDepth + 1;
		for (Connection connection : directElements) {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				for (EObject e : connection.getTargets()) {
					if (maximumDepth == 0 || currDepth <= maximumDepth) {
						allElements.addAll(getTransitivelyConnectedElements(e, traceModel, accumulator,
								selectedRelationshipTypes, currDepth, maximumDepth));
					}
				}
			}
		}

		return allElements;
	}
}