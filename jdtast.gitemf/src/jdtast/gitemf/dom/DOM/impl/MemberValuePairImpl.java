/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.MemberValuePair;
import jdtast.gitemf.dom.DOM.SimpleName;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MemberValuePairImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MemberValuePairImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberValuePairImpl extends ASTNodeImpl implements MemberValuePair {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.MEMBER_VALUE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.MEMBER_VALUE_PAIR__NAME, DOMPackage.Literals.MEMBER_VALUE_PAIR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.MEMBER_VALUE_PAIR__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.MEMBER_VALUE_PAIR__NAME, DOMPackage.Literals.MEMBER_VALUE_PAIR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return (Expression)eDynamicGet(DOMPackage.MEMBER_VALUE_PAIR__VALUE, DOMPackage.Literals.MEMBER_VALUE_PAIR__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, DOMPackage.MEMBER_VALUE_PAIR__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		eDynamicSet(DOMPackage.MEMBER_VALUE_PAIR__VALUE, DOMPackage.Literals.MEMBER_VALUE_PAIR__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.MEMBER_VALUE_PAIR__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.MEMBER_VALUE_PAIR__VALUE:
				return basicSetValue(null, msgs);
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
			case DOMPackage.MEMBER_VALUE_PAIR__NAME:
				return getName();
			case DOMPackage.MEMBER_VALUE_PAIR__VALUE:
				return getValue();
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
			case DOMPackage.MEMBER_VALUE_PAIR__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.MEMBER_VALUE_PAIR__VALUE:
				setValue((Expression)newValue);
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
			case DOMPackage.MEMBER_VALUE_PAIR__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.MEMBER_VALUE_PAIR__VALUE:
				setValue((Expression)null);
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
			case DOMPackage.MEMBER_VALUE_PAIR__NAME:
				return getName() != null;
			case DOMPackage.MEMBER_VALUE_PAIR__VALUE:
				return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberValuePairImpl
