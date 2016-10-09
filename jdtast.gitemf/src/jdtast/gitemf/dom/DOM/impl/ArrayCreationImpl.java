/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.ArrayCreation;
import jdtast.gitemf.dom.DOM.ArrayInitializer;
import jdtast.gitemf.dom.DOM.ArrayType;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayCreationImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayCreationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ArrayCreationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreationImpl extends ExpressionImpl implements ArrayCreation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ARRAY_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getDimensions() {
		return (EList<Expression>)eDynamicGet(DOMPackage.ARRAY_CREATION__DIMENSIONS, DOMPackage.Literals.ARRAY_CREATION__DIMENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer getInitializer() {
		return (ArrayInitializer)eDynamicGet(DOMPackage.ARRAY_CREATION__INITIALIZER, DOMPackage.Literals.ARRAY_CREATION__INITIALIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(ArrayInitializer newInitializer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitializer, DOMPackage.ARRAY_CREATION__INITIALIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(ArrayInitializer newInitializer) {
		eDynamicSet(DOMPackage.ARRAY_CREATION__INITIALIZER, DOMPackage.Literals.ARRAY_CREATION__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType getType() {
		return (ArrayType)eDynamicGet(DOMPackage.ARRAY_CREATION__TYPE, DOMPackage.Literals.ARRAY_CREATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ArrayType newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.ARRAY_CREATION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ArrayType newType) {
		eDynamicSet(DOMPackage.ARRAY_CREATION__TYPE, DOMPackage.Literals.ARRAY_CREATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ARRAY_CREATION__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
			case DOMPackage.ARRAY_CREATION__INITIALIZER:
				return basicSetInitializer(null, msgs);
			case DOMPackage.ARRAY_CREATION__TYPE:
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
			case DOMPackage.ARRAY_CREATION__DIMENSIONS:
				return getDimensions();
			case DOMPackage.ARRAY_CREATION__INITIALIZER:
				return getInitializer();
			case DOMPackage.ARRAY_CREATION__TYPE:
				return getType();
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
			case DOMPackage.ARRAY_CREATION__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.ARRAY_CREATION__INITIALIZER:
				setInitializer((ArrayInitializer)newValue);
				return;
			case DOMPackage.ARRAY_CREATION__TYPE:
				setType((ArrayType)newValue);
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
			case DOMPackage.ARRAY_CREATION__DIMENSIONS:
				getDimensions().clear();
				return;
			case DOMPackage.ARRAY_CREATION__INITIALIZER:
				setInitializer((ArrayInitializer)null);
				return;
			case DOMPackage.ARRAY_CREATION__TYPE:
				setType((ArrayType)null);
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
			case DOMPackage.ARRAY_CREATION__DIMENSIONS:
				return !getDimensions().isEmpty();
			case DOMPackage.ARRAY_CREATION__INITIALIZER:
				return getInitializer() != null;
			case DOMPackage.ARRAY_CREATION__TYPE:
				return getType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayCreationImpl
