/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.MethodRefParameter;
import jdtast.gitemf.dom.DOM.SimpleName;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Ref Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodRefParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodRefParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodRefParameterImpl#getVarargs <em>Varargs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodRefParameterImpl extends ASTNodeImpl implements MethodRefParameter {
	/**
	 * The default value of the '{@link #getVarargs() <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VARARGS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodRefParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.METHOD_REF_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.METHOD_REF_PARAMETER__NAME, DOMPackage.Literals.METHOD_REF_PARAMETER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.METHOD_REF_PARAMETER__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.METHOD_REF_PARAMETER__NAME, DOMPackage.Literals.METHOD_REF_PARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(DOMPackage.METHOD_REF_PARAMETER__TYPE, DOMPackage.Literals.METHOD_REF_PARAMETER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.METHOD_REF_PARAMETER__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(DOMPackage.METHOD_REF_PARAMETER__TYPE, DOMPackage.Literals.METHOD_REF_PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVarargs() {
		return (Boolean)eDynamicGet(DOMPackage.METHOD_REF_PARAMETER__VARARGS, DOMPackage.Literals.METHOD_REF_PARAMETER__VARARGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(Boolean newVarargs) {
		eDynamicSet(DOMPackage.METHOD_REF_PARAMETER__VARARGS, DOMPackage.Literals.METHOD_REF_PARAMETER__VARARGS, newVarargs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.METHOD_REF_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.METHOD_REF_PARAMETER__TYPE:
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
			case DOMPackage.METHOD_REF_PARAMETER__NAME:
				return getName();
			case DOMPackage.METHOD_REF_PARAMETER__TYPE:
				return getType();
			case DOMPackage.METHOD_REF_PARAMETER__VARARGS:
				return getVarargs();
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
			case DOMPackage.METHOD_REF_PARAMETER__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.METHOD_REF_PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case DOMPackage.METHOD_REF_PARAMETER__VARARGS:
				setVarargs((Boolean)newValue);
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
			case DOMPackage.METHOD_REF_PARAMETER__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.METHOD_REF_PARAMETER__TYPE:
				setType((Type)null);
				return;
			case DOMPackage.METHOD_REF_PARAMETER__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
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
			case DOMPackage.METHOD_REF_PARAMETER__NAME:
				return getName() != null;
			case DOMPackage.METHOD_REF_PARAMETER__TYPE:
				return getType() != null;
			case DOMPackage.METHOD_REF_PARAMETER__VARARGS:
				return VARARGS_EDEFAULT == null ? getVarargs() != null : !VARARGS_EDEFAULT.equals(getVarargs());
		}
		return super.eIsSet(featureID);
	}

} //MethodRefParameterImpl
