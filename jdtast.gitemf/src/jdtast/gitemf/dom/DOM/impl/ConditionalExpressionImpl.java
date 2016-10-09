/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.ConditionalExpression;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ConditionalExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ConditionalExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ConditionalExpressionImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseExpression() {
		return (Expression)eDynamicGet(DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, DOMPackage.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpression(Expression newElseExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElseExpression, DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpression(Expression newElseExpression) {
		eDynamicSet(DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, DOMPackage.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, newElseExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION, DOMPackage.Literals.CONDITIONAL_EXPRESSION__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION, DOMPackage.Literals.CONDITIONAL_EXPRESSION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenExpression() {
		return (Expression)eDynamicGet(DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, DOMPackage.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenExpression(Expression newThenExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newThenExpression, DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpression(Expression newThenExpression) {
		eDynamicSet(DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, DOMPackage.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, newThenExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION:
				return basicSetElseExpression(null, msgs);
			case DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION:
				return basicSetThenExpression(null, msgs);
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
			case DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression();
			case DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
				return getExpression();
			case DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION:
				return getThenExpression();
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
			case DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)newValue);
				return;
			case DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION:
				setThenExpression((Expression)newValue);
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
			case DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)null);
				return;
			case DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION:
				setThenExpression((Expression)null);
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
			case DOMPackage.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression() != null;
			case DOMPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.CONDITIONAL_EXPRESSION__THEN_EXPRESSION:
				return getThenExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionImpl
