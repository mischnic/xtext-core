/**
 * generated by Xtext
 */
package org.eclipse.xtext.astconversion.astConversionSimple;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimpleFactory
 * @model kind="package"
 * @generated
 */
public interface AstConversionSimplePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "astConversionSimple";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/ASTConversionSimple";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "astConversionSimple";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AstConversionSimplePackage eINSTANCE = org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.EntryImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__NAME = 0;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoClassImpl <em>Auto Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoClassImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getAutoClass()
   * @generated
   */
  int AUTO_CLASS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_CLASS__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_CLASS__REF = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Auto Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_CLASS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoExplicitClassImpl <em>Auto Explicit Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoExplicitClassImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getAutoExplicitClass()
   * @generated
   */
  int AUTO_EXPLICIT_CLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_EXPLICIT_CLASS__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_EXPLICIT_CLASS__REF = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Auto Explicit Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_EXPLICIT_CLASS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ManualClassImpl <em>Manual Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ManualClassImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getManualClass()
   * @generated
   */
  int MANUAL_CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_CLASS__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_CLASS__REF = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manual Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_CLASS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomASTClassImpl <em>Custom AST Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomASTClassImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getCustomASTClass()
   * @generated
   */
  int CUSTOM_AST_CLASS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_AST_CLASS__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_AST_CLASS__REF = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom AST Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_AST_CLASS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomCopyASTClassImpl <em>Custom Copy AST Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomCopyASTClassImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getCustomCopyASTClass()
   * @generated
   */
  int CUSTOM_COPY_AST_CLASS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COPY_AST_CLASS__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COPY_AST_CLASS__REF = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Copy AST Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COPY_AST_CLASS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.OtherImpl <em>Other</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.OtherImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getOther()
   * @generated
   */
  int OTHER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER__CONTENT = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Other</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ElementImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE = ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__VALUE = ENTRY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ReferenceImpl
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind <em>Change Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind
   * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getChangeKind()
   * @generated
   */
  int CHANGE_KIND = 10;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.astconversion.astConversionSimple.Program#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Program#getEntries()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Entries();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.astconversion.astConversionSimple.Entry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Entry#getName()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.AutoClass <em>Auto Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Class</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.AutoClass
   * @generated
   */
  EClass getAutoClass();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.astconversion.astConversionSimple.AutoClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.AutoClass#getRef()
   * @see #getAutoClass()
   * @generated
   */
  EReference getAutoClass_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.AutoExplicitClass <em>Auto Explicit Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Explicit Class</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.AutoExplicitClass
   * @generated
   */
  EClass getAutoExplicitClass();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.astconversion.astConversionSimple.AutoExplicitClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.AutoExplicitClass#getRef()
   * @see #getAutoExplicitClass()
   * @generated
   */
  EReference getAutoExplicitClass_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.ManualClass <em>Manual Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manual Class</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.ManualClass
   * @generated
   */
  EClass getManualClass();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.astconversion.astConversionSimple.ManualClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.ManualClass#getRef()
   * @see #getManualClass()
   * @generated
   */
  EReference getManualClass_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.CustomASTClass <em>Custom AST Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom AST Class</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.CustomASTClass
   * @generated
   */
  EClass getCustomASTClass();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.astconversion.astConversionSimple.CustomASTClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.CustomASTClass#getRef()
   * @see #getCustomASTClass()
   * @generated
   */
  EReference getCustomASTClass_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.CustomCopyASTClass <em>Custom Copy AST Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Copy AST Class</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.CustomCopyASTClass
   * @generated
   */
  EClass getCustomCopyASTClass();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.astconversion.astConversionSimple.CustomCopyASTClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.CustomCopyASTClass#getRef()
   * @see #getCustomCopyASTClass()
   * @generated
   */
  EReference getCustomCopyASTClass_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.Other <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Other
   * @generated
   */
  EClass getOther();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.astconversion.astConversionSimple.Other#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Other#getContent()
   * @see #getOther()
   * @generated
   */
  EReference getOther_Content();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.astconversion.astConversionSimple.Element#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Element#getType()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.astconversion.astConversionSimple.Element#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Element#getValue()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.astconversion.astConversionSimple.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.astconversion.astConversionSimple.Reference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.Reference#getName()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Name();

  /**
   * Returns the meta object for enum '{@link org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind <em>Change Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Change Kind</em>'.
   * @see org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind
   * @generated
   */
  EEnum getChangeKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AstConversionSimpleFactory getAstConversionSimpleFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ENTRIES = eINSTANCE.getProgram_Entries();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.EntryImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRY__NAME = eINSTANCE.getEntry_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoClassImpl <em>Auto Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoClassImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getAutoClass()
     * @generated
     */
    EClass AUTO_CLASS = eINSTANCE.getAutoClass();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTO_CLASS__REF = eINSTANCE.getAutoClass_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoExplicitClassImpl <em>Auto Explicit Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AutoExplicitClassImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getAutoExplicitClass()
     * @generated
     */
    EClass AUTO_EXPLICIT_CLASS = eINSTANCE.getAutoExplicitClass();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTO_EXPLICIT_CLASS__REF = eINSTANCE.getAutoExplicitClass_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ManualClassImpl <em>Manual Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ManualClassImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getManualClass()
     * @generated
     */
    EClass MANUAL_CLASS = eINSTANCE.getManualClass();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANUAL_CLASS__REF = eINSTANCE.getManualClass_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomASTClassImpl <em>Custom AST Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomASTClassImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getCustomASTClass()
     * @generated
     */
    EClass CUSTOM_AST_CLASS = eINSTANCE.getCustomASTClass();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_AST_CLASS__REF = eINSTANCE.getCustomASTClass_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomCopyASTClassImpl <em>Custom Copy AST Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.CustomCopyASTClassImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getCustomCopyASTClass()
     * @generated
     */
    EClass CUSTOM_COPY_AST_CLASS = eINSTANCE.getCustomCopyASTClass();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COPY_AST_CLASS__REF = eINSTANCE.getCustomCopyASTClass_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.OtherImpl <em>Other</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.OtherImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getOther()
     * @generated
     */
    EClass OTHER = eINSTANCE.getOther();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER__CONTENT = eINSTANCE.getOther_Content();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ElementImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.ReferenceImpl
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind <em>Change Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.astconversion.astConversionSimple.ChangeKind
     * @see org.eclipse.xtext.astconversion.astConversionSimple.impl.AstConversionSimplePackageImpl#getChangeKind()
     * @generated
     */
    EEnum CHANGE_KIND = eINSTANCE.getChangeKind();

  }

} //AstConversionSimplePackage
