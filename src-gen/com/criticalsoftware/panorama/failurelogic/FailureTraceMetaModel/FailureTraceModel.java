/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel#getPropagateTraces <em>Propagate Traces</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel#getSafetyTraces <em>Safety Traces</em>}</li>
 * </ul>
 *
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureTraceModel()
 * @model
 * @generated
 */
public interface FailureTraceModel extends GenericTraceModel {
	/**
	 * Returns the value of the '<em><b>Propagate Traces</b></em>' containment reference list.
	 * The list contents are of type {@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagate Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagate Traces</em>' containment reference list.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureTraceModel_PropagateTraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropagateTo> getPropagateTraces();

	/**
	 * Returns the value of the '<em><b>Safety Traces</b></em>' containment reference list.
	 * The list contents are of type {@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Traces</em>' containment reference list.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#getFailureTraceModel_SafetyTraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SafetyTraceability> getSafetyTraces();

} // FailureTraceModel
