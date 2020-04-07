/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.failureLogic.FailureModel;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;

import org.eclipse.app4mc.amalthea.model.ComponentInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Model2 Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ComponentImpl#getFailureModel <em>Failure Model</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ComponentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModel2ComponentImpl extends SafetyTraceabilityImpl implements FailureModel2Component {
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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModel2ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureTraceMetaModelPackage.Literals.FAILURE_MODEL2_COMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__FAILURE_MODEL, oldFailureModel, failureModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__FAILURE_MODEL, oldFailureModel, failureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (ComponentInstance)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentInstance newComponent) {
		ComponentInstance oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__FAILURE_MODEL:
				if (resolve) return getFailureModel();
				return basicGetFailureModel();
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__FAILURE_MODEL:
				setFailureModel((FailureModel)newValue);
				return;
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__COMPONENT:
				setComponent((ComponentInstance)newValue);
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
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__FAILURE_MODEL:
				setFailureModel((FailureModel)null);
				return;
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__COMPONENT:
				setComponent((ComponentInstance)null);
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
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__FAILURE_MODEL:
				return failureModel != null;
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //FailureModel2ComponentImpl
