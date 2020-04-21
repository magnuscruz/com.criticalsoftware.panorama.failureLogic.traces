package com.criticalsoftware.panorama.failurelogic.traces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.handlers.AbstractArtifactHandler;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.emf.ecore.EObject;

import com.criticalsoftware.panorama.base.BaseElement;

public class FailureArtifactHandler extends AbstractArtifactHandler<BaseElement> {

	@Override
	public EObject createWrapper(BaseElement artifact, EObject artifactModel) {
		// Returns the EObject corresponding to the input object if the input is
		// an EObject, or if it is Adaptable to an EObject
		return artifact;
	}

	@Override
	public BaseElement resolveWrapper(EObject wrapper) {
		return (BaseElement) wrapper; // TODO
	}

	@Override
	public String getDisplayName(BaseElement artifact) {
		EObject sel = artifact;
		return artifact.getName();//org.eclipse.capra.core.helpers.EMFHelper.getIdentifier(sel); // TODO
	}

	@Override
	public String generateMarkerMessage(IResourceDelta delta, String wrapperUri) {
		return null;
	}

	@Override
	public boolean isThereAnInternalTraceBetween(EObject first, EObject second) {
		if (first.equals(second)) {
			return false;
		} else if (first instanceof BaseElement && second instanceof BaseElement) {
			if (first.eCrossReferences() != null && second.eCrossReferences() != null) {
				if (first.eCrossReferences().contains(second) || second.eCrossReferences().contains(first)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<Connection> addInternalLinks(EObject investigatedElement, List<String> selectedRelationshipTypes) {
		List<Connection> connections = new ArrayList<Connection>();
		if (investigatedElement instanceof BaseElement) {
			BaseElement named = (BaseElement) investigatedElement;
			if (named.eCrossReferences() != null) {
				List<EObject> refs = named.eCrossReferences();
				for (EObject ref : refs) {
					if (selectedRelationshipTypes != null) {
						if (selectedRelationshipTypes.size() == 0
								|| selectedRelationshipTypes.contains(ref.eClass().getName())) {
							connections.add(new Connection(investigatedElement, Arrays.asList(ref), ref));
						}
					} else {// selectedRelationshipTypes is null and therefore return all cross references
						// as internal links
						connections.add(new Connection(investigatedElement, Arrays.asList(ref), ref));
					}
				}
			}
		}
		return connections;
	}
}