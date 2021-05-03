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
 *   <li>{@link org.eclipse.xtext.BecomesDecl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.xtext.BecomesDecl#getCode <em>Code</em>}</li>
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
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.BecomesDeclAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDecl_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BecomesDeclAttribute> getAttributes();

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

} // BecomesDecl
