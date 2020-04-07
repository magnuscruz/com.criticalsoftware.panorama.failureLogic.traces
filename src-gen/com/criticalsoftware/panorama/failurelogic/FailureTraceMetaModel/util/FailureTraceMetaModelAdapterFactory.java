/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.util;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.*;

import org.eclipse.capra.generic.tracemodel.GenericTraceModel;
import org.eclipse.capra.generic.tracemodel.RelatedTo;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage
 * @generated
 */
public class FailureTraceMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailureTraceMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTraceMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FailureTraceMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureTraceMetaModelSwitch<Adapter> modelSwitch =
		new FailureTraceMetaModelSwitch<Adapter>() {
			@Override
			public Adapter caseFailureTraceModel(FailureTraceModel object) {
				return createFailureTraceModelAdapter();
			}
			@Override
			public Adapter casePropagateTo(PropagateTo object) {
				return createPropagateToAdapter();
			}
			@Override
			public Adapter caseSafetyTraceability(SafetyTraceability object) {
				return createSafetyTraceabilityAdapter();
			}
			@Override
			public Adapter caseFailure2Process(Failure2Process object) {
				return createFailure2ProcessAdapter();
			}
			@Override
			public Adapter caseFailure2Runnable(Failure2Runnable object) {
				return createFailure2RunnableAdapter();
			}
			@Override
			public Adapter caseFailure2Event(Failure2Event object) {
				return createFailure2EventAdapter();
			}
			@Override
			public Adapter caseFailure2Semaphore(Failure2Semaphore object) {
				return createFailure2SemaphoreAdapter();
			}
			@Override
			public Adapter caseFailure2Label(Failure2Label object) {
				return createFailure2LabelAdapter();
			}
			@Override
			public Adapter caseFailure2Constraint(Failure2Constraint object) {
				return createFailure2ConstraintAdapter();
			}
			@Override
			public Adapter caseFailureModel2Task(FailureModel2Task object) {
				return createFailureModel2TaskAdapter();
			}
			@Override
			public Adapter caseFailureModel2ConstraintsModel(FailureModel2ConstraintsModel object) {
				return createFailureModel2ConstraintsModelAdapter();
			}
			@Override
			public Adapter caseFailure2Component(Failure2Component object) {
				return createFailure2ComponentAdapter();
			}
			@Override
			public Adapter caseFailureModel2Component(FailureModel2Component object) {
				return createFailureModel2ComponentAdapter();
			}
			@Override
			public Adapter caseGenericTraceModel(GenericTraceModel object) {
				return createGenericTraceModelAdapter();
			}
			@Override
			public Adapter caseRelatedTo(RelatedTo object) {
				return createRelatedToAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel <em>Failure Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel
	 * @generated
	 */
	public Adapter createFailureTraceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo <em>Propagate To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo
	 * @generated
	 */
	public Adapter createPropagateToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability <em>Safety Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability
	 * @generated
	 */
	public Adapter createSafetyTraceabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process <em>Failure2 Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process
	 * @generated
	 */
	public Adapter createFailure2ProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable <em>Failure2 Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable
	 * @generated
	 */
	public Adapter createFailure2RunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event <em>Failure2 Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event
	 * @generated
	 */
	public Adapter createFailure2EventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore <em>Failure2 Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore
	 * @generated
	 */
	public Adapter createFailure2SemaphoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label <em>Failure2 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label
	 * @generated
	 */
	public Adapter createFailure2LabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint <em>Failure2 Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint
	 * @generated
	 */
	public Adapter createFailure2ConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task <em>Failure Model2 Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task
	 * @generated
	 */
	public Adapter createFailureModel2TaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel <em>Failure Model2 Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel
	 * @generated
	 */
	public Adapter createFailureModel2ConstraintsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component <em>Failure2 Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component
	 * @generated
	 */
	public Adapter createFailure2ComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component <em>Failure Model2 Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component
	 * @generated
	 */
	public Adapter createFailureModel2ComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.capra.generic.tracemodel.GenericTraceModel <em>Generic Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.capra.generic.tracemodel.GenericTraceModel
	 * @generated
	 */
	public Adapter createGenericTraceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.capra.generic.tracemodel.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo
	 * @generated
	 */
	public Adapter createRelatedToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FailureTraceMetaModelAdapterFactory
