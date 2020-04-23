package com.criticalsoftware.panorama.failurelogic.traces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.capra.core.adapters.AbstractMetaModelAdapter;
import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.adapters.TraceMetaModelAdapter;
import org.eclipse.capra.core.adapters.TracePersistenceAdapter;
import org.eclipse.capra.core.helpers.ArtifactHelper;
import org.eclipse.capra.core.helpers.ExtensionPointHelper;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.criticalsoftware.panorama.base.BaseElement;
import com.criticalsoftware.panorama.failureLogic.Failure;
import com.criticalsoftware.panorama.failureLogic.FailureOriginType;
import com.criticalsoftware.panorama.failureLogic.FTA.Cause;
import com.criticalsoftware.panorama.failureLogic.FTA.FaultTree;
import com.criticalsoftware.panorama.failureLogic.FTA.Gate;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelFactory;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability;

public class FailureTraceMetaModelAdapter extends AbstractMetaModelAdapter implements TraceMetaModelAdapter {

	private static final Logger LOG = LoggerFactory.getLogger(FailureTraceMetaModelAdapter.class);

	private static final int DEFAULT_INITIAL_TRANSITIVITY_DEPTH = 1;

	public FailureTraceMetaModelAdapter() {
	}

	@Override
	public EObject createModel() {
		return FailureTraceMetaModelFactory.eINSTANCE.createFailureTraceModel();
	}

	@Override
	public Collection<EClass> getAvailableTraceTypes(List<EObject> selection) {
		Collection<EClass> traceTypes = new ArrayList<>();
		if (selection.size() > 1) {
			traceTypes.add(FailureTraceMetaModelPackage.eINSTANCE.getRelatedTo());
			traceTypes.add(FailureTraceMetaModelPackage.eINSTANCE.getPropagateTo());
			traceTypes.add(FailureTraceMetaModelPackage.eINSTANCE.getFailure2Process());
			traceTypes.add(FailureTraceMetaModelPackage.eINSTANCE.getFailure2Constraint());
			traceTypes.add(FailureTraceMetaModelPackage.eINSTANCE.getFailure2Runnable());
		}
		return traceTypes;
	}

	@Override
	public EObject createTrace(EClass traceType, EObject traceModel, List<EObject> selection) {
		FailureTraceModel tm = (FailureTraceModel) traceModel;
		EObject trace = FailureTraceMetaModelFactory.eINSTANCE.create(traceType);
		if (trace instanceof PropagateTo) {
			PropagateTo relatedToTrace = (PropagateTo) trace;
			relatedToTrace.getItem().addAll(selection);
			
			BaseElement output = extractOutput(selection, relatedToTrace);
			if (output != null) {
				tm.getPropagateTraces().add(relatedToTrace);
			} else {
				fillTraces(selection, tm, trace);
			}
		} else if (trace instanceof SafetyTraceability && selection.size() == 2) {
			if (trace instanceof Failure2Process) {
				Failure2Process relatedToTrace = (Failure2Process) trace;
				for (Object obj : selection) {
					if (obj instanceof Failure) {
						relatedToTrace.setFailure((Failure) obj);
					} else {
						relatedToTrace.setProcess((AbstractProcess) obj);
					}
				}
				tm.getSafetyTraces().add(relatedToTrace);
			} else if (trace instanceof Failure2Runnable) {
				Failure2Runnable relatedToTrace = (Failure2Runnable) trace;
				for (Object obj : selection) {
					if (obj instanceof Failure) {
						relatedToTrace.setFailure((Failure) obj);
					} else {
						relatedToTrace.setRunnable((Runnable) obj);
					}
				}
				tm.getSafetyTraces().add(relatedToTrace);
			} else if (trace instanceof Failure2Constraint) {
				Failure2Constraint relatedToTrace = (Failure2Constraint) trace;
				for (Object obj : selection) {
					if (obj instanceof Failure) {
						relatedToTrace.setFailure((Failure) obj);
					} else {
						relatedToTrace.setConstraint((AffinityConstraint) obj);
					}
				}
				tm.getSafetyTraces().add(relatedToTrace);
			}
		} else {
			trace = FailureTraceMetaModelFactory.eINSTANCE
					.create(FailureTraceMetaModelPackage.eINSTANCE.getRelatedTo());
			fillTraces(selection, tm, trace);
		}
		return trace;
	}

