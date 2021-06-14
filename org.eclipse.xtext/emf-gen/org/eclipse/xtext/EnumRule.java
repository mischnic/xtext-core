/**
 */
package org.eclipse.xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.EnumRule#isBecomes <em>Becomes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getEnumRule()
 * @model
 * @generated
 */
public interface EnumRule extends AbstractRule {

	/**
	 * Returns the value of the '<em><b>Becomes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Becomes</em>' attribute.
	 * @see #setBecomes(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getEnumRule_Becomes()
	 * @model
	 * @generated
	 */
	boolean isBecomes();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.EnumRule#isBecomes <em>Becomes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Becomes</em>' attribute.
	 * @see #isBecomes()
	 * @generated
	 */
	void setBecomes(boolean value);
} // EnumRule
