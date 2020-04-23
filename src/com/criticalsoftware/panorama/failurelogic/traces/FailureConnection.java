package com.criticalsoftware.panorama.failurelogic.traces;

import java.util.List;

import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.emf.ecore.EObject;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;

public class FailureConnection extends Connection {

	private PropagateTo propagateTo;

	public FailureConnection(EObject origin, List<EObject> targets, EObject tlink) {
		super(origin, targets, tlink);
		if (tlink instanceof PropagateTo) {
			propagateTo = (PropagateTo) tlink;
		}
	}
	
	@Override
	public boolean equals(Object object) {
		
		boolean equal = super.equals(object);
		
		if (!equal && object instanceof FailureConnection && propagateTo != null) {
			equal = propagateTo.equals(((FailureConnection)object).propagateTo);
		}
		
		return equal;
	}
}
