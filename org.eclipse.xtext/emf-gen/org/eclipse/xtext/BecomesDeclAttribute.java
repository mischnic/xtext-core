/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Becomes Decl Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.BecomesDeclAttribute#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getBecomesDeclAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BecomesDeclAttribute extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDeclAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();
	

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.BecomesDeclAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // BecomesDeclAttribute
