/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceModelImpl#getPropagateTraces <em>Propagate Traces</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceModelImpl#getSafetyTraces <em>Safety Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureTraceModelImpl extends GenericTraceModelImpl implements FailureTraceModel {
	/**
	 * The cached value of the '{@link #getPropagateTraces() <em>Propagate Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagateTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<PropagateTo> propagateTraces;

	/**
	 * The cached value of the '{@link #getSafetyTraces() <em>Safety Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyTraceability> safetyTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureTraceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureTraceMetaModelPackage.Literals.FAILURE_TRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropagateTo> getPropagateTraces() {
		if (propagateTraces == null) {
			propagateTraces = new EObjectContainmentEList<PropagateTo>(PropagateTo.class, this, FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__PROPAGATE_TRACES);
		}
		return propagateTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SafetyTraceability> getSafetyTraces() {
		if (safetyTraces == null) {
			safetyTraces = new EObjectContainmentEList<SafetyTraceability>(SafetyTraceability.class, this, FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__SAFETY_TRACES);
		}
		return safetyTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__PROPAGATE_TRACES:
				return ((InternalEList<?>)getPropagateTraces()).basicRemove(otherEnd, msgs);
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__SAFETY_TRACES:
				return ((InternalEList<?>)getSafetyTraces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__PROPAGATE_TRACES:
				return getPropagateTraces();
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__SAFETY_TRACES:
				return getSafetyTraces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__PROPAGATE_TRACES:
				getPropagateTraces().clear();
				getPropagateTraces().addAll((Collection<? extends PropagateTo>)newValue);
				return;
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__SAFETY_TRACES:
				getSafetyTraces().clear();
				getSafetyTraces().addAll((Collection<? extends SafetyTraceability>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__PROPAGATE_TRACES:
				getPropagateTraces().clear();
				return;
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__SAFETY_TRACES:
				getSafetyTraces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__PROPAGATE_TRACES:
				return propagateTraces != null && !propagateTraces.isEmpty();
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL__SAFETY_TRACES:
				return safetyTraces != null && !safetyTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailureTraceModelImpl
