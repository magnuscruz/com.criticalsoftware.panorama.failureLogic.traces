/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='com.criticalsoftware.panorama.failurelogic'"
 * @generated
 */
public interface FailureTraceMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FailureTraceMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FailureTraceMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailureTraceMetaModelPackage eINSTANCE = com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.GenericTraceModelImpl <em>Generic Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.GenericTraceModelImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getGenericTraceModel()
	 * @generated
	 */
	int GENERIC_TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TRACE_MODEL__TRACES = 0;

	/**
	 * The number of structural features of the '<em>Generic Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TRACE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generic Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TRACE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceModelImpl <em>Failure Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceModelImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureTraceModel()
	 * @generated
	 */
	int FAILURE_TRACE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TRACE_MODEL__TRACES = GENERIC_TRACE_MODEL__TRACES;

	/**
	 * The feature id for the '<em><b>Propagate Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TRACE_MODEL__PROPAGATE_TRACES = GENERIC_TRACE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Safety Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TRACE_MODEL__SAFETY_TRACES = GENERIC_TRACE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TRACE_MODEL_FEATURE_COUNT = GENERIC_TRACE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TRACE_MODEL_OPERATION_COUNT = GENERIC_TRACE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.RelatedToImpl <em>Related To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.RelatedToImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getRelatedTo()
	 * @generated
	 */
	int RELATED_TO = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ITEM = 2;

	/**
	 * The number of structural features of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.PropagateToImpl <em>Propagate To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.PropagateToImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getPropagateTo()
	 * @generated
	 */
	int PROPAGATE_TO = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATE_TO__ID = RELATED_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATE_TO__NAME = RELATED_TO__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATE_TO__ITEM = RELATED_TO__ITEM;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATE_TO__FAILURE = RELATED_TO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagate To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATE_TO_FEATURE_COUNT = RELATED_TO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Propagate To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATE_TO_OPERATION_COUNT = RELATED_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.SafetyTraceabilityImpl <em>Safety Traceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.SafetyTraceabilityImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getSafetyTraceability()
	 * @generated
	 */
	int SAFETY_TRACEABILITY = 4;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_TRACEABILITY__FAILURE = 0;

	/**
	 * The number of structural features of the '<em>Safety Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_TRACEABILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Safety Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_TRACEABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ProcessImpl <em>Failure2 Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ProcessImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Process()
	 * @generated
	 */
	int FAILURE2_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_PROCESS__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_PROCESS__PROCESS = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_PROCESS_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_PROCESS_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2RunnableImpl <em>Failure2 Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2RunnableImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Runnable()
	 * @generated
	 */
	int FAILURE2_RUNNABLE = 6;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_RUNNABLE__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_RUNNABLE__RUNNABLE = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_RUNNABLE_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_RUNNABLE_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2EventImpl <em>Failure2 Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2EventImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Event()
	 * @generated
	 */
	int FAILURE2_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_EVENT__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_EVENT__EVENT = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_EVENT_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_EVENT_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2SemaphoreImpl <em>Failure2 Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2SemaphoreImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Semaphore()
	 * @generated
	 */
	int FAILURE2_SEMAPHORE = 8;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_SEMAPHORE__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_SEMAPHORE__SEMAPHORE = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_SEMAPHORE_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_SEMAPHORE_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2LabelImpl <em>Failure2 Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2LabelImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Label()
	 * @generated
	 */
	int FAILURE2_LABEL = 9;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_LABEL__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_LABEL__LABEL = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_LABEL_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_LABEL_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ConstraintImpl <em>Failure2 Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ConstraintImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Constraint()
	 * @generated
	 */
	int FAILURE2_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_CONSTRAINT__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_CONSTRAINT__CONSTRAINT = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_CONSTRAINT_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_CONSTRAINT_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ComponentImpl <em>Failure2 Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ComponentImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Component()
	 * @generated
	 */
	int FAILURE2_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_COMPONENT__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_COMPONENT__COMPONENT = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure2 Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_COMPONENT_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure2 Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE2_COMPONENT_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2TaskImpl <em>Failure Model2 Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2TaskImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureModel2Task()
	 * @generated
	 */
	int FAILURE_MODEL2_TASK = 12;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_TASK__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Failure Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_TASK__FAILURE_MODEL = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_TASK__RUNNABLE = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Model2 Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_TASK_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Model2 Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_TASK_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ConstraintsModelImpl <em>Failure Model2 Constraints Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ConstraintsModelImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureModel2ConstraintsModel()
	 * @generated
	 */
	int FAILURE_MODEL2_CONSTRAINTS_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Failure Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Model2 Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_CONSTRAINTS_MODEL_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Model2 Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_CONSTRAINTS_MODEL_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ComponentImpl <em>Failure Model2 Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ComponentImpl
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureModel2Component()
	 * @generated
	 */
	int FAILURE_MODEL2_COMPONENT = 14;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_COMPONENT__FAILURE = SAFETY_TRACEABILITY__FAILURE;

	/**
	 * The feature id for the '<em><b>Failure Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_COMPONENT__FAILURE_MODEL = SAFETY_TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_COMPONENT__COMPONENT = SAFETY_TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Model2 Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_COMPONENT_FEATURE_COUNT = SAFETY_TRACEABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure Model2 Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL2_COMPONENT_OPERATION_COUNT = SAFETY_TRACEABILITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.GenericTraceModel <em>Generic Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Trace Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.GenericTraceModel
	 * @generated
	 */
	EClass getGenericTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.GenericTraceModel#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.GenericTraceModel#getTraces()
	 * @see #getGenericTraceModel()
	 * @generated
	 */
	EReference getGenericTraceModel_Traces();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel <em>Failure Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Trace Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel
	 * @generated
	 */
	EClass getFailureTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel#getPropagateTraces <em>Propagate Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propagate Traces</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel#getPropagateTraces()
	 * @see #getFailureTraceModel()
	 * @generated
	 */
	EReference getFailureTraceModel_PropagateTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel#getSafetyTraces <em>Safety Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety Traces</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel#getSafetyTraces()
	 * @see #getFailureTraceModel()
	 * @generated
	 */
	EReference getFailureTraceModel_SafetyTraces();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related To</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo
	 * @generated
	 */
	EClass getRelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo#getID()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EAttribute getRelatedTo_ID();

	/**
	 * Returns the meta object for the attribute '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo#getName()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EAttribute getRelatedTo_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo#getItem()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EReference getRelatedTo_Item();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo <em>Propagate To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagate To</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo
	 * @generated
	 */
	EClass getPropagateTo();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo#getFailure()
	 * @see #getPropagateTo()
	 * @generated
	 */
	EReference getPropagateTo_Failure();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability <em>Safety Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Traceability</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability
	 * @generated
	 */
	EClass getSafetyTraceability();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability#getFailure()
	 * @see #getSafetyTraceability()
	 * @generated
	 */
	EReference getSafetyTraceability_Failure();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process <em>Failure2 Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Process</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process
	 * @generated
	 */
	EClass getFailure2Process();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process#getProcess()
	 * @see #getFailure2Process()
	 * @generated
	 */
	EReference getFailure2Process_Process();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable <em>Failure2 Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Runnable</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable
	 * @generated
	 */
	EClass getFailure2Runnable();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable#getRunnable()
	 * @see #getFailure2Runnable()
	 * @generated
	 */
	EReference getFailure2Runnable_Runnable();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event <em>Failure2 Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Event</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event
	 * @generated
	 */
	EClass getFailure2Event();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event#getEvent()
	 * @see #getFailure2Event()
	 * @generated
	 */
	EReference getFailure2Event_Event();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore <em>Failure2 Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Semaphore</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore
	 * @generated
	 */
	EClass getFailure2Semaphore();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semaphore</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore#getSemaphore()
	 * @see #getFailure2Semaphore()
	 * @generated
	 */
	EReference getFailure2Semaphore_Semaphore();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label <em>Failure2 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Label</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label
	 * @generated
	 */
	EClass getFailure2Label();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label#getLabel()
	 * @see #getFailure2Label()
	 * @generated
	 */
	EReference getFailure2Label_Label();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint <em>Failure2 Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Constraint</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint
	 * @generated
	 */
	EClass getFailure2Constraint();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint#getConstraint()
	 * @see #getFailure2Constraint()
	 * @generated
	 */
	EReference getFailure2Constraint_Constraint();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component <em>Failure2 Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure2 Component</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component
	 * @generated
	 */
	EClass getFailure2Component();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component#getComponent()
	 * @see #getFailure2Component()
	 * @generated
	 */
	EReference getFailure2Component_Component();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task <em>Failure Model2 Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Model2 Task</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task
	 * @generated
	 */
	EClass getFailureModel2Task();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task#getFailureModel <em>Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task#getFailureModel()
	 * @see #getFailureModel2Task()
	 * @generated
	 */
	EReference getFailureModel2Task_FailureModel();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task#getRunnable()
	 * @see #getFailureModel2Task()
	 * @generated
	 */
	EReference getFailureModel2Task_Runnable();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel <em>Failure Model2 Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Model2 Constraints Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel
	 * @generated
	 */
	EClass getFailureModel2ConstraintsModel();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getFailureModel <em>Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getFailureModel()
	 * @see #getFailureModel2ConstraintsModel()
	 * @generated
	 */
	EReference getFailureModel2ConstraintsModel_FailureModel();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraints Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel#getConstraintsModel()
	 * @see #getFailureModel2ConstraintsModel()
	 * @generated
	 */
	EReference getFailureModel2ConstraintsModel_ConstraintsModel();

	/**
	 * Returns the meta object for class '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component <em>Failure Model2 Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Model2 Component</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component
	 * @generated
	 */
	EClass getFailureModel2Component();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getFailureModel <em>Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Model</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getFailureModel()
	 * @see #getFailureModel2Component()
	 * @generated
	 */
	EReference getFailureModel2Component_FailureModel();

	/**
	 * Returns the meta object for the reference '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component#getComponent()
	 * @see #getFailureModel2Component()
	 * @generated
	 */
	EReference getFailureModel2Component_Component();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FailureTraceMetaModelFactory getFailureTraceMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.GenericTraceModelImpl <em>Generic Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.GenericTraceModelImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getGenericTraceModel()
		 * @generated
		 */
		EClass GENERIC_TRACE_MODEL = eINSTANCE.getGenericTraceModel();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TRACE_MODEL__TRACES = eINSTANCE.getGenericTraceModel_Traces();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceModelImpl <em>Failure Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceModelImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureTraceModel()
		 * @generated
		 */
		EClass FAILURE_TRACE_MODEL = eINSTANCE.getFailureTraceModel();

		/**
		 * The meta object literal for the '<em><b>Propagate Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TRACE_MODEL__PROPAGATE_TRACES = eINSTANCE.getFailureTraceModel_PropagateTraces();

		/**
		 * The meta object literal for the '<em><b>Safety Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TRACE_MODEL__SAFETY_TRACES = eINSTANCE.getFailureTraceModel_SafetyTraces();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.RelatedToImpl <em>Related To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.RelatedToImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getRelatedTo()
		 * @generated
		 */
		EClass RELATED_TO = eINSTANCE.getRelatedTo();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_TO__ID = eINSTANCE.getRelatedTo_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_TO__NAME = eINSTANCE.getRelatedTo_Name();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_TO__ITEM = eINSTANCE.getRelatedTo_Item();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.PropagateToImpl <em>Propagate To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.PropagateToImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getPropagateTo()
		 * @generated
		 */
		EClass PROPAGATE_TO = eINSTANCE.getPropagateTo();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATE_TO__FAILURE = eINSTANCE.getPropagateTo_Failure();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.SafetyTraceabilityImpl <em>Safety Traceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.SafetyTraceabilityImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getSafetyTraceability()
		 * @generated
		 */
		EClass SAFETY_TRACEABILITY = eINSTANCE.getSafetyTraceability();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_TRACEABILITY__FAILURE = eINSTANCE.getSafetyTraceability_Failure();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ProcessImpl <em>Failure2 Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ProcessImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Process()
		 * @generated
		 */
		EClass FAILURE2_PROCESS = eINSTANCE.getFailure2Process();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_PROCESS__PROCESS = eINSTANCE.getFailure2Process_Process();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2RunnableImpl <em>Failure2 Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2RunnableImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Runnable()
		 * @generated
		 */
		EClass FAILURE2_RUNNABLE = eINSTANCE.getFailure2Runnable();

		/**
		 * The meta object literal for the '<em><b>Runnable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_RUNNABLE__RUNNABLE = eINSTANCE.getFailure2Runnable_Runnable();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2EventImpl <em>Failure2 Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2EventImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Event()
		 * @generated
		 */
		EClass FAILURE2_EVENT = eINSTANCE.getFailure2Event();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_EVENT__EVENT = eINSTANCE.getFailure2Event_Event();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2SemaphoreImpl <em>Failure2 Semaphore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2SemaphoreImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Semaphore()
		 * @generated
		 */
		EClass FAILURE2_SEMAPHORE = eINSTANCE.getFailure2Semaphore();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_SEMAPHORE__SEMAPHORE = eINSTANCE.getFailure2Semaphore_Semaphore();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2LabelImpl <em>Failure2 Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2LabelImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Label()
		 * @generated
		 */
		EClass FAILURE2_LABEL = eINSTANCE.getFailure2Label();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_LABEL__LABEL = eINSTANCE.getFailure2Label_Label();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ConstraintImpl <em>Failure2 Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ConstraintImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Constraint()
		 * @generated
		 */
		EClass FAILURE2_CONSTRAINT = eINSTANCE.getFailure2Constraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_CONSTRAINT__CONSTRAINT = eINSTANCE.getFailure2Constraint_Constraint();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ComponentImpl <em>Failure2 Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.Failure2ComponentImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailure2Component()
		 * @generated
		 */
		EClass FAILURE2_COMPONENT = eINSTANCE.getFailure2Component();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE2_COMPONENT__COMPONENT = eINSTANCE.getFailure2Component_Component();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2TaskImpl <em>Failure Model2 Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2TaskImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureModel2Task()
		 * @generated
		 */
		EClass FAILURE_MODEL2_TASK = eINSTANCE.getFailureModel2Task();

		/**
		 * The meta object literal for the '<em><b>Failure Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL2_TASK__FAILURE_MODEL = eINSTANCE.getFailureModel2Task_FailureModel();

		/**
		 * The meta object literal for the '<em><b>Runnable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL2_TASK__RUNNABLE = eINSTANCE.getFailureModel2Task_Runnable();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ConstraintsModelImpl <em>Failure Model2 Constraints Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ConstraintsModelImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureModel2ConstraintsModel()
		 * @generated
		 */
		EClass FAILURE_MODEL2_CONSTRAINTS_MODEL = eINSTANCE.getFailureModel2ConstraintsModel();

		/**
		 * The meta object literal for the '<em><b>Failure Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL = eINSTANCE.getFailureModel2ConstraintsModel_FailureModel();

		/**
		 * The meta object literal for the '<em><b>Constraints Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL = eINSTANCE.getFailureModel2ConstraintsModel_ConstraintsModel();

		/**
		 * The meta object literal for the '{@link com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ComponentImpl <em>Failure Model2 Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureModel2ComponentImpl
		 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl.FailureTraceMetaModelPackageImpl#getFailureModel2Component()
		 * @generated
		 */
		EClass FAILURE_MODEL2_COMPONENT = eINSTANCE.getFailureModel2Component();

		/**
		 * The meta object literal for the '<em><b>Failure Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL2_COMPONENT__FAILURE_MODEL = eINSTANCE.getFailureModel2Component_FailureModel();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL2_COMPONENT__COMPONENT = eINSTANCE.getFailureModel2Component_Component();

	}

} //FailureTraceMetaModelPackage
