package com.criticalsoftware.panorama.failurelogic.traces;

import java.util.List;

import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.emf.ecore.EObject;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;

public class FailureConnection extends Connection {

	private PropagateTo propagateTo;
	private Failure2Process failure2Process;

	public FailureConnection(EObject origin, List<EObject> targets, EObject tlink) {
		super(origin, targets, tlink);
		if (tlink instanceof PropagateTo) {
			propagateTo = (PropagateTo) tlink;
		} else if (tlink instanceof Failure2Process) {
			failure2Process = (Failure2Process) tlink;
		}
	}
	
	@Override
	public boolean equals(Object object) {
		
		boolean equal = super.equals(object);
		if (!equal && object instanceof FailureConnection)
		if (propagateTo != null) {
			equal = propagateTo.equals(((FailureConnection)object).propagateTo);
		} else if (failure2Process != null) {
			equal = failure2Process.equals(((FailureConnection)object).failure2Process);
		}
		
		return equal;
	}
}
