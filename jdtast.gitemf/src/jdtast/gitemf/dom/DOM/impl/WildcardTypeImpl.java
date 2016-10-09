/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Type;
import jdtast.gitemf.dom.DOM.WildcardType;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.WildcardTypeImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.WildcardTypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildcardTypeImpl extends TypeImpl implements WildcardType {
	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UPPER_BOUND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildcardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.WILDCARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getBound() {
		return (Type)eDynamicGet(DOMPackage.WILDCARD_TYPE__BOUND, DOMPackage.Literals.WILDCARD_TYPE__BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBound(Type newBound, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBound, DOMPackage.WILDCARD_TYPE__BOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(Type newBound) {
		eDynamicSet(DOMPackage.WILDCARD_TYPE__BOUND, DOMPackage.Literals.WILDCARD_TYPE__BOUND, newBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUpperBound() {
		return (Boolean)eDynamicGet(DOMPackage.WILDCARD_TYPE__UPPER_BOUND, DOMPackage.Literals.WILDCARD_TYPE__UPPER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Boolean newUpperBound) {
		eDynamicSet(DOMPackage.WILDCARD_TYPE__UPPER_BOUND, DOMPackage.Literals.WILDCARD_TYPE__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.WILDCARD_TYPE__BOUND:
				return basicSetBound(null, msgs);
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
			case DOMPackage.WILDCARD_TYPE__BOUND:
				return getBound();
			case DOMPackage.WILDCARD_TYPE__UPPER_BOUND:
				return getUpperBound();
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
			case DOMPackage.WILDCARD_TYPE__BOUND:
				setBound((Type)newValue);
				return;
			case DOMPackage.WILDCARD_TYPE__UPPER_BOUND:
				setUpperBound((Boolean)newValue);
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
			case DOMPackage.WILDCARD_TYPE__BOUND:
				setBound((Type)null);
				return;
			case DOMPackage.WILDCARD_TYPE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
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
			case DOMPackage.WILDCARD_TYPE__BOUND:
				return getBound() != null;
			case DOMPackage.WILDCARD_TYPE__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? getUpperBound() != null : !UPPER_BOUND_EDEFAULT.equals(getUpperBound());
		}
		return super.eIsSet(featureID);
	}

} //WildcardTypeImpl
