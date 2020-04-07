/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import com.criticalsoftware.panorama.failureLogic.Failure;

import org.eclipse.app4mc.amalthea.model.Semaphore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure2 Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore#getSemaphore <em>Semaphore</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Semaphore()
 * @model
 * @generated
 */
public interface Failure2Semaphore extends SafetyTraceability {
	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(Failure)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Semaphore_Failure()
	 * @model required="true"
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' reference.
	 * @see #setSemaphore(Semaphore)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Semaphore_Semaphore()
	 * @model required="true"
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore#getSemaphore <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' reference.
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

} // Failure2Semaphore
