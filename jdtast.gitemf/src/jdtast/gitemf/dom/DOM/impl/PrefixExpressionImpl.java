/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.PrefixExpression;
import jdtast.gitemf.dom.DOM.PrefixExpressionOperatorKind;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PrefixExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PrefixExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrefixExpressionImpl extends ExpressionImpl implements PrefixExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final PrefixExpressionOperatorKind OPERATOR_EDEFAULT = PrefixExpressionOperatorKind.MINUS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.PREFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOperand() {
		return (Expression)eDynamicGet(DOMPackage.PREFIX_EXPRESSION__OPERAND, DOMPackage.Literals.PREFIX_EXPRESSION__OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(Expression newOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperand, DOMPackage.PREFIX_EXPRESSION__OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(Expression newOperand) {
		eDynamicSet(DOMPackage.PREFIX_EXPRESSION__OPERAND, DOMPackage.Literals.PREFIX_EXPRESSION__OPERAND, newOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpressionOperatorKind getOperator() {
		return (PrefixExpressionOperatorKind)eDynamicGet(DOMPackage.PREFIX_EXPRESSION__OPERATOR, DOMPackage.Literals.PREFIX_EXPRESSION__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(PrefixExpressionOperatorKind newOperator) {
		eDynamicSet(DOMPackage.PREFIX_EXPRESSION__OPERATOR, DOMPackage.Literals.PREFIX_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.PREFIX_EXPRESSION__OPERAND:
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
			case DOMPackage.PREFIX_EXPRESSION__OPERAND:
				return getOperand();
			case DOMPackage.PREFIX_EXPRESSION__OPERATOR:
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
			case DOMPackage.PREFIX_EXPRESSION__OPERAND:
				setOperand((Expression)newValue);
				return;
			case DOMPackage.PREFIX_EXPRESSION__OPERATOR:
				setOperator((PrefixExpressionOperatorKind)newValue);
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
			case DOMPackage.PREFIX_EXPRESSION__OPERAND:
				setOperand((Expression)null);
				return;
			case DOMPackage.PREFIX_EXPRESSION__OPERATOR:
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
			case DOMPackage.PREFIX_EXPRESSION__OPERAND:
				return getOperand() != null;
			case DOMPackage.PREFIX_EXPRESSION__OPERATOR:
				return getOperator() != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PrefixExpressionImpl
