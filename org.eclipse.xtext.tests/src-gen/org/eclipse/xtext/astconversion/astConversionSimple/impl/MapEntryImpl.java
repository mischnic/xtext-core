/**
 * generated by Xtext
 */
package org.eclipse.xtext.astconversion.astConversionSimple.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.astconversion.astConversionSimple.AstConversionSimplePackage;
import org.eclipse.xtext.astconversion.astConversionSimple.MapEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.MapEntryImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.eclipse.xtext.astconversion.astConversionSimple.impl.MapEntryImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapEntryImpl extends MinimalEObjectImpl.Container implements MapEntry
{
  /**
   * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeys()
   * @generated
   * @ordered
   */
  protected EList<String> keys;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapEntryImpl()
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
    return AstConversionSimplePackage.Literals.MAP_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getKeys()
  {
    if (keys == null)
    {
      keys = new EDataTypeEList<String>(String.class, this, AstConversionSimplePackage.MAP_ENTRY__KEYS);
    }
    return keys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstConversionSimplePackage.MAP_ENTRY__VALUE, oldValue, value));
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
      case AstConversionSimplePackage.MAP_ENTRY__KEYS:
        return getKeys();
      case AstConversionSimplePackage.MAP_ENTRY__VALUE:
        return getValue();
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
      case AstConversionSimplePackage.MAP_ENTRY__KEYS:
        getKeys().clear();
        getKeys().addAll((Collection<? extends String>)newValue);
        return;
      case AstConversionSimplePackage.MAP_ENTRY__VALUE:
        setValue((Integer)newValue);
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
      case AstConversionSimplePackage.MAP_ENTRY__KEYS:
        getKeys().clear();
        return;
      case AstConversionSimplePackage.MAP_ENTRY__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case AstConversionSimplePackage.MAP_ENTRY__KEYS:
        return keys != null && !keys.isEmpty();
      case AstConversionSimplePackage.MAP_ENTRY__VALUE:
        return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (keys: ");
    result.append(keys);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //MapEntryImpl
