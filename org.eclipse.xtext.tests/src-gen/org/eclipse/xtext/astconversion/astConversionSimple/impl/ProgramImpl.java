/**
 * generated by Xtext
 */
package org.eclipse.xtext.astconversion.astConversionSimple.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.astconversion.astConversionSimple.ActionNew;
import org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimplePackage;
import org.eclipse.xtext.astconversion.astConversionSimple.Entry;
import org.eclipse.xtext.astconversion.astConversionSimple.HoistingActionNew;
import org.eclipse.xtext.astconversion.astConversionSimple.HoistingAlternative;
import org.eclipse.xtext.astconversion.astConversionSimple.Lists;
import org.eclipse.xtext.astconversion.astConversionSimple.Program;
import org.eclipse.xtext.astconversion.astConversionSimple.ReturnsNewX;
import org.eclipse.xtext.astconversion.astConversionSimple.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getReturnsNew <em>Returns New</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getActionNew <em>Action New</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getHoistingAlternative <em>Hoisting Alternative</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ProgramImpl#getHoistingActionNew <em>Hoisting Action New</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected EList<Entry> entries;

  /**
   * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequence()
   * @generated
   * @ordered
   */
  protected EList<Sequence> sequence;

  /**
   * The cached value of the '{@link #getReturnsNew() <em>Returns New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnsNew()
   * @generated
   * @ordered
   */
  protected ReturnsNewX returnsNew;

  /**
   * The cached value of the '{@link #getActionNew() <em>Action New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionNew()
   * @generated
   * @ordered
   */
  protected ActionNew actionNew;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected Lists list;

  /**
   * The cached value of the '{@link #getHoistingAlternative() <em>Hoisting Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoistingAlternative()
   * @generated
   * @ordered
   */
  protected HoistingAlternative hoistingAlternative;

  /**
   * The cached value of the '{@link #getHoistingActionNew() <em>Hoisting Action New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoistingActionNew()
   * @generated
   * @ordered
   */
  protected HoistingActionNew hoistingActionNew;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AstConversionSimplePackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Entry> getEntries()
  {
    if (entries == null)
    {
      entries = new EObjectContainmentEList<Entry>(Entry.class, this, AstConversionSimplePackage.PROGRAM__ENTRIES);
    }
    return entries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sequence> getSequence()
  {
    if (sequence == null)
    {
      sequence = new EObjectContainmentEList<Sequence>(Sequence.class, this, AstConversionSimplePackage.PROGRAM__SEQUENCE);
    }
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReturnsNewX getReturnsNew()
  {
    return returnsNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnsNew(ReturnsNewX newReturnsNew, NotificationChain msgs)
  {
    ReturnsNewX oldReturnsNew = returnsNew;
    returnsNew = newReturnsNew;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__RETURNS_NEW, oldReturnsNew, newReturnsNew);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReturnsNew(ReturnsNewX newReturnsNew)
  {
    if (newReturnsNew != returnsNew)
    {
      NotificationChain msgs = null;
      if (returnsNew != null)
        msgs = ((InternalEObject)returnsNew).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__RETURNS_NEW, null, msgs);
      if (newReturnsNew != null)
        msgs = ((InternalEObject)newReturnsNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__RETURNS_NEW, null, msgs);
      msgs = basicSetReturnsNew(newReturnsNew, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__RETURNS_NEW, newReturnsNew, newReturnsNew));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionNew getActionNew()
  {
    return actionNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionNew(ActionNew newActionNew, NotificationChain msgs)
  {
    ActionNew oldActionNew = actionNew;
    actionNew = newActionNew;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__ACTION_NEW, oldActionNew, newActionNew);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActionNew(ActionNew newActionNew)
  {
    if (newActionNew != actionNew)
    {
      NotificationChain msgs = null;
      if (actionNew != null)
        msgs = ((InternalEObject)actionNew).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__ACTION_NEW, null, msgs);
      if (newActionNew != null)
        msgs = ((InternalEObject)newActionNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__ACTION_NEW, null, msgs);
      msgs = basicSetActionNew(newActionNew, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__ACTION_NEW, newActionNew, newActionNew));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lists getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(Lists newList, NotificationChain msgs)
  {
    Lists oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setList(Lists newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__LIST, newList, newList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoistingAlternative getHoistingAlternative()
  {
    return hoistingAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHoistingAlternative(HoistingAlternative newHoistingAlternative, NotificationChain msgs)
  {
    HoistingAlternative oldHoistingAlternative = hoistingAlternative;
    hoistingAlternative = newHoistingAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE, oldHoistingAlternative, newHoistingAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHoistingAlternative(HoistingAlternative newHoistingAlternative)
  {
    if (newHoistingAlternative != hoistingAlternative)
    {
      NotificationChain msgs = null;
      if (hoistingAlternative != null)
        msgs = ((InternalEObject)hoistingAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE, null, msgs);
      if (newHoistingAlternative != null)
        msgs = ((InternalEObject)newHoistingAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE, null, msgs);
      msgs = basicSetHoistingAlternative(newHoistingAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE, newHoistingAlternative, newHoistingAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoistingActionNew getHoistingActionNew()
  {
    return hoistingActionNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHoistingActionNew(HoistingActionNew newHoistingActionNew, NotificationChain msgs)
  {
    HoistingActionNew oldHoistingActionNew = hoistingActionNew;
    hoistingActionNew = newHoistingActionNew;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW, oldHoistingActionNew, newHoistingActionNew);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHoistingActionNew(HoistingActionNew newHoistingActionNew)
  {
    if (newHoistingActionNew != hoistingActionNew)
    {
      NotificationChain msgs = null;
      if (hoistingActionNew != null)
        msgs = ((InternalEObject)hoistingActionNew).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW, null, msgs);
      if (newHoistingActionNew != null)
        msgs = ((InternalEObject)newHoistingActionNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW, null, msgs);
      msgs = basicSetHoistingActionNew(newHoistingActionNew, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW, newHoistingActionNew, newHoistingActionNew));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AstConversionSimplePackage.PROGRAM__ENTRIES:
        return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
      case AstConversionSimplePackage.PROGRAM__SEQUENCE:
        return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
      case AstConversionSimplePackage.PROGRAM__RETURNS_NEW:
        return basicSetReturnsNew(null, msgs);
      case AstConversionSimplePackage.PROGRAM__ACTION_NEW:
        return basicSetActionNew(null, msgs);
      case AstConversionSimplePackage.PROGRAM__LIST:
        return basicSetList(null, msgs);
      case AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE:
        return basicSetHoistingAlternative(null, msgs);
      case AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW:
        return basicSetHoistingActionNew(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AstConversionSimplePackage.PROGRAM__ENTRIES:
        return getEntries();
      case AstConversionSimplePackage.PROGRAM__SEQUENCE:
        return getSequence();
      case AstConversionSimplePackage.PROGRAM__RETURNS_NEW:
        return getReturnsNew();
      case AstConversionSimplePackage.PROGRAM__ACTION_NEW:
        return getActionNew();
      case AstConversionSimplePackage.PROGRAM__LIST:
        return getList();
      case AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE:
        return getHoistingAlternative();
      case AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW:
        return getHoistingActionNew();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AstConversionSimplePackage.PROGRAM__ENTRIES:
        getEntries().clear();
        getEntries().addAll((Collection<? extends Entry>)newValue);
        return;
      case AstConversionSimplePackage.PROGRAM__SEQUENCE:
        getSequence().clear();
        getSequence().addAll((Collection<? extends Sequence>)newValue);
        return;
      case AstConversionSimplePackage.PROGRAM__RETURNS_NEW:
        setReturnsNew((ReturnsNewX)newValue);
        return;
      case AstConversionSimplePackage.PROGRAM__ACTION_NEW:
        setActionNew((ActionNew)newValue);
        return;
      case AstConversionSimplePackage.PROGRAM__LIST:
        setList((Lists)newValue);
        return;
      case AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE:
        setHoistingAlternative((HoistingAlternative)newValue);
        return;
      case AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW:
        setHoistingActionNew((HoistingActionNew)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AstConversionSimplePackage.PROGRAM__ENTRIES:
        getEntries().clear();
        return;
      case AstConversionSimplePackage.PROGRAM__SEQUENCE:
        getSequence().clear();
        return;
      case AstConversionSimplePackage.PROGRAM__RETURNS_NEW:
        setReturnsNew((ReturnsNewX)null);
        return;
      case AstConversionSimplePackage.PROGRAM__ACTION_NEW:
        setActionNew((ActionNew)null);
        return;
      case AstConversionSimplePackage.PROGRAM__LIST:
        setList((Lists)null);
        return;
      case AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE:
        setHoistingAlternative((HoistingAlternative)null);
        return;
      case AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW:
        setHoistingActionNew((HoistingActionNew)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AstConversionSimplePackage.PROGRAM__ENTRIES:
        return entries != null && !entries.isEmpty();
      case AstConversionSimplePackage.PROGRAM__SEQUENCE:
        return sequence != null && !sequence.isEmpty();
      case AstConversionSimplePackage.PROGRAM__RETURNS_NEW:
        return returnsNew != null;
      case AstConversionSimplePackage.PROGRAM__ACTION_NEW:
        return actionNew != null;
      case AstConversionSimplePackage.PROGRAM__LIST:
        return list != null;
      case AstConversionSimplePackage.PROGRAM__HOISTING_ALTERNATIVE:
        return hoistingAlternative != null;
      case AstConversionSimplePackage.PROGRAM__HOISTING_ACTION_NEW:
        return hoistingActionNew != null;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
