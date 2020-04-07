/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import com.criticalsoftware.panorama.failureLogic.FailureModel;

import org.eclipse.app4mc.amalthea.model.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Model2 Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getFailureModel <em>Failure Model</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureModel2Component()
 * @model
 * @generated
 */
public interface FailureModel2Component extends SafetyTraceability {
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
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureModel2Component_FailureModel()
	 * @model required="true"
	 * @generated
	 */
	FailureModel getFailureModel();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getFailureModel <em>Failure Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Model</em>' reference.
	 * @see #getFailureModel()
	 * @generated
	 */
	void setFailureModel(FailureModel value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentInstance)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureModel2Component_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponent();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentInstance value);

} // FailureModel2Component
