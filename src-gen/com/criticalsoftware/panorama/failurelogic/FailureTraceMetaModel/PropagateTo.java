/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import org.eclipse.capra.generic.tracemodel.RelatedTo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagate To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getPropagateTo()
 * @model
 * @generated
 */
public interface PropagateTo extends RelatedTo {
	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see #setFailure(String)
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getPropagateTo_Failure()
	 * @model unique="false"
	 * @generated
	 */
	String getFailure();

	/**
	 * Sets the value of the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo#getFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' attribute.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(String value);

} // PropagateTo
