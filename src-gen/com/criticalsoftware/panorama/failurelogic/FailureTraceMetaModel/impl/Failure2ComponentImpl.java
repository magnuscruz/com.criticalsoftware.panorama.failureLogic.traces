/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.failureLogic.Failure;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;

import org.eclipse.app4mc.amalthea.model.ComponentInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure2 Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ComponentImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ComponentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Failure2ComponentImpl extends SafetyTraceabilityImpl implements Failure2Component {
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
	protected Failure2ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureTraceMetaModelPackage.Literals.FAILURE2_COMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE2_COMPONENT__FAILURE, oldFailure, failure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE2_COMPONENT__FAILURE, oldFailure, failure));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureTraceMetaModelPackage.FAILURE2_COMPONENT__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FailureTraceMetaModelPackage.FAILURE2_COMPONENT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__FAILURE:
				if (resolve) return getFailure();
				return basicGetFailure();
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__COMPONENT:
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
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__FAILURE:
				setFailure((Failure)newValue);
				return;
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__COMPONENT:
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
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__FAILURE:
				setFailure((Failure)null);
				return;
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__COMPONENT:
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
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__FAILURE:
				return failure != null;
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //Failure2ComponentImpl
