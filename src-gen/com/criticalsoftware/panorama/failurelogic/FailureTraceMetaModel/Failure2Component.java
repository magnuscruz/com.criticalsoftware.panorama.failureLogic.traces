/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import com.criticalsoftware.panorama.failureLogic.Failure;

import org.eclipse.app4mc.amalthea.model.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure2 Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Component()
 * @model
 * @generated
 */
public interface Failure2Component extends SafetyTraceability {
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
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Component_Failure()
	 * @model required="true"
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

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
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailure2Component_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponent();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentInstance value);

} // Failure2Component
