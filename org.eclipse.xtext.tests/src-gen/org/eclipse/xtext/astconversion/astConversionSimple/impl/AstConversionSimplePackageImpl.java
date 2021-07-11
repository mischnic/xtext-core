/**
 * generated by Xtext
 */
package org.eclipse.xtext.astconversion.astConversionSimple.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.astconversion.astConversionSimple.Addition;
import org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimpleFactory;
import org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimplePackage;
import org.eclipse.xtext.astconversion.astConversionSimple.AutoClass;
import org.eclipse.xtext.astconversion.astConversionSimple.AutoExplicitClass;
import org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind;
import org.eclipse.xtext.astconversion.astConversionSimple.CustomASTClass;
import org.eclipse.xtext.astconversion.astConversionSimple.CustomCopyASTClass;
import org.eclipse.xtext.astconversion.astConversionSimple.Element;
import org.eclipse.xtext.astconversion.astConversionSimple.Entry;
import org.eclipse.xtext.astconversion.astConversionSimple.ManualClass;
import org.eclipse.xtext.astconversion.astConversionSimple.Other;
import org.eclipse.xtext.astconversion.astConversionSimple.Program;
import org.eclipse.xtext.astconversion.astConversionSimple.Reference;
import org.eclipse.xtext.astconversion.astConversionSimple.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstConversionSimplePackageImpl extends EPackageImpl implements AstConversionSimplePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autoClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autoExplicitClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manualClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customASTClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customCopyASTClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum changeKindEEnum = null;

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
   * @see org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimplePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AstConversionSimplePackageImpl()
  {
    super(eNS_URI, AstConversionSimpleFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AstConversionSimplePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AstConversionSimplePackage init()
  {
    if (isInited) return (AstConversionSimplePackage)EPackage.Registry.INSTANCE.getEPackage(AstConversionSimplePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredAstConversionSimplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    AstConversionSimplePackageImpl theAstConversionSimplePackage = registeredAstConversionSimplePackage instanceof AstConversionSimplePackageImpl ? (AstConversionSimplePackageImpl)registeredAstConversionSimplePackage : new AstConversionSimplePackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAstConversionSimplePackage.createPackageContents();

    // Initialize created meta-data
    theAstConversionSimplePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAstConversionSimplePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AstConversionSimplePackage.eNS_URI, theAstConversionSimplePackage);
    return theAstConversionSimplePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProgram_Entries()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProgram_Sequence()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntry()
  {
    return entryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEntry_Name()
  {
    return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAutoClass()
  {
    return autoClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAutoClass_Ref()
  {
    return (EReference)autoClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAutoExplicitClass()
  {
    return autoExplicitClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAutoExplicitClass_Ref()
  {
    return (EReference)autoExplicitClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getManualClass()
  {
    return manualClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getManualClass_Ref()
  {
    return (EReference)manualClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCustomASTClass()
  {
    return customASTClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCustomASTClass_Ref()
  {
    return (EReference)customASTClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCustomCopyASTClass()
  {
    return customCopyASTClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCustomCopyASTClass_Ref()
  {
    return (EReference)customCopyASTClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReference_Name()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOther()
  {
    return otherEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOther_Content()
  {
    return (EReference)otherEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getElement_Type()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getElement_Value()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSequence_Expressions()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAddition()
  {
    return additionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAddition_Left()
  {
    return (EAttribute)additionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAddition_Right()
  {
    return (EAttribute)additionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getChangeKind()
  {
    return changeKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AstConversionSimpleFactory getAstConversionSimpleFactory()
  {
    return (AstConversionSimpleFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__ENTRIES);
    createEReference(programEClass, PROGRAM__SEQUENCE);

    entryEClass = createEClass(ENTRY);
    createEAttribute(entryEClass, ENTRY__NAME);

    autoClassEClass = createEClass(AUTO_CLASS);
    createEReference(autoClassEClass, AUTO_CLASS__REF);

    autoExplicitClassEClass = createEClass(AUTO_EXPLICIT_CLASS);
    createEReference(autoExplicitClassEClass, AUTO_EXPLICIT_CLASS__REF);

    manualClassEClass = createEClass(MANUAL_CLASS);
    createEReference(manualClassEClass, MANUAL_CLASS__REF);

    customASTClassEClass = createEClass(CUSTOM_AST_CLASS);
    createEReference(customASTClassEClass, CUSTOM_AST_CLASS__REF);

    customCopyASTClassEClass = createEClass(CUSTOM_COPY_AST_CLASS);
    createEReference(customCopyASTClassEClass, CUSTOM_COPY_AST_CLASS__REF);

    referenceEClass = createEClass(REFERENCE);
    createEAttribute(referenceEClass, REFERENCE__NAME);

    otherEClass = createEClass(OTHER);
    createEReference(otherEClass, OTHER__CONTENT);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__TYPE);
    createEAttribute(elementEClass, ELEMENT__VALUE);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__EXPRESSIONS);

    additionEClass = createEClass(ADDITION);
    createEAttribute(additionEClass, ADDITION__LEFT);
    createEAttribute(additionEClass, ADDITION__RIGHT);

    // Create enums
    changeKindEEnum = createEEnum(CHANGE_KIND);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    autoClassEClass.getESuperTypes().add(this.getEntry());
    autoExplicitClassEClass.getESuperTypes().add(this.getEntry());
    manualClassEClass.getESuperTypes().add(this.getEntry());
    customASTClassEClass.getESuperTypes().add(this.getEntry());
    customCopyASTClassEClass.getESuperTypes().add(this.getEntry());
    otherEClass.getESuperTypes().add(this.getEntry());
    elementEClass.getESuperTypes().add(this.getEntry());
    additionEClass.getESuperTypes().add(this.getSequence());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Entries(), this.getEntry(), null, "entries", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Sequence(), this.getSequence(), null, "sequence", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntry_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(autoClassEClass, AutoClass.class, "AutoClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAutoClass_Ref(), this.getReference(), null, "ref", null, 0, 1, AutoClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(autoExplicitClassEClass, AutoExplicitClass.class, "AutoExplicitClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAutoExplicitClass_Ref(), this.getReference(), null, "ref", null, 0, 1, AutoExplicitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manualClassEClass, ManualClass.class, "ManualClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getManualClass_Ref(), this.getReference(), null, "ref", null, 0, 1, ManualClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customASTClassEClass, CustomASTClass.class, "CustomASTClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomASTClass_Ref(), this.getReference(), null, "ref", null, 0, 1, CustomASTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customCopyASTClassEClass, CustomCopyASTClass.class, "CustomCopyASTClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomCopyASTClass_Ref(), this.getReference(), null, "ref", null, 0, 1, CustomCopyASTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReference_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherEClass, Other.class, "Other", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOther_Content(), theEcorePackage.getEObject(), null, "content", null, 0, 1, Other.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Type(), this.getChangeKind(), "type", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_Value(), this.getChangeKind(), "value", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_Expressions(), this.getSequence(), null, "expressions", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddition_Left(), theEcorePackage.getEString(), "left", null, 0, 1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddition_Right(), theEcorePackage.getEString(), "right", null, 0, 1, Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(changeKindEEnum, ChangeKind.class, "ChangeKind");
    addEEnumLiteral(changeKindEEnum, ChangeKind.ADD);
    addEEnumLiteral(changeKindEEnum, ChangeKind.MOVE);
    addEEnumLiteral(changeKindEEnum, ChangeKind.REMOVE);

    // Create resource
    createResource(eNS_URI);
  }

} //AstConversionSimplePackageImpl
