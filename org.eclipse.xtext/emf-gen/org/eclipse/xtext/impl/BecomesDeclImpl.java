/**
 */
package org.eclipse.xtext.impl;

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
import org.eclipse.xtext.BecomesDecl;
import org.eclipse.xtext.BecomesDeclAttribute;
import org.eclipse.xtext.BecomesDeclClass;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Becomes Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclImpl#isList <em>List</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclImpl#getListType <em>List Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.BecomesDeclImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BecomesDeclImpl extends MinimalEObjectImpl.Container implements BecomesDecl {
	/**
	 * The default value of the '{@link #isList() <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isList() <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isList()
	 * @generated
	 * @ordered
	 */
	protected boolean list = LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getListType() <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListType()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListType() <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListType()
	 * @generated
	 * @ordered
	 */
	protected String listType = LIST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BecomesDeclClass descriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BecomesDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.BECOMES_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setList(boolean newList) {
		boolean oldList = list;
		list = newList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL__LIST, oldList, list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListType() {
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListType(String newListType) {
		String oldListType = listType;
		listType = newListType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL__LIST_TYPE, oldListType, listType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BecomesDeclClass getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptor(BecomesDeclClass newDescriptor, NotificationChain msgs) {
		BecomesDeclClass oldDescriptor = descriptor;
		descriptor = newDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL__DESCRIPTOR, oldDescriptor, newDescriptor);
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
	public void setDescriptor(BecomesDeclClass newDescriptor) {
		if (newDescriptor != descriptor) {
			NotificationChain msgs = null;
			if (descriptor != null)
				msgs = ((InternalEObject)descriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtextPackage.BECOMES_DECL__DESCRIPTOR, null, msgs);
			if (newDescriptor != null)
				msgs = ((InternalEObject)newDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtextPackage.BECOMES_DECL__DESCRIPTOR, null, msgs);
			msgs = basicSetDescriptor(newDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.BECOMES_DECL__DESCRIPTOR, newDescriptor, newDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL__DESCRIPTOR:
				return basicSetDescriptor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL__LIST:
				return isList();
			case XtextPackage.BECOMES_DECL__LIST_TYPE:
				return getListType();
			case XtextPackage.BECOMES_DECL__CODE:
				return getCode();
			case XtextPackage.BECOMES_DECL__DESCRIPTOR:
				return getDescriptor();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtextPackage.BECOMES_DECL__LIST:
				setList((Boolean)newValue);
				return;
			case XtextPackage.BECOMES_DECL__LIST_TYPE:
				setListType((String)newValue);
				return;
			case XtextPackage.BECOMES_DECL__CODE:
				setCode((String)newValue);
				return;
			case XtextPackage.BECOMES_DECL__DESCRIPTOR:
				setDescriptor((BecomesDeclClass)newValue);
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
			case XtextPackage.BECOMES_DECL__LIST:
				setList(LIST_EDEFAULT);
				return;
			case XtextPackage.BECOMES_DECL__LIST_TYPE:
				setListType(LIST_TYPE_EDEFAULT);
				return;
			case XtextPackage.BECOMES_DECL__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XtextPackage.BECOMES_DECL__DESCRIPTOR:
				setDescriptor((BecomesDeclClass)null);
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
			case XtextPackage.BECOMES_DECL__LIST:
				return list != LIST_EDEFAULT;
			case XtextPackage.BECOMES_DECL__LIST_TYPE:
				return LIST_TYPE_EDEFAULT == null ? listType != null : !LIST_TYPE_EDEFAULT.equals(listType);
			case XtextPackage.BECOMES_DECL__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XtextPackage.BECOMES_DECL__DESCRIPTOR:
				return descriptor != null;
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
		result.append(" (list: ");
		result.append(list);
		result.append(", listType: ");
		result.append(listType);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //BecomesDeclImpl
