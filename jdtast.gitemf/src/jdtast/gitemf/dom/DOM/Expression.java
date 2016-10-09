/**
 */
package jdtast.gitemf.dom.DOM;

import jdtast.gitemf.core.Core.IType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.Expression#getResolveBoxing <em>Resolve Boxing</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.Expression#getResolveUnboxing <em>Resolve Unboxing</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.Expression#getTypeBinding <em>Type Binding</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Resolve Boxing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Boxing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Boxing</em>' attribute.
	 * @see #setResolveBoxing(Boolean)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getExpression_ResolveBoxing()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getResolveBoxing();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.Expression#getResolveBoxing <em>Resolve Boxing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Boxing</em>' attribute.
	 * @see #getResolveBoxing()
	 * @generated
	 */
	void setResolveBoxing(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resolve Unboxing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Unboxing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Unboxing</em>' attribute.
	 * @see #setResolveUnboxing(Boolean)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getExpression_ResolveUnboxing()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getResolveUnboxing();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.Expression#getResolveUnboxing <em>Resolve Unboxing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Unboxing</em>' attribute.
	 * @see #getResolveUnboxing()
	 * @generated
	 */
	void setResolveUnboxing(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Binding</em>' reference.
	 * @see #setTypeBinding(IType)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getExpression_TypeBinding()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IType getTypeBinding();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.Expression#getTypeBinding <em>Type Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Binding</em>' reference.
	 * @see #getTypeBinding()
	 * @generated
	 */
	void setTypeBinding(IType value);

} // Expression
