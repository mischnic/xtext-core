/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Becomes Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.BecomesDecl#isList <em>List</em>}</li>
 *   <li>{@link org.eclipse.xtext.BecomesDecl#getListType <em>List Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.BecomesDecl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.xtext.BecomesDecl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getBecomesDecl()
 * @model
 * @generated
 */
public interface BecomesDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' attribute.
	 * @see #setList(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDecl_List()
	 * @model
	 * @generated
	 */
	boolean isList();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.BecomesDecl#isList <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' attribute.
	 * @see #isList()
	 * @generated
	 */
	void setList(boolean value);

	/**
	 * Returns the value of the '<em><b>List Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Type</em>' attribute.
	 * @see #setListType(String)
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDecl_ListType()
	 * @model
	 * @generated
	 */
	String getListType();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.BecomesDecl#getListType <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Type</em>' attribute.
	 * @see #getListType()
	 * @generated
	 */
	void setListType(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDecl_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.BecomesDecl#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference.
	 * @see #setDescriptor(BecomesDeclClass)
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDecl_Descriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BecomesDeclClass getDescriptor();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.BecomesDecl#getDescriptor <em>Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' containment reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(BecomesDeclClass value);

} // BecomesDecl
