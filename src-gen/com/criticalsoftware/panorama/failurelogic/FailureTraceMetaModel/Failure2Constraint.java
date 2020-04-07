/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import com.criticalsoftware.panorama.failureLogic.Failure;

import org.eclipse.app4mc.amalthea.model.AffinityConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure2 Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Constraint()
 * @model
 * @generated
 */
public interface Failure2Constraint extends SafetyTraceability {
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
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Constraint_Failure()
	 * @model required="true"
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(AffinityConstraint)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Constraint_Constraint()
	 * @model required="true"
	 * @generated
	 */
	AffinityConstraint getConstraint();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(AffinityConstraint value);

} // Failure2Constraint
