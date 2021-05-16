/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Becomes Decl Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.BecomesDeclClass#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getBecomesDeclClass()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BecomesDeclClass extends EObject {

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.BecomesDeclAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.xtext.XtextPackage#getBecomesDeclClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BecomesDeclAttribute> getAttributes();
} // BecomesDeclClass
