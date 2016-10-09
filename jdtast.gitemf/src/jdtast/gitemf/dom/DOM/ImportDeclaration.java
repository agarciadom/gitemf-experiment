/**
 */
package jdtast.gitemf.dom.DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.ImportDeclaration#getOnDemand <em>On Demand</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.ImportDeclaration#getStatic <em>Static</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.ImportDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>On Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Demand</em>' attribute.
	 * @see #setOnDemand(Boolean)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getImportDeclaration_OnDemand()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getOnDemand();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ImportDeclaration#getOnDemand <em>On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Demand</em>' attribute.
	 * @see #getOnDemand()
	 * @generated
	 */
	void setOnDemand(Boolean value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(Boolean)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getImportDeclaration_Static()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getStatic();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ImportDeclaration#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getImportDeclaration_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ImportDeclaration#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

} // ImportDeclaration
