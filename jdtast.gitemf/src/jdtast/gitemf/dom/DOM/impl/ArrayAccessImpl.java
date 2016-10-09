/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.ArrayAccess;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayAccessImpl#getArray <em>Array</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayAccessImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAccessImpl extends ExpressionImpl implements ArrayAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ARRAY_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getArray() {
		return (Expression)eDynamicGet(DOMPackage.ARRAY_ACCESS__ARRAY, DOMPackage.Literals.ARRAY_ACCESS__ARRAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(Expression newArray, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newArray, DOMPackage.ARRAY_ACCESS__ARRAY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(Expression newArray) {
		eDynamicSet(DOMPackage.ARRAY_ACCESS__ARRAY, DOMPackage.Literals.ARRAY_ACCESS__ARRAY, newArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndex() {
		return (Expression)eDynamicGet(DOMPackage.ARRAY_ACCESS__INDEX, DOMPackage.Literals.ARRAY_ACCESS__INDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIndex, DOMPackage.ARRAY_ACCESS__INDEX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Expression newIndex) {
		eDynamicSet(DOMPackage.ARRAY_ACCESS__INDEX, DOMPackage.Literals.ARRAY_ACCESS__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ARRAY_ACCESS__ARRAY:
				return basicSetArray(null, msgs);
			case DOMPackage.ARRAY_ACCESS__INDEX:
				return basicSetIndex(null, msgs);
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
			case DOMPackage.ARRAY_ACCESS__ARRAY:
				return getArray();
			case DOMPackage.ARRAY_ACCESS__INDEX:
				return getIndex();
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
			case DOMPackage.ARRAY_ACCESS__ARRAY:
				setArray((Expression)newValue);
				return;
			case DOMPackage.ARRAY_ACCESS__INDEX:
				setIndex((Expression)newValue);
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
			case DOMPackage.ARRAY_ACCESS__ARRAY:
				setArray((Expression)null);
				return;
			case DOMPackage.ARRAY_ACCESS__INDEX:
				setIndex((Expression)null);
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
			case DOMPackage.ARRAY_ACCESS__ARRAY:
				return getArray() != null;
			case DOMPackage.ARRAY_ACCESS__INDEX:
				return getIndex() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayAccessImpl
