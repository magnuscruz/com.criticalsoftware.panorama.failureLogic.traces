/**
 */
package com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.impl;

import com.criticalsoftware.panorama.base.BasePackage;

import com.criticalsoftware.panorama.failureLogic.FailureLogicPackage;

import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Component;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Constraint;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Event;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Label;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Process;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Runnable;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.Failure2Semaphore;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Component;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2ConstraintsModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureModel2Task;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelFactory;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.GenericTraceModel;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.PropagateTo;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.RelatedTo;
import com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.SafetyTraceability;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureTraceMetaModelPackageImpl extends EPackageImpl implements FailureTraceMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTraceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureTraceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagateToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyTraceabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2ProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2RunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2EventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2SemaphoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2LabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2ConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failure2ComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModel2TaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModel2ConstraintsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModel2ComponentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.criticalsoftware.panorama.failurelogic.FailureTraceMetaModel.FailureTraceMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FailureTraceMetaModelPackageImpl() {
		super(eNS_URI, FailureTraceMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FailureTraceMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FailureTraceMetaModelPackage init() {
		if (isInited) return (FailureTraceMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(FailureTraceMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFailureTraceMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FailureTraceMetaModelPackageImpl theFailureTraceMetaModelPackage = registeredFailureTraceMetaModelPackage instanceof FailureTraceMetaModelPackageImpl ? (FailureTraceMetaModelPackageImpl)registeredFailureTraceMetaModelPackage : new FailureTraceMetaModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		FailureLogicPackage.eINSTANCE.eClass();
		AmaltheaPackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFailureTraceMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theFailureTraceMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFailureTraceMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FailureTraceMetaModelPackage.eNS_URI, theFailureTraceMetaModelPackage);
		return theFailureTraceMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTraceModel() {
		return genericTraceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTraceModel_Traces() {
		return (EReference)genericTraceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureTraceModel() {
		return failureTraceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureTraceModel_PropagateTraces() {
		return (EReference)failureTraceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureTraceModel_SafetyTraces() {
		return (EReference)failureTraceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedTo() {
		return relatedToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatedTo_ID() {
		return (EAttribute)relatedToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatedTo_Name() {
		return (EAttribute)relatedToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedTo_Item() {
		return (EReference)relatedToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagateTo() {
		return propagateToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagateTo_Failure() {
		return (EReference)propagateToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyTraceability() {
		return safetyTraceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSafetyTraceability_Failure() {
		return (EReference)safetyTraceabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Process() {
		return failure2ProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Process_Process() {
		return (EReference)failure2ProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Runnable() {
		return failure2RunnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Runnable_Runnable() {
		return (EReference)failure2RunnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Event() {
		return failure2EventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Event_Event() {
		return (EReference)failure2EventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Semaphore() {
		return failure2SemaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Semaphore_Semaphore() {
		return (EReference)failure2SemaphoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Label() {
		return failure2LabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Label_Label() {
		return (EReference)failure2LabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Constraint() {
		return failure2ConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Constraint_Constraint() {
		return (EReference)failure2ConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure2Component() {
		return failure2ComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure2Component_Component() {
		return (EReference)failure2ComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModel2Task() {
		return failureModel2TaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel2Task_FailureModel() {
		return (EReference)failureModel2TaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel2Task_Runnable() {
		return (EReference)failureModel2TaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModel2ConstraintsModel() {
		return failureModel2ConstraintsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel2ConstraintsModel_FailureModel() {
		return (EReference)failureModel2ConstraintsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel2ConstraintsModel_ConstraintsModel() {
		return (EReference)failureModel2ConstraintsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModel2Component() {
		return failureModel2ComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel2Component_FailureModel() {
		return (EReference)failureModel2ComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel2Component_Component() {
		return (EReference)failureModel2ComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTraceMetaModelFactory getFailureTraceMetaModelFactory() {
		return (FailureTraceMetaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		genericTraceModelEClass = createEClass(GENERIC_TRACE_MODEL);
		createEReference(genericTraceModelEClass, GENERIC_TRACE_MODEL__TRACES);

		failureTraceModelEClass = createEClass(FAILURE_TRACE_MODEL);
		createEReference(failureTraceModelEClass, FAILURE_TRACE_MODEL__PROPAGATE_TRACES);
		createEReference(failureTraceModelEClass, FAILURE_TRACE_MODEL__SAFETY_TRACES);

		relatedToEClass = createEClass(RELATED_TO);
		createEAttribute(relatedToEClass, RELATED_TO__ID);
		createEAttribute(relatedToEClass, RELATED_TO__NAME);
		createEReference(relatedToEClass, RELATED_TO__ITEM);

		propagateToEClass = createEClass(PROPAGATE_TO);
		createEReference(propagateToEClass, PROPAGATE_TO__FAILURE);

		safetyTraceabilityEClass = createEClass(SAFETY_TRACEABILITY);
		createEReference(safetyTraceabilityEClass, SAFETY_TRACEABILITY__FAILURE);

		failure2ProcessEClass = createEClass(FAILURE2_PROCESS);
		createEReference(failure2ProcessEClass, FAILURE2_PROCESS__PROCESS);

		failure2RunnableEClass = createEClass(FAILURE2_RUNNABLE);
		createEReference(failure2RunnableEClass, FAILURE2_RUNNABLE__RUNNABLE);

		failure2EventEClass = createEClass(FAILURE2_EVENT);
		createEReference(failure2EventEClass, FAILURE2_EVENT__EVENT);

		failure2SemaphoreEClass = createEClass(FAILURE2_SEMAPHORE);
		createEReference(failure2SemaphoreEClass, FAILURE2_SEMAPHORE__SEMAPHORE);

		failure2LabelEClass = createEClass(FAILURE2_LABEL);
		createEReference(failure2LabelEClass, FAILURE2_LABEL__LABEL);

		failure2ConstraintEClass = createEClass(FAILURE2_CONSTRAINT);
		createEReference(failure2ConstraintEClass, FAILURE2_CONSTRAINT__CONSTRAINT);

		failure2ComponentEClass = createEClass(FAILURE2_COMPONENT);
		createEReference(failure2ComponentEClass, FAILURE2_COMPONENT__COMPONENT);

		failureModel2TaskEClass = createEClass(FAILURE_MODEL2_TASK);
		createEReference(failureModel2TaskEClass, FAILURE_MODEL2_TASK__FAILURE_MODEL);
		createEReference(failureModel2TaskEClass, FAILURE_MODEL2_TASK__RUNNABLE);

		failureModel2ConstraintsModelEClass = createEClass(FAILURE_MODEL2_CONSTRAINTS_MODEL);
		createEReference(failureModel2ConstraintsModelEClass, FAILURE_MODEL2_CONSTRAINTS_MODEL__FAILURE_MODEL);
		createEReference(failureModel2ConstraintsModelEClass, FAILURE_MODEL2_CONSTRAINTS_MODEL__CONSTRAINTS_MODEL);

		failureModel2ComponentEClass = createEClass(FAILURE_MODEL2_COMPONENT);
		createEReference(failureModel2ComponentEClass, FAILURE_MODEL2_COMPONENT__FAILURE_MODEL);
		createEReference(failureModel2ComponentEClass, FAILURE_MODEL2_COMPONENT__COMPONENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		FailureLogicPackage theFailureLogicPackage = (FailureLogicPackage)EPackage.Registry.INSTANCE.getEPackage(FailureLogicPackage.eNS_URI);
		AmaltheaPackage theAmaltheaPackage = (AmaltheaPackage)EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failureTraceModelEClass.getESuperTypes().add(this.getGenericTraceModel());
		propagateToEClass.getESuperTypes().add(this.getRelatedTo());
		failure2ProcessEClass.getESuperTypes().add(this.getSafetyTraceability());
		failure2RunnableEClass.getESuperTypes().add(this.getSafetyTraceability());
		failure2EventEClass.getESuperTypes().add(this.getSafetyTraceability());
		failure2SemaphoreEClass.getESuperTypes().add(this.getSafetyTraceability());
		failure2LabelEClass.getESuperTypes().add(this.getSafetyTraceability());
		failure2ConstraintEClass.getESuperTypes().add(this.getSafetyTraceability());
		failure2ComponentEClass.getESuperTypes().add(this.getSafetyTraceability());
		failureModel2TaskEClass.getESuperTypes().add(this.getSafetyTraceability());
		failureModel2ConstraintsModelEClass.getESuperTypes().add(this.getSafetyTraceability());
		failureModel2ComponentEClass.getESuperTypes().add(this.getSafetyTraceability());

		// Initialize classes, features, and operations; add parameters
		initEClass(genericTraceModelEClass, GenericTraceModel.class, "GenericTraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTraceModel_Traces(), this.getRelatedTo(), null, "traces", null, 0, -1, GenericTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureTraceModelEClass, FailureTraceModel.class, "FailureTraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureTraceModel_PropagateTraces(), this.getPropagateTo(), null, "propagateTraces", null, 0, -1, FailureTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureTraceModel_SafetyTraces(), this.getSafetyTraceability(), null, "safetyTraces", null, 0, -1, FailureTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedToEClass, RelatedTo.class, "RelatedTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatedTo_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, RelatedTo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatedTo_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedTo_Item(), theEcorePackage.getEObject(), null, "item", null, 0, -1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagateToEClass, PropagateTo.class, "PropagateTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagateTo_Failure(), theFailureLogicPackage.getFailure(), null, "failure", null, 1, 1, PropagateTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyTraceabilityEClass, SafetyTraceability.class, "SafetyTraceability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyTraceability_Failure(), theFailureLogicPackage.getFailure(), null, "failure", null, 1, 1, SafetyTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2ProcessEClass, Failure2Process.class, "Failure2Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Process_Process(), theAmaltheaPackage.getAbstractProcess(), null, "process", null, 1, 1, Failure2Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2RunnableEClass, Failure2Runnable.class, "Failure2Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Runnable_Runnable(), theAmaltheaPackage.getRunnable(), null, "runnable", null, 1, 1, Failure2Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2EventEClass, Failure2Event.class, "Failure2Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Event_Event(), theAmaltheaPackage.getOsEvent(), null, "event", null, 1, 1, Failure2Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2SemaphoreEClass, Failure2Semaphore.class, "Failure2Semaphore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Semaphore_Semaphore(), theAmaltheaPackage.getSemaphore(), null, "semaphore", null, 1, 1, Failure2Semaphore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2LabelEClass, Failure2Label.class, "Failure2Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Label_Label(), theAmaltheaPackage.getLabel(), null, "label", null, 1, 1, Failure2Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2ConstraintEClass, Failure2Constraint.class, "Failure2Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Constraint_Constraint(), theAmaltheaPackage.getAffinityConstraint(), null, "constraint", null, 1, 1, Failure2Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failure2ComponentEClass, Failure2Component.class, "Failure2Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailure2Component_Component(), theAmaltheaPackage.getComponentInstance(), null, "component", null, 1, 1, Failure2Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModel2TaskEClass, FailureModel2Task.class, "FailureModel2Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModel2Task_FailureModel(), theFailureLogicPackage.getFailureModel(), null, "failureModel", null, 1, 1, FailureModel2Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModel2Task_Runnable(), theAmaltheaPackage.getComponentInstance(), null, "runnable", null, 1, 1, FailureModel2Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModel2ConstraintsModelEClass, FailureModel2ConstraintsModel.class, "FailureModel2ConstraintsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModel2ConstraintsModel_FailureModel(), theFailureLogicPackage.getFailureModel(), null, "failureModel", null, 1, 1, FailureModel2ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModel2ConstraintsModel_ConstraintsModel(), theAmaltheaPackage.getConstraintsModel(), null, "constraintsModel", null, 1, 1, FailureModel2ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModel2ComponentEClass, FailureModel2Component.class, "FailureModel2Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModel2Component_FailureModel(), theFailureLogicPackage.getFailureModel(), null, "failureModel", null, 1, 1, FailureModel2Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModel2Component_Component(), theAmaltheaPackage.getComponentInstance(), null, "component", null, 1, 1, FailureModel2Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FailureTraceMetaModelPackageImpl
