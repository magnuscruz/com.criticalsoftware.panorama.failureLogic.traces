/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.failureLogic.Failure;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;

import org.eclipse.app4mc.amalthea.model.AffinityConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure2 Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ConstraintImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ConstraintImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Failure2ConstraintImpl extends SafetyTraceabilityImpl implements Failure2Constraint {
	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected Failure failure;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected AffinityConstraint constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Failure2ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureTraceMetaModelPackage.Literals.FAILURE2_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailure() {
		if (failure != null && failure.eIsProxy()) {
			InternalEObject oldFailure = (InternalEObject)failure;
			failure = (Failure)eResolveProxy(oldFailure);
			if (failure != oldFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__FAILURE, oldFailure, failure));
			}
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(Failure newFailure) {
		Failure oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffinityConstraint getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (AffinityConstraint)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffinityConstraint basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(AffinityConstraint newConstraint) {
		AffinityConstraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__FAILURE:
				if (resolve) return getFailure();
				return basicGetFailure();
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__FAILURE:
				setFailure((Failure)newValue);
				return;
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__CONSTRAINT:
				setConstraint((AffinityConstraint)newValue);
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
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__FAILURE:
				setFailure((Failure)null);
				return;
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__CONSTRAINT:
				setConstraint((AffinityConstraint)null);
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
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__FAILURE:
				return failure != null;
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT__CONSTRAINT:
				return constraint != null;
		}
		return super.eIsSet(featureID);
	}

} //Failure2ConstraintImpl
