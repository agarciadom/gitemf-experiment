/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.CastExpression;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CastExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CastExpressionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CastExpressionImpl extends ExpressionImpl implements CastExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CastExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CAST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.CAST_EXPRESSION__EXPRESSION, DOMPackage.Literals.CAST_EXPRESSION__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.CAST_EXPRESSION__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.CAST_EXPRESSION__EXPRESSION, DOMPackage.Literals.CAST_EXPRESSION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(DOMPackage.CAST_EXPRESSION__TYPE, DOMPackage.Literals.CAST_EXPRESSION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.CAST_EXPRESSION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(DOMPackage.CAST_EXPRESSION__TYPE, DOMPackage.Literals.CAST_EXPRESSION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.CAST_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.CAST_EXPRESSION__TYPE:
				return basicSetType(null, msgs);
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
			case DOMPackage.CAST_EXPRESSION__EXPRESSION:
				return getExpression();
			case DOMPackage.CAST_EXPRESSION__TYPE:
				return getType();
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
			case DOMPackage.CAST_EXPRESSION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.CAST_EXPRESSION__TYPE:
				setType((Type)newValue);
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
			case DOMPackage.CAST_EXPRESSION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.CAST_EXPRESSION__TYPE:
				setType((Type)null);
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
			case DOMPackage.CAST_EXPRESSION__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.CAST_EXPRESSION__TYPE:
				return getType() != null;
		}
		return super.eIsSet(featureID);
	}

} //CastExpressionImpl
