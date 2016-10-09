/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.Assignment;
import jdtast.gitemf.dom.DOM.AssignmentOperatorKind;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AssignmentImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AssignmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AssignmentImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AssignmentOperatorKind OPERATOR_EDEFAULT = AssignmentOperatorKind.RIGHT_SHIFT_SIGNED_ASSIGN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftHandSide() {
		return (Expression)eDynamicGet(DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE, DOMPackage.Literals.ASSIGNMENT__LEFT_HAND_SIDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHandSide(Expression newLeftHandSide, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeftHandSide, DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHandSide(Expression newLeftHandSide) {
		eDynamicSet(DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE, DOMPackage.Literals.ASSIGNMENT__LEFT_HAND_SIDE, newLeftHandSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperatorKind getOperator() {
		return (AssignmentOperatorKind)eDynamicGet(DOMPackage.ASSIGNMENT__OPERATOR, DOMPackage.Literals.ASSIGNMENT__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AssignmentOperatorKind newOperator) {
		eDynamicSet(DOMPackage.ASSIGNMENT__OPERATOR, DOMPackage.Literals.ASSIGNMENT__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightHandSide() {
		return (Expression)eDynamicGet(DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE, DOMPackage.Literals.ASSIGNMENT__RIGHT_HAND_SIDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHandSide(Expression newRightHandSide, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRightHandSide, DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandSide(Expression newRightHandSide) {
		eDynamicSet(DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE, DOMPackage.Literals.ASSIGNMENT__RIGHT_HAND_SIDE, newRightHandSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				return basicSetLeftHandSide(null, msgs);
			case DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				return basicSetRightHandSide(null, msgs);
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
			case DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case DOMPackage.ASSIGNMENT__OPERATOR:
				return getOperator();
			case DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				return getRightHandSide();
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
			case DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				setLeftHandSide((Expression)newValue);
				return;
			case DOMPackage.ASSIGNMENT__OPERATOR:
				setOperator((AssignmentOperatorKind)newValue);
				return;
			case DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				setRightHandSide((Expression)newValue);
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
			case DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				setLeftHandSide((Expression)null);
				return;
			case DOMPackage.ASSIGNMENT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				setRightHandSide((Expression)null);
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
			case DOMPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				return getLeftHandSide() != null;
			case DOMPackage.ASSIGNMENT__OPERATOR:
				return getOperator() != OPERATOR_EDEFAULT;
			case DOMPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				return getRightHandSide() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
