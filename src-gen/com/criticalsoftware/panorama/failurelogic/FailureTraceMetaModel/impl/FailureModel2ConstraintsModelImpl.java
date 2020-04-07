/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.failureLogic.FailureModel;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Model2 Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ConstraintsModelImpl#getFailureModel <em>Failure Model</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ConstraintsModelImpl#getConstraintsModel <em>Constraints Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModel2ConstraintsModelImpl extends SafetyTraceabilityImpl implements FailureModel2ConstraintsModel {
	/**
	 * The cached value of the '{@link #getFailureModel() <em>Failure Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModel()
	 * @generated
	 * @ordered
	 */
	protected FailureModel failureModel;

	/**
	 * The cached value of the '{@link #getConstraintsModel() <em>Constraints Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsModel()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsModel constraintsModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModel2ConstraintsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureTraceMetaModelPackage.Literals.FAILURE_MODEL2_CONSTRAINTS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModel getFailureModel() {
		if (failureModel != null && failureModel.eIsProxy()) {
			InternalEObject oldFailureModel = (InternalEObject)failureModel;
			failureModel = (FailureModel)eResolveProxy(oldFailureModel);
			if (failureModel != oldFailureModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL, oldFailureModel, failureModel));
			}
		}
		return failureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModel basicGetFailureModel() {
		return failureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureModel(FailureModel newFailureModel) {
		FailureModel oldFailureModel = failureModel;
		failureModel = newFailureModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL, oldFailureModel, failureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModel getConstraintsModel() {
		if (constraintsModel != null && constraintsModel.eIsProxy()) {
			InternalEObject oldConstraintsModel = (InternalEObject)constraintsModel;
			constraintsModel = (ConstraintsModel)eResolveProxy(oldConstraintsModel);
			if (constraintsModel != oldConstraintsModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL, oldConstraintsModel, constraintsModel));
			}
		}
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModel basicGetConstraintsModel() {
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintsModel(ConstraintsModel newConstraintsModel) {
		ConstraintsModel oldConstraintsModel = constraintsModel;
		constraintsModel = newConstraintsModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL, oldConstraintsModel, constraintsModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL:
				if (resolve) return getFailureModel();
				return basicGetFailureModel();
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL:
				if (resolve) return getConstraintsModel();
				return basicGetConstraintsModel();
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
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL:
				setFailureModel((FailureModel)newValue);
				return;
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL:
				setConstraintsModel((ConstraintsModel)newValue);
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
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL:
				setFailureModel((FailureModel)null);
				return;
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL:
				setConstraintsModel((ConstraintsModel)null);
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
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL:
				return failureModel != null;
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL:
				return constraintsModel != null;
		}
		return super.eIsSet(featureID);
	}

} //FailureModel2ConstraintsModelImpl
