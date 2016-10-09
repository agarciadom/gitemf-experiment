/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.ExtendedModifier;
import jdtast.gitemf.dom.DOM.SingleVariableDeclaration;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SingleVariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SingleVariableDeclarationImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SingleVariableDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclarationImpl extends VariableDeclarationImpl implements SingleVariableDeclaration {
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
	protected SingleVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SINGLE_VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE, DOMPackage.Literals.SINGLE_VARIABLE_DECLARATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE, DOMPackage.Literals.SINGLE_VARIABLE_DECLARATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVarargs() {
		return (Boolean)eDynamicGet(DOMPackage.SINGLE_VARIABLE_DECLARATION__VARARGS, DOMPackage.Literals.SINGLE_VARIABLE_DECLARATION__VARARGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(Boolean newVarargs) {
		eDynamicSet(DOMPackage.SINGLE_VARIABLE_DECLARATION__VARARGS, DOMPackage.Literals.SINGLE_VARIABLE_DECLARATION__VARARGS, newVarargs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedModifier> getModifiers() {
		return (EList<ExtendedModifier>)eDynamicGet(DOMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS, DOMPackage.Literals.SINGLE_VARIABLE_DECLARATION__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return getType();
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return getVarargs();
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return getModifiers();
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
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((Type)newValue);
				return;
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs((Boolean)newValue);
				return;
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends ExtendedModifier>)newValue);
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
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((Type)null);
				return;
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
				return;
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				getModifiers().clear();
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
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return getType() != null;
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return VARARGS_EDEFAULT == null ? getVarargs() != null : !VARARGS_EDEFAULT.equals(getVarargs());
			case DOMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return !getModifiers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingleVariableDeclarationImpl
