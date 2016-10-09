/**
 */
package jdtast.gitemf.dom.DOM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.ArrayCreation#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.ArrayCreation#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.ArrayCreation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayCreation()
 * @model
 * @generated
 */
public interface ArrayCreation extends Expression {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayCreation_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(ArrayInitializer)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayCreation_Initializer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArrayInitializer getInitializer();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ArrayCreation#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(ArrayInitializer value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ArrayType)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayCreation_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArrayType getType();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ArrayCreation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArrayType value);

} // ArrayCreation
