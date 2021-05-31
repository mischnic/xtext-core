/**
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.BecomesDeclCustomAttribute;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Becomes Decl Custom Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclCustomAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclCustomAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclCustomAttributeImpl#isCopy <em>Copy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BecomesDeclCustomAttributeImpl extends MinimalEObjectImpl.Container implements BecomesDeclCustomAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COPY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopy()
	 * @generated
	 * @ordered
	 */
	protected boolean copy = COPY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BecomesDeclCustomAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.BECOMES_DECL_CUSTOM_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCopy() {
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopy(boolean newCopy) {
		boolean oldCopy = copy;
		copy = newCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__COPY, oldCopy, copy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__NAME:
				return getName();
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__TYPE:
				return getType();
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__COPY:
				return isCopy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__COPY:
				setCopy((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__COPY:
				setCopy(COPY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XtextPackage.BECOMES_DECL_CUSTOM_ATTRIBUTE__COPY:
				return copy != COPY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", copy: ");
		result.append(copy);
		result.append(')');
		return result.toString();
	}

} //BecomesDeclCustomAttributeImpl
