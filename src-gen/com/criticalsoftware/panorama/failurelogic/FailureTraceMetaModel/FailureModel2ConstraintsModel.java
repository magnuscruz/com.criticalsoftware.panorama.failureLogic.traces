/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import com.criticalsoftware.panorama.failureLogic.FailureModel;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Model2 Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getFailureModel <em>Failure Model</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getConstraintsModel <em>Constraints Model</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureModel2ConstraintsModel()
 * @model
 * @generated
 */
public interface FailureModel2ConstraintsModel extends SafetyTraceability {
	/**
	 * Returns the value of the '<em><b>Failure Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Model</em>' reference.
	 * @see #setFailureModel(FailureModel)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureModel2ConstraintsModel_FailureModel()
	 * @model required="true"
	 * @generated
	 */
	FailureModel getFailureModel();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getFailureModel <em>Failure Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Model</em>' reference.
	 * @see #getFailureModel()
	 * @generated
	 */
	void setFailureModel(FailureModel value);

	/**
	 * Returns the value of the '<em><b>Constraints Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Model</em>' reference.
	 * @see #setConstraintsModel(ConstraintsModel)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureModel2ConstraintsModel_ConstraintsModel()
	 * @model required="true"
	 * @generated
	 */
	ConstraintsModel getConstraintsModel();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getConstraintsModel <em>Constraints Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints Model</em>' reference.
	 * @see #getConstraintsModel()
	 * @generated
	 */
	void setConstraintsModel(ConstraintsModel value);

} // FailureModel2ConstraintsModel