	private BaseElement extractOutput(List<EObject> selection, PropagateTo relatedToTrace) {
		for (Object obj : selection) {
			if (obj instanceof Failure) {
				Failure failure = (Failure) obj;
				if (failure.getOriginType().equals(FailureOriginType.OUTPUT)) {
					relatedToTrace.getItem().remove(failure);
					fillFailureData(relatedToTrace, failure);
					return failure;
				}
			} else if (obj instanceof Cause) {
				Cause cause = (Cause) obj;
				Failure failure = cause.getFailure();
			
				if (failure != null && failure.getOriginType().equals(FailureOriginType.OUTPUT)) {
					relatedToTrace.getItem().remove(obj);
					fillFailureData(relatedToTrace, failure);
					return cause;
				}
			}
		}
		return null;
	}

	private void fillFailureData(PropagateTo relatedToTrace, Failure failure) {
		relatedToTrace.setName(failure.getName());
		relatedToTrace.setFailure(failure);
	}

	private void fillTraces(List<EObject> selection, FailureTraceModel tm, EObject trace) {
		RelatedTo relatedToTrace = (RelatedTo) trace;
		relatedToTrace.getItem().addAll(selection);
		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(new ResourceSetImpl());
		ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);

		// String builder to build the name of the trace link so by adding the
		// elements it connects so as to make it easy for a user to visually
		// differentiate trace links
		StringBuilder name = new StringBuilder();
		if (relatedToTrace.getName() != null) {
			name.append(relatedToTrace.getName());
		}
		for (Object obj : selection) {
			name.append(" ")
					.append(artifactHelper.getHandler(artifactHelper.unwrapWrapper(obj)).get()
							.withCastedHandler(artifactHelper.unwrapWrapper(obj), (h, e) -> h.getDisplayName(e))
							.orElseGet(obj::toString));
		}
		
		relatedToTrace.setName(name.toString());
		tm.getTraces().add(relatedToTrace);
	}

	@Override
	public boolean isThereATraceBetween(EObject firstElement, EObject secondElement, EObject traceModel) {
		FailureTraceModel root = (FailureTraceModel) traceModel;
		List<Object> relevantLinks = new ArrayList<>();
		List<RelatedTo> allTraces = root.getTraces();
		allTraces.addAll(root.getPropagateTraces());

		for (RelatedTo trace : allTraces) {
			if (!firstElement.equals(secondElement)) {
				if (trace.getItem().contains(firstElement) && trace.getItem().contains(secondElement)) {
					relevantLinks.add(trace);
				}
			}
		}

		List<SafetyTraceability> propTraces = root.getSafetyTraces();

		for (SafetyTraceability trace : propTraces) {
			if (!firstElement.equals(secondElement)) {
				if (trace instanceof Failure2Process) {
					Failure2Process relatedToTrace = (Failure2Process) trace;
					if ((relatedToTrace.getFailure().equals(firstElement)
							&& relatedToTrace.getProcess().equals(secondElement))
							|| (relatedToTrace.getFailure().equals(secondElement)
									&& relatedToTrace.getProcess().equals(firstElement))) {
						relevantLinks.add(trace);
					}
				} else if (trace instanceof Failure2Runnable) {
					Failure2Runnable relatedToTrace = (Failure2Runnable) trace;
					if ((relatedToTrace.getFailure().equals(firstElement)
							&& relatedToTrace.getRunnable().equals(secondElement))
							|| (relatedToTrace.getFailure().equals(secondElement)
									&& relatedToTrace.getRunnable().equals(firstElement))) {
						relevantLinks.add(trace);
					}
				} else if (trace instanceof Failure2Constraint) {
					Failure2Constraint relatedToTrace = (Failure2Constraint) trace;
					if ((relatedToTrace.getFailure().equals(firstElement)
							&& relatedToTrace.getConstraint().equals(secondElement))
							|| (relatedToTrace.getFailure().equals(secondElement)
									&& relatedToTrace.getConstraint().equals(firstElement))) {
						relevantLinks.add(trace);
					}
				}
			}
		}
		return relevantLinks.size() > 0;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel) {
		FailureTraceModel root = (FailureTraceModel) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<RelatedTo> traces = root.getTraces();

		if (element instanceof RelatedTo) {
			RelatedTo trace = (RelatedTo) element;
			connections.add(new Connection(element, trace.getItem(), trace));
		} else {
			for (RelatedTo trace : traces) {
				for (EObject item : trace.getItem()) {
					if (EcoreUtil.equals(item, element)) {
						connections.add(new Connection(element, trace.getItem(), trace));
					}
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
		List<RelatedTo> traces = root.getTraces();

		if (selectedRelationshipTypes.size() == 0 || selectedRelationshipTypes
				.contains(FailureTraceMetaModelPackage.eINSTANCE.getRelatedTo().getName())) {
			if (element instanceof RelatedTo) {
				RelatedTo trace = (RelatedTo) element;
				connections.add(new Connection(element, trace.getItem(), trace));
			} else {
				for (RelatedTo trace : traces) {
					for (EObject item : trace.getItem()) {
						if (EcoreUtil.equals(item, element)) {
							connections.add(new Connection(element, trace.getItem(), trace));
						}
					}
				}
			}
		}
		
		List<PropagateTo> propTraces = root.getPropagateTraces();

		if (selectedRelationshipTypes.size() == 0 || selectedRelationshipTypes
				.contains(FailureTraceMetaModelPackage.eINSTANCE.getPropagateTo().getName())) {
			if (element instanceof PropagateTo) {
				PropagateTo trace = (PropagateTo) element;
				connections.add(new Connection(element, trace.getItem(), trace));
			} else {
				for (PropagateTo trace : propTraces) {
					for (EObject item : trace.getItem()) {
						if (EcoreUtil.equals(item, element)) {
							connections.add(new Connection(element, trace.getItem(), trace));
						}
					}
				}
			}
		}
		List<SafetyTraceability> safeTraces = root.getSafetyTraces();

		if (selectedRelationshipTypes.size() == 0 || selectedRelationshipTypes
				.contains(FailureTraceMetaModelPackage.eINSTANCE.getSafetyTraceability().getName())) {
			if (element instanceof SafetyTraceability) {
				SafetyTraceability trace = (SafetyTraceability) element;
				BasicEList<EObject> list = new BasicEList<>();
				list.add(trace.getFailure());
				if (trace instanceof Failure2Process) {
					list.add(((Failure2Process)trace).getProcess());
				} else if (trace instanceof Failure2Constraint) {
					list.add(((Failure2Constraint)trace).getConstraint());
				}  else if (trace instanceof Failure2Runnable) {
					list.add(((Failure2Runnable)trace).getRunnable());
				} 
				connections.add(new Connection(element, list, trace));
			} else {
				for (SafetyTraceability trace : safeTraces) {
					BasicEList<EObject> list = new BasicEList<>();
					list.add(trace.getFailure());
					if (trace instanceof Failure2Process) {
						list.add(((Failure2Process)trace).getProcess());
					} else if (trace instanceof Failure2Constraint) {
						list.add(((Failure2Constraint)trace).getConstraint());
					}  else if (trace instanceof Failure2Runnable) {
						list.add(((Failure2Runnable)trace).getRunnable());
					} 
					connections.add(new Connection(element, list, trace));
				}
			}
		}
		
		if (element instanceof Failure || element instanceof Cause) {
			EObject eContainer = ((BaseElement)element).eContainer();
			if (eContainer instanceof FaultTree) {
				FaultTree faultTree = (FaultTree)eContainer;
				buildFaulTreeTraces(connections, faultTree);
			}
		} else if (element instanceof FaultTree) {
			buildFaulTreeTraces(connections, (FaultTree) element);
		}
		return connections;
	}

	private void buildFaulTreeTraces(List<Connection> connections, FaultTree faultTree) {
		EList<Cause> causes = faultTree.getCauses();
		BasicEList<EObject> list = new BasicEList<>();
		list.addAll(causes);
		PropagateTo trace = (PropagateTo) FailureTraceMetaModelFactory.eINSTANCE.create(FailureTraceMetaModelPackage.eINSTANCE.getPropagateTo());
		BaseElement output = extractOutput(list, trace);
		putConnection(connections, faultTree, list, trace, output);
	}

	private void putConnection(List<Connection> connections, EObject node, BasicEList<EObject> list, PropagateTo trace,
			BaseElement output) {
		list.clear();
		if (output != null) {
			list.add(output);
			trace.getItem().add(output);
			connections.add(new Connection(output, list, trace));
		} else {
			list.add(node);
			trace.getItem().add(node);
			connections.add(new Connection(node, list, trace));
		}
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
		return getTransitivelyConnectedElements(element, traceModel, accumulator, DEFAULT_INITIAL_TRANSITIVITY_DEPTH,
				maximumDepth);
	}

	@Override
	public List<Connection> getAllTraceLinks(EObject traceModel) {
		FailureTraceModel model = (FailureTraceModel) traceModel;
		List<Connection> allLinks = new ArrayList<>();

		for (RelatedTo trace : model.getTraces()) {
			List<EObject> allItems = new ArrayList<>();
			allItems.addAll(trace.getItem());
			EObject origin = allItems.get(0);
			allItems.remove(0);
			allLinks.add(new Connection(origin, allItems, trace));
		}
		
		for (RelatedTo trace : model.getPropagateTraces()) {
			List<EObject> allItems = new ArrayList<>();
			allItems.addAll(trace.getItem());
			EObject origin = allItems.get(0);
			allItems.remove(0);
			allLinks.add(new Connection(origin, allItems, trace));
		}
		
		for (SafetyTraceability trace : model.getSafetyTraces()) {
			List<EObject> list = new ArrayList<>();
			if (trace instanceof Failure2Process) {
				list.add(((Failure2Process)trace).getProcess());
			} else if (trace instanceof Failure2Constraint) {
				list.add(((Failure2Constraint)trace).getConstraint());
			}  else if (trace instanceof Failure2Runnable) {
				list.add(((Failure2Runnable)trace).getRunnable());
			}
			allLinks.add(new Connection(trace.getFailure(), list, trace));
		}
		return allLinks;
	}

	@Override
	public void deleteTrace(List<Connection> toDelete, EObject traceModel) {
		List<Object> toRemove = new ArrayList<>();
		// TODO
		if (traceModel instanceof FailureTraceModel) {
			FailureTraceModel tModel = (FailureTraceModel) traceModel;
			for (Connection c : toDelete) {
				boolean removed = false;
				for (RelatedTo trace : tModel.getTraces()) {
					if (EcoreUtil.equals(trace, c.getTlink())) {
						toRemove.add(trace);
						removed = true;
					}
				}
				if (removed)
					continue;
				for (RelatedTo trace : tModel.getPropagateTraces()) {
					if (EcoreUtil.equals(trace, c.getTlink())) {
						toRemove.add(trace);
						removed = true;
					}
				}

				if (removed)
					continue;
				for (SafetyTraceability trace : tModel.getSafetyTraces()) {
					if (EcoreUtil.equals(trace, c.getTlink())) {
						toRemove.add(trace);
						removed = true;
					}
				}
			}
			for (Object trace : toRemove) {
				tModel.getTraces().remove(trace);
			}

			TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
			persistenceAdapter.saveTracesAndArtifacts(tModel,
					persistenceAdapter.getArtifactWrappers(new ResourceSetImpl()));
		}
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, selectedRelationshipTypes,
				DEFAULT_INITIAL_TRANSITIVITY_DEPTH, maximumDepth);
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, List<String> selectedRelationshipTypes, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel, selectedRelationshipTypes);
		List<Connection> allElements = new ArrayList<>();
		int currDepth = currentDepth + 1;
		//System.out.println(currentDepth);
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
