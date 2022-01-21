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

import org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimplePackage;
import org.eclipse.xtext.astconversion.astConversionSimple.Lists;
import org.eclipse.xtext.astconversion.astConversionSimple.MapEntry;
import org.eclipse.xtext.astconversion.astConversionSimple.MapEntryCustom;
import org.eclipse.xtext.astconversion.astConversionSimple.MapEntryCustom2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ListsImpl#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ListsImpl#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ListsImpl#getC <em>C</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ListsImpl#getD <em>D</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.ListsImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListsImpl extends MinimalEObjectImpl.Container implements Lists
{
  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected MapEntry a;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected MapEntryCustom b;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected EList<MapEntry> c;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected EList<MapEntryCustom> d;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected MapEntryCustom2 e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListsImpl()
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
    return AstConversionSimplePackage.Literals.LISTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapEntry getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(MapEntry newA, NotificationChain msgs)
  {
    MapEntry oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.LISTS__A, oldA, newA);
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
  public void setA(MapEntry newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.LISTS__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.LISTS__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.LISTS__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapEntryCustom getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(MapEntryCustom newB, NotificationChain msgs)
  {
    MapEntryCustom oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.LISTS__B, oldB, newB);
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
  public void setB(MapEntryCustom newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.LISTS__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.LISTS__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.LISTS__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MapEntry> getC()
  {
    if (c == null)
    {
      c = new EObjectContainmentEList<MapEntry>(MapEntry.class, this, AstConversionSimplePackage.LISTS__C);
    }
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MapEntryCustom> getD()
  {
    if (d == null)
    {
      d = new EObjectContainmentEList<MapEntryCustom>(MapEntryCustom.class, this, AstConversionSimplePackage.LISTS__D);
    }
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapEntryCustom2 getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(MapEntryCustom2 newE, NotificationChain msgs)
  {
    MapEntryCustom2 oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.LISTS__E, oldE, newE);
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
  public void setE(MapEntryCustom2 newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.LISTS__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstConversionSimplePackage.LISTS__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.LISTS__E, newE, newE));
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
      case AstConversionSimplePackage.LISTS__A:
        return basicSetA(null, msgs);
      case AstConversionSimplePackage.LISTS__B:
        return basicSetB(null, msgs);
      case AstConversionSimplePackage.LISTS__C:
        return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
      case AstConversionSimplePackage.LISTS__D:
        return ((InternalEList<?>)getD()).basicRemove(otherEnd, msgs);
      case AstConversionSimplePackage.LISTS__E:
        return basicSetE(null, msgs);
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
      case AstConversionSimplePackage.LISTS__A:
        return getA();
      case AstConversionSimplePackage.LISTS__B:
        return getB();
      case AstConversionSimplePackage.LISTS__C:
        return getC();
      case AstConversionSimplePackage.LISTS__D:
        return getD();
      case AstConversionSimplePackage.LISTS__E:
        return getE();
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
      case AstConversionSimplePackage.LISTS__A:
        setA((MapEntry)newValue);
        return;
      case AstConversionSimplePackage.LISTS__B:
        setB((MapEntryCustom)newValue);
        return;
      case AstConversionSimplePackage.LISTS__C:
        getC().clear();
        getC().addAll((Collection<? extends MapEntry>)newValue);
        return;
      case AstConversionSimplePackage.LISTS__D:
        getD().clear();
        getD().addAll((Collection<? extends MapEntryCustom>)newValue);
        return;
      case AstConversionSimplePackage.LISTS__E:
        setE((MapEntryCustom2)newValue);
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
      case AstConversionSimplePackage.LISTS__A:
        setA((MapEntry)null);
        return;
      case AstConversionSimplePackage.LISTS__B:
        setB((MapEntryCustom)null);
        return;
      case AstConversionSimplePackage.LISTS__C:
        getC().clear();
        return;
      case AstConversionSimplePackage.LISTS__D:
        getD().clear();
        return;
      case AstConversionSimplePackage.LISTS__E:
        setE((MapEntryCustom2)null);
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
      case AstConversionSimplePackage.LISTS__A:
        return a != null;
      case AstConversionSimplePackage.LISTS__B:
        return b != null;
      case AstConversionSimplePackage.LISTS__C:
        return c != null && !c.isEmpty();
      case AstConversionSimplePackage.LISTS__D:
        return d != null && !d.isEmpty();
      case AstConversionSimplePackage.LISTS__E:
        return e != null;
    }
    return super.eIsSet(featureID);
  }

} //ListsImpl
