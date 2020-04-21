/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.util;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage
 * @generated
 */
public class FailureTraceMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailureTraceMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTraceMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = FailureTraceMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FailureTraceMetaModelPackage.GENERIC_TRACE_MODEL: {
				GenericTraceModel genericTraceModel = (GenericTraceModel)theEObject;
				T result = caseGenericTraceModel(genericTraceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL: {
				FailureTraceModel failureTraceModel = (FailureTraceModel)theEObject;
				T result = caseFailureTraceModel(failureTraceModel);
				if (result == null) result = caseGenericTraceModel(failureTraceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.RELATED_TO: {
				RelatedTo relatedTo = (RelatedTo)theEObject;
				T result = caseRelatedTo(relatedTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.PROPAGATE_TO: {
				PropagateTo propagateTo = (PropagateTo)theEObject;
				T result = casePropagateTo(propagateTo);
				if (result == null) result = caseRelatedTo(propagateTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.SAFETY_TRACEABILITY: {
				SafetyTraceability safetyTraceability = (SafetyTraceability)theEObject;
				T result = caseSafetyTraceability(safetyTraceability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_PROCESS: {
				Failure2Process failure2Process = (Failure2Process)theEObject;
				T result = caseFailure2Process(failure2Process);
				if (result == null) result = caseSafetyTraceability(failure2Process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_RUNNABLE: {
				Failure2Runnable failure2Runnable = (Failure2Runnable)theEObject;
				T result = caseFailure2Runnable(failure2Runnable);
				if (result == null) result = caseSafetyTraceability(failure2Runnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_EVENT: {
				Failure2Event failure2Event = (Failure2Event)theEObject;
				T result = caseFailure2Event(failure2Event);
				if (result == null) result = caseSafetyTraceability(failure2Event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_SEMAPHORE: {
				Failure2Semaphore failure2Semaphore = (Failure2Semaphore)theEObject;
				T result = caseFailure2Semaphore(failure2Semaphore);
				if (result == null) result = caseSafetyTraceability(failure2Semaphore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_LABEL: {
				Failure2Label failure2Label = (Failure2Label)theEObject;
				T result = caseFailure2Label(failure2Label);
				if (result == null) result = caseSafetyTraceability(failure2Label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT: {
				Failure2Constraint failure2Constraint = (Failure2Constraint)theEObject;
				T result = caseFailure2Constraint(failure2Constraint);
				if (result == null) result = caseSafetyTraceability(failure2Constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT: {
				Failure2Component failure2Component = (Failure2Component)theEObject;
				T result = caseFailure2Component(failure2Component);
				if (result == null) result = caseSafetyTraceability(failure2Component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_TASK: {
				FailureModel2Task failureModel2Task = (FailureModel2Task)theEObject;
				T result = caseFailureModel2Task(failureModel2Task);
				if (result == null) result = caseSafetyTraceability(failureModel2Task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL: {
				FailureModel2ConstraintsModel failureModel2ConstraintsModel = (FailureModel2ConstraintsModel)theEObject;
				T result = caseFailureModel2ConstraintsModel(failureModel2ConstraintsModel);
				if (result == null) result = caseSafetyTraceability(failureModel2ConstraintsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT: {
				FailureModel2Component failureModel2Component = (FailureModel2Component)theEObject;
				T result = caseFailureModel2Component(failureModel2Component);
				if (result == null) result = caseSafetyTraceability(failureModel2Component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Trace Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericTraceModel(GenericTraceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Trace Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureTraceModel(FailureTraceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedTo(RelatedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagate To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagate To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagateTo(PropagateTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Traceability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Traceability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyTraceability(SafetyTraceability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Process(Failure2Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Runnable(Failure2Runnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Event(Failure2Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Semaphore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Semaphore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Semaphore(Failure2Semaphore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Label(Failure2Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Constraint(Failure2Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure2 Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure2 Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure2Component(Failure2Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Model2 Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Model2 Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModel2Task(FailureModel2Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Model2 Constraints Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Model2 Constraints Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModel2ConstraintsModel(FailureModel2ConstraintsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Model2 Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Model2 Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModel2Component(FailureModel2Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FailureTraceMetaModelSwitch
