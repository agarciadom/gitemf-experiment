/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.InfixExpression;
import jdtast.gitemf.dom.DOM.InfixExpressionOperatorKind;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.InfixExpressionImpl#getExtendedOperands <em>Extended Operands</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.InfixExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.InfixExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.InfixExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpressionImpl extends ExpressionImpl implements InfixExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InfixExpressionOperatorKind OPERATOR_EDEFAULT = InfixExpressionOperatorKind.GREATER_EQUALS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.INFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getExtendedOperands() {
		return (EList<Expression>)eDynamicGet(DOMPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS, DOMPackage.Literals.INFIX_EXPRESSION__EXTENDED_OPERANDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftOperand() {
		return (Expression)eDynamicGet(DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND, DOMPackage.Literals.INFIX_EXPRESSION__LEFT_OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperand(Expression newLeftOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeftOperand, DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperand(Expression newLeftOperand) {
		eDynamicSet(DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND, DOMPackage.Literals.INFIX_EXPRESSION__LEFT_OPERAND, newLeftOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpressionOperatorKind getOperator() {
		return (InfixExpressionOperatorKind)eDynamicGet(DOMPackage.INFIX_EXPRESSION__OPERATOR, DOMPackage.Literals.INFIX_EXPRESSION__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(InfixExpressionOperatorKind newOperator) {
		eDynamicSet(DOMPackage.INFIX_EXPRESSION__OPERATOR, DOMPackage.Literals.INFIX_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightOperand() {
		return (Expression)eDynamicGet(DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND, DOMPackage.Literals.INFIX_EXPRESSION__RIGHT_OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOperand(Expression newRightOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRightOperand, DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(Expression newRightOperand) {
		eDynamicSet(DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND, DOMPackage.Literals.INFIX_EXPRESSION__RIGHT_OPERAND, newRightOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return ((InternalEList<?>)getExtendedOperands()).basicRemove(otherEnd, msgs);
			case DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				return basicSetLeftOperand(null, msgs);
			case DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				return basicSetRightOperand(null, msgs);
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
			case DOMPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return getExtendedOperands();
			case DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case DOMPackage.INFIX_EXPRESSION__OPERATOR:
				return getOperator();
			case DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DOMPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
				getExtendedOperands().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((Expression)newValue);
				return;
			case DOMPackage.INFIX_EXPRESSION__OPERATOR:
				setOperator((InfixExpressionOperatorKind)newValue);
				return;
			case DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((Expression)newValue);
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
			case DOMPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
				return;
			case DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((Expression)null);
				return;
			case DOMPackage.INFIX_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((Expression)null);
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
			case DOMPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return !getExtendedOperands().isEmpty();
			case DOMPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand() != null;
			case DOMPackage.INFIX_EXPRESSION__OPERATOR:
				return getOperator() != OPERATOR_EDEFAULT;
			case DOMPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand() != null;
		}
		return super.eIsSet(featureID);
	}

} //InfixExpressionImpl
