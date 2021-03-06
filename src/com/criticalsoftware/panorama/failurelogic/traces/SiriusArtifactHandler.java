/*******************************************************************************
 * Copyright (c) 2016, 2019 Chalmers | University of Gothenburg, rt-labs and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *      Chalmers | University of Gothenburg and rt-labs - initial API and implementation and/or initial documentation
 *      Chalmers | University of Gothenburg - additional features, updated API
 *******************************************************************************/
package com.criticalsoftware.panorama.failurelogic.traces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.handlers.AbstractArtifactHandler;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNode;

/**
 * A handler for APP4MC models.
 * 
 * @author Salome Maro
 *
 */
public class SiriusArtifactHandler extends AbstractArtifactHandler<DNode> {

	@Override
	public EObject createWrapper(DNode artifact, EObject artifactModel) {
		return artifact;
	}

	@Override
	public DNode resolveWrapper(EObject wrapper) {
		return (DNode) wrapper;
	}

	@Override
	public String getDisplayName(DNode artifact) {
		return artifact.getName();
	}

	@Override
	public String generateMarkerMessage(IResourceDelta delta, String wrapperUri) {
		// TODO
		return null;
	}

	@Override
	public boolean isThereAnInternalTraceBetween(EObject first, EObject second) {
		if (first.equals(second)) {
			return false;
		} else if (first instanceof DNode && second instanceof DNode) {
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
		if (investigatedElement instanceof DNode) {
			DNode named = (DNode) investigatedElement;
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
