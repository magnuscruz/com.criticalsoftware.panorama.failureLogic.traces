/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage
 * @generated
 */
public interface FailureTraceMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailureTraceMetaModelFactory eINSTANCE = com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failure Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Trace Model</em>'.
	 * @generated
	 */
	FailureTraceModel createFailureTraceModel();

	/**
	 * Returns a new object of class '<em>Propagate To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagate To</em>'.
	 * @generated
	 */
	PropagateTo createPropagateTo();

	/**
	 * Returns a new object of class '<em>Failure2 Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Process</em>'.
	 * @generated
	 */
	Failure2Process createFailure2Process();

	/**
	 * Returns a new object of class '<em>Failure2 Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Runnable</em>'.
	 * @generated
	 */
	Failure2Runnable createFailure2Runnable();

	/**
	 * Returns a new object of class '<em>Failure2 Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Event</em>'.
	 * @generated
	 */
	Failure2Event createFailure2Event();

	/**
	 * Returns a new object of class '<em>Failure2 Semaphore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Semaphore</em>'.
	 * @generated
	 */
	Failure2Semaphore createFailure2Semaphore();

	/**
	 * Returns a new object of class '<em>Failure2 Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Label</em>'.
	 * @generated
	 */
	Failure2Label createFailure2Label();

	/**
	 * Returns a new object of class '<em>Failure2 Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Constraint</em>'.
	 * @generated
	 */
	Failure2Constraint createFailure2Constraint();

	/**
	 * Returns a new object of class '<em>Failure Model2 Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Model2 Task</em>'.
	 * @generated
	 */
	FailureModel2Task createFailureModel2Task();

	/**
	 * Returns a new object of class '<em>Failure Model2 Constraints Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Model2 Constraints Model</em>'.
	 * @generated
	 */
	FailureModel2ConstraintsModel createFailureModel2ConstraintsModel();

	/**
	 * Returns a new object of class '<em>Failure2 Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure2 Component</em>'.
	 * @generated
	 */
	Failure2Component createFailure2Component();

	/**
	 * Returns a new object of class '<em>Failure Model2 Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Model2 Component</em>'.
	 * @generated
	 */
	FailureModel2Component createFailureModel2Component();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FailureTraceMetaModelPackage getFailureTraceMetaModelPackage();

} //FailureTraceMetaModelFactory
