/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.InstanceofExpression;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.InstanceofExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.InstanceofExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceofExpressionImpl extends ExpressionImpl implements InstanceofExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceofExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.INSTANCEOF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftOperand() {
		return (Expression)eDynamicGet(DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND, DOMPackage.Literals.INSTANCEOF_EXPRESSION__LEFT_OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperand(Expression newLeftOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeftOperand, DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperand(Expression newLeftOperand) {
		eDynamicSet(DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND, DOMPackage.Literals.INSTANCEOF_EXPRESSION__LEFT_OPERAND, newLeftOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRightOperand() {
		return (Type)eDynamicGet(DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, DOMPackage.Literals.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOperand(Type newRightOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRightOperand, DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(Type newRightOperand) {
		eDynamicSet(DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, DOMPackage.Literals.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, newRightOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return basicSetLeftOperand(null, msgs);
			case DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
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
			case DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
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
			case DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((Expression)newValue);
				return;
			case DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((Type)newValue);
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
			case DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((Expression)null);
				return;
			case DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((Type)null);
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
			case DOMPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand() != null;
			case DOMPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand() != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceofExpressionImpl
