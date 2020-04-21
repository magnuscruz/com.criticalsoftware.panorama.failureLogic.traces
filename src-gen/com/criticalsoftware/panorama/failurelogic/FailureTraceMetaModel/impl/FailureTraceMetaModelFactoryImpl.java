/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureTraceMetaModelFactoryImpl extends EFactoryImpl implements FailureTraceMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureTraceMetaModelFactory init() {
		try {
			FailureTraceMetaModelFactory theFailureTraceMetaModelFactory = (FailureTraceMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(FailureTraceMetaModelPackage.eNS_URI);
			if (theFailureTraceMetaModelFactory != null) {
				return theFailureTraceMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FailureTraceMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTraceMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FailureTraceMetaModelPackage.GENERIC_TRACE_MODEL: return createGenericTraceModel();
			case FailureTraceMetaModelPackage.FAILURE_TRACE_MODEL: return createFailureTraceModel();
			case FailureTraceMetaModelPackage.RELATED_TO: return createRelatedTo();
			case FailureTraceMetaModelPackage.PROPAGATE_TO: return createPropagateTo();
			case FailureTraceMetaModelPackage.FAILURE2_PROCESS: return createFailure2Process();
			case FailureTraceMetaModelPackage.FAILURE2_RUNNABLE: return createFailure2Runnable();
			case FailureTraceMetaModelPackage.FAILURE2_EVENT: return createFailure2Event();
			case FailureTraceMetaModelPackage.FAILURE2_SEMAPHORE: return createFailure2Semaphore();
			case FailureTraceMetaModelPackage.FAILURE2_LABEL: return createFailure2Label();
			case FailureTraceMetaModelPackage.FAILURE2_CONSTRAINT: return createFailure2Constraint();
			case FailureTraceMetaModelPackage.FAILURE2_COMPONENT: return createFailure2Component();
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_TASK: return createFailureModel2Task();
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_CONSTRAINTS_MODEL: return createFailureModel2ConstraintsModel();
			case FailureTraceMetaModelPackage.FAILURE_MODEL2_COMPONENT: return createFailureModel2Component();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTraceModel createGenericTraceModel() {
		GenericTraceModelImpl genericTraceModel = new GenericTraceModelImpl();
		return genericTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTraceModel createFailureTraceModel() {
		FailureTraceModelImpl failureTraceModel = new FailureTraceModelImpl();
		return failureTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedTo createRelatedTo() {
		RelatedToImpl relatedTo = new RelatedToImpl();
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagateTo createPropagateTo() {
		PropagateToImpl propagateTo = new PropagateToImpl();
		return propagateTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Process createFailure2Process() {
		Failure2ProcessImpl failure2Process = new Failure2ProcessImpl();
		return failure2Process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Runnable createFailure2Runnable() {
		Failure2RunnableImpl failure2Runnable = new Failure2RunnableImpl();
		return failure2Runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Event createFailure2Event() {
		Failure2EventImpl failure2Event = new Failure2EventImpl();
		return failure2Event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Semaphore createFailure2Semaphore() {
		Failure2SemaphoreImpl failure2Semaphore = new Failure2SemaphoreImpl();
		return failure2Semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Label createFailure2Label() {
		Failure2LabelImpl failure2Label = new Failure2LabelImpl();
		return failure2Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Constraint createFailure2Constraint() {
		Failure2ConstraintImpl failure2Constraint = new Failure2ConstraintImpl();
		return failure2Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure2Component createFailure2Component() {
		Failure2ComponentImpl failure2Component = new Failure2ComponentImpl();
		return failure2Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModel2Task createFailureModel2Task() {
		FailureModel2TaskImpl failureModel2Task = new FailureModel2TaskImpl();
		return failureModel2Task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModel2ConstraintsModel createFailureModel2ConstraintsModel() {
		FailureModel2ConstraintsModelImpl failureModel2ConstraintsModel = new FailureModel2ConstraintsModelImpl();
		return failureModel2ConstraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModel2Component createFailureModel2Component() {
		FailureModel2ComponentImpl failureModel2Component = new FailureModel2ComponentImpl();
		return failureModel2Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTraceMetaModelPackage getFailureTraceMetaModelPackage() {
		return (FailureTraceMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FailureTraceMetaModelPackage getPackage() {
		return FailureTraceMetaModelPackage.eINSTANCE;
	}

} //FailureTraceMetaModelFactoryImpl
