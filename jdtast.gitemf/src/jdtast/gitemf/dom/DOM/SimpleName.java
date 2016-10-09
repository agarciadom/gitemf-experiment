/**
 */
package jdtast.gitemf.dom.DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.SimpleName#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.SimpleName#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getSimpleName()
 * @model
 * @generated
 */
public interface SimpleName extends Name {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getSimpleName_Identifier()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.SimpleName#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' attribute.
	 * @see #setDeclaration(Boolean)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getSimpleName_Declaration()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getDeclaration();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.SimpleName#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(Boolean value);

} // SimpleName
