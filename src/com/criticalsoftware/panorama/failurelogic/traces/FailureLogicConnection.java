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

import java.util.List;

import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.adapters.TraceMetaModelAdapter;
import org.eclipse.emf.ecore.EObject;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;

/**
 * An minimal abstraction of a traceability link used in
 * {@link TraceMetaModelAdapter}, to retain independence of a concrete trace
 * metamodel.
 * 
 * @author Anthony Anjorin, Salome Maro
 */
public class FailureLogicConnection extends Connection {

	private PropagateTo propagateTo;

	public FailureLogicConnection(EObject origin, List<EObject> targets, EObject tlink) {
		super(origin, targets, tlink);
		if (tlink instanceof PropagateTo) {
			this.propagateTo = (PropagateTo)tlink;
		}
	}

	@Override
	public boolean equals(Object object) {
		boolean equals = super.equals(object);
		if (!equals && propagateTo != null && object instanceof FailureLogicConnection) {
			if (propagateTo != null && propagateTo.equals(((FailureLogicConnection)object).getTlink())) {
				return true;
			}
		}
		return equals;
	}

}
