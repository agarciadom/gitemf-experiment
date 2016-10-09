/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.Name;
import jdtast.gitemf.dom.DOM.SuperMethodInvocation;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperMethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperMethodInvocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperMethodInvocationImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperMethodInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperMethodInvocationImpl extends ExpressionImpl implements SuperMethodInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperMethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SUPER_METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(DOMPackage.SUPER_METHOD_INVOCATION__ARGUMENTS, DOMPackage.Literals.SUPER_METHOD_INVOCATION__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return (Name)eDynamicGet(DOMPackage.SUPER_METHOD_INVOCATION__NAME, DOMPackage.Literals.SUPER_METHOD_INVOCATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.SUPER_METHOD_INVOCATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		eDynamicSet(DOMPackage.SUPER_METHOD_INVOCATION__NAME, DOMPackage.Literals.SUPER_METHOD_INVOCATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getQualifier() {
		return (Name)eDynamicGet(DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER, DOMPackage.Literals.SUPER_METHOD_INVOCATION__QUALIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(Name newQualifier, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newQualifier, DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Name newQualifier) {
		eDynamicSet(DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER, DOMPackage.Literals.SUPER_METHOD_INVOCATION__QUALIFIER, newQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eDynamicGet(DOMPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS, DOMPackage.Literals.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.SUPER_METHOD_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case DOMPackage.SUPER_METHOD_INVOCATION__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER:
				return basicSetQualifier(null, msgs);
			case DOMPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.SUPER_METHOD_INVOCATION__ARGUMENTS:
				return getArguments();
			case DOMPackage.SUPER_METHOD_INVOCATION__NAME:
				return getName();
			case DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER:
				return getQualifier();
			case DOMPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case DOMPackage.SUPER_METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.SUPER_METHOD_INVOCATION__NAME:
				setName((Name)newValue);
				return;
			case DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER:
				setQualifier((Name)newValue);
				return;
			case DOMPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends Type>)newValue);
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
			case DOMPackage.SUPER_METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case DOMPackage.SUPER_METHOD_INVOCATION__NAME:
				setName((Name)null);
				return;
			case DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER:
				setQualifier((Name)null);
				return;
			case DOMPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case DOMPackage.SUPER_METHOD_INVOCATION__ARGUMENTS:
				return !getArguments().isEmpty();
			case DOMPackage.SUPER_METHOD_INVOCATION__NAME:
				return getName() != null;
			case DOMPackage.SUPER_METHOD_INVOCATION__QUALIFIER:
				return getQualifier() != null;
			case DOMPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SuperMethodInvocationImpl
