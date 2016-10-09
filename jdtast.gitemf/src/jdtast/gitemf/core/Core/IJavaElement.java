/**
 */
package jdtast.gitemf.core.Core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IJava Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.IJavaElement#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.core.Core.CorePackage#getIJavaElement()
 * @model abstract="true"
 * @generated
 */
public interface IJavaElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIJavaElement_ElementName()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IJavaElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

} // IJavaElement
