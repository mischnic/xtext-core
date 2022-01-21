/**
 * generated by Xtext
 */
package org.eclipse.xtext.astconversion.astConversionSimple.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.astconversion.astConversionSimple.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstConversionSimpleFactoryImpl extends EFactoryImpl implements AstConversionSimpleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AstConversionSimpleFactory init()
  {
    try
    {
      AstConversionSimpleFactory theAstConversionSimpleFactory = (AstConversionSimpleFactory)EPackage.Registry.INSTANCE.getEFactory(AstConversionSimplePackage.eNS_URI);
      if (theAstConversionSimpleFactory != null)
      {
        return theAstConversionSimpleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AstConversionSimpleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstConversionSimpleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AstConversionSimplePackage.PROGRAM: return createProgram();
      case AstConversionSimplePackage.ENTRY: return createEntry();
      case AstConversionSimplePackage.AUTO_CLASS: return createAutoClass();
      case AstConversionSimplePackage.AUTO_EXPLICIT_CLASS: return createAutoExplicitClass();
      case AstConversionSimplePackage.MANUAL_CLASS: return createManualClass();
      case AstConversionSimplePackage.CUSTOM_AST_CLASS: return createCustomASTClass();
      case AstConversionSimplePackage.CUSTOM_COPY_AST_CLASS: return createCustomCopyASTClass();
      case AstConversionSimplePackage.REFERENCE: return createReference();
      case AstConversionSimplePackage.OTHER: return createOther();
      case AstConversionSimplePackage.ELEMENT: return createElement();
      case AstConversionSimplePackage.SEQUENCE: return createSequence();
      case AstConversionSimplePackage.ADDITION: return createAddition();
      case AstConversionSimplePackage.RETURNS_NEW_X: return createReturnsNewX();
      case AstConversionSimplePackage.ACTION_NEW: return createActionNew();
      case AstConversionSimplePackage.LISTS: return createLists();
      case AstConversionSimplePackage.MAP_ENTRY: return createMapEntry();
      case AstConversionSimplePackage.MAP_ENTRY_CUSTOM: return createMapEntryCustom();
      case AstConversionSimplePackage.MAP_ENTRY_CUSTOM2: return createMapEntryCustom2();
      case AstConversionSimplePackage.HOISTING_ALTERNATIVE: return createHoistingAlternative();
      case AstConversionSimplePackage.X: return createX();
      case AstConversionSimplePackage.Y: return createY();
      case AstConversionSimplePackage.HOISTING_ACTION_NEW: return createHoistingActionNew();
      case AstConversionSimplePackage.ACTION_NEW_X: return createActionNewX();
      case AstConversionSimplePackage.HOISTING_ACTION_NEW_X: return createHoistingActionNewX();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AstConversionSimplePackage.CHANGE_KIND:
        return createChangeKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AstConversionSimplePackage.CHANGE_KIND:
        return convertChangeKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entry createEntry()
  {
    EntryImpl entry = new EntryImpl();
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AutoClass createAutoClass()
  {
    AutoClassImpl autoClass = new AutoClassImpl();
    return autoClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AutoExplicitClass createAutoExplicitClass()
  {
    AutoExplicitClassImpl autoExplicitClass = new AutoExplicitClassImpl();
    return autoExplicitClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ManualClass createManualClass()
  {
    ManualClassImpl manualClass = new ManualClassImpl();
    return manualClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomASTClass createCustomASTClass()
  {
    CustomASTClassImpl customASTClass = new CustomASTClassImpl();
    return customASTClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomCopyASTClass createCustomCopyASTClass()
  {
    CustomCopyASTClassImpl customCopyASTClass = new CustomCopyASTClassImpl();
    return customCopyASTClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Other createOther()
  {
    OtherImpl other = new OtherImpl();
    return other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReturnsNewX createReturnsNewX()
  {
    ReturnsNewXImpl returnsNewX = new ReturnsNewXImpl();
    return returnsNewX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionNew createActionNew()
  {
    ActionNewImpl actionNew = new ActionNewImpl();
    return actionNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lists createLists()
  {
    ListsImpl lists = new ListsImpl();
    return lists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapEntry createMapEntry()
  {
    MapEntryImpl mapEntry = new MapEntryImpl();
    return mapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapEntryCustom createMapEntryCustom()
  {
    MapEntryCustomImpl mapEntryCustom = new MapEntryCustomImpl();
    return mapEntryCustom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapEntryCustom2 createMapEntryCustom2()
  {
    MapEntryCustom2Impl mapEntryCustom2 = new MapEntryCustom2Impl();
    return mapEntryCustom2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoistingAlternative createHoistingAlternative()
  {
    HoistingAlternativeImpl hoistingAlternative = new HoistingAlternativeImpl();
    return hoistingAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public X createX()
  {
    XImpl x = new XImpl();
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Y createY()
  {
    YImpl y = new YImpl();
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoistingActionNew createHoistingActionNew()
  {
    HoistingActionNewImpl hoistingActionNew = new HoistingActionNewImpl();
    return hoistingActionNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionNewX createActionNewX()
  {
    ActionNewXImpl actionNewX = new ActionNewXImpl();
    return actionNewX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoistingActionNewX createHoistingActionNewX()
  {
    HoistingActionNewXImpl hoistingActionNewX = new HoistingActionNewXImpl();
    return hoistingActionNewX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeKind createChangeKindFromString(EDataType eDataType, String initialValue)
  {
    ChangeKind result = ChangeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AstConversionSimplePackage getAstConversionSimplePackage()
  {
    return (AstConversionSimplePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AstConversionSimplePackage getPackage()
  {
    return AstConversionSimplePackage.eINSTANCE;
  }

} //AstConversionSimpleFactoryImpl
