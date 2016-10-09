/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.ArrayType;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayTypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends TypeImpl implements ArrayType {
	/**
	 * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIMENSIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ARRAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getComponentType() {
		return (Type)eDynamicGet(DOMPackage.ARRAY_TYPE__COMPONENT_TYPE, DOMPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(Type newComponentType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComponentType, DOMPackage.ARRAY_TYPE__COMPONENT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Type newComponentType) {
		eDynamicSet(DOMPackage.ARRAY_TYPE__COMPONENT_TYPE, DOMPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE, newComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDimensions() {
		return (Integer)eDynamicGet(DOMPackage.ARRAY_TYPE__DIMENSIONS, DOMPackage.Literals.ARRAY_TYPE__DIMENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(Integer newDimensions) {
		eDynamicSet(DOMPackage.ARRAY_TYPE__DIMENSIONS, DOMPackage.Literals.ARRAY_TYPE__DIMENSIONS, newDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getElementType() {
		return (Type)eDynamicGet(DOMPackage.ARRAY_TYPE__ELEMENT_TYPE, DOMPackage.Literals.ARRAY_TYPE__ELEMENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementType(Type newElementType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElementType, DOMPackage.ARRAY_TYPE__ELEMENT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(Type newElementType) {
		eDynamicSet(DOMPackage.ARRAY_TYPE__ELEMENT_TYPE, DOMPackage.Literals.ARRAY_TYPE__ELEMENT_TYPE, newElementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ARRAY_TYPE__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case DOMPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return basicSetElementType(null, msgs);
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
			case DOMPackage.ARRAY_TYPE__COMPONENT_TYPE:
				return getComponentType();
			case DOMPackage.ARRAY_TYPE__DIMENSIONS:
				return getDimensions();
			case DOMPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return getElementType();
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
			case DOMPackage.ARRAY_TYPE__COMPONENT_TYPE:
				setComponentType((Type)newValue);
				return;
			case DOMPackage.ARRAY_TYPE__DIMENSIONS:
				setDimensions((Integer)newValue);
				return;
			case DOMPackage.ARRAY_TYPE__ELEMENT_TYPE:
				setElementType((Type)newValue);
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
			case DOMPackage.ARRAY_TYPE__COMPONENT_TYPE:
				setComponentType((Type)null);
				return;
			case DOMPackage.ARRAY_TYPE__DIMENSIONS:
				setDimensions(DIMENSIONS_EDEFAULT);
				return;
			case DOMPackage.ARRAY_TYPE__ELEMENT_TYPE:
				setElementType((Type)null);
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
			case DOMPackage.ARRAY_TYPE__COMPONENT_TYPE:
				return getComponentType() != null;
			case DOMPackage.ARRAY_TYPE__DIMENSIONS:
				return DIMENSIONS_EDEFAULT == null ? getDimensions() != null : !DIMENSIONS_EDEFAULT.equals(getDimensions());
			case DOMPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return getElementType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeImpl
