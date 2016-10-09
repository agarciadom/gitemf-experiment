/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.PostfixExpression;
import jdtast.gitemf.dom.DOM.PostfixExpressionOperatorKind;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PostfixExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PostfixExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostfixExpressionImpl extends ExpressionImpl implements PostfixExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final PostfixExpressionOperatorKind OPERATOR_EDEFAULT = PostfixExpressionOperatorKind.INCREMENT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.POSTFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOperand() {
		return (Expression)eDynamicGet(DOMPackage.POSTFIX_EXPRESSION__OPERAND, DOMPackage.Literals.POSTFIX_EXPRESSION__OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(Expression newOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperand, DOMPackage.POSTFIX_EXPRESSION__OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(Expression newOperand) {
		eDynamicSet(DOMPackage.POSTFIX_EXPRESSION__OPERAND, DOMPackage.Literals.POSTFIX_EXPRESSION__OPERAND, newOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpressionOperatorKind getOperator() {
		return (PostfixExpressionOperatorKind)eDynamicGet(DOMPackage.POSTFIX_EXPRESSION__OPERATOR, DOMPackage.Literals.POSTFIX_EXPRESSION__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(PostfixExpressionOperatorKind newOperator) {
		eDynamicSet(DOMPackage.POSTFIX_EXPRESSION__OPERATOR, DOMPackage.Literals.POSTFIX_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.POSTFIX_EXPRESSION__OPERAND:
				return basicSetOperand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.POSTFIX_EXPRESSION__OPERAND:
				return getOperand();
			case DOMPackage.POSTFIX_EXPRESSION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DOMPackage.POSTFIX_EXPRESSION__OPERAND:
				setOperand((Expression)newValue);
				return;
			case DOMPackage.POSTFIX_EXPRESSION__OPERATOR:
				setOperator((PostfixExpressionOperatorKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DOMPackage.POSTFIX_EXPRESSION__OPERAND:
				setOperand((Expression)null);
				return;
			case DOMPackage.POSTFIX_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DOMPackage.POSTFIX_EXPRESSION__OPERAND:
				return getOperand() != null;
			case DOMPackage.POSTFIX_EXPRESSION__OPERATOR:
				return getOperator() != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PostfixExpressionImpl
