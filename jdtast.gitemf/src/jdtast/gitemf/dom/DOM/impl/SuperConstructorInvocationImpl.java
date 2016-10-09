/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.SuperConstructorInvocation;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperConstructorInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperConstructorInvocationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperConstructorInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperConstructorInvocationImpl extends StatementImpl implements SuperConstructorInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperConstructorInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SUPER_CONSTRUCTOR_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS, DOMPackage.Literals.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, DOMPackage.Literals.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, DOMPackage.Literals.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eDynamicGet(DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS, DOMPackage.Literals.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
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
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return getArguments();
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return getExpression();
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
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
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
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
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
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
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return !getArguments().isEmpty();
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SuperConstructorInvocationImpl
