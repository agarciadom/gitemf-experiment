/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.IMethod;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.MethodInvocation;
import jdtast.gitemf.dom.DOM.SimpleName;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodInvocationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodInvocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodInvocationImpl#getMethodBinding <em>Method Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationImpl extends ExpressionImpl implements MethodInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(DOMPackage.METHOD_INVOCATION__ARGUMENTS, DOMPackage.Literals.METHOD_INVOCATION__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.METHOD_INVOCATION__EXPRESSION, DOMPackage.Literals.METHOD_INVOCATION__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.METHOD_INVOCATION__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.METHOD_INVOCATION__EXPRESSION, DOMPackage.Literals.METHOD_INVOCATION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.METHOD_INVOCATION__NAME, DOMPackage.Literals.METHOD_INVOCATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.METHOD_INVOCATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.METHOD_INVOCATION__NAME, DOMPackage.Literals.METHOD_INVOCATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eDynamicGet(DOMPackage.METHOD_INVOCATION__TYPE_ARGUMENTS, DOMPackage.Literals.METHOD_INVOCATION__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMethod getMethodBinding() {
		return (IMethod)eDynamicGet(DOMPackage.METHOD_INVOCATION__METHOD_BINDING, DOMPackage.Literals.METHOD_INVOCATION__METHOD_BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMethod basicGetMethodBinding() {
		return (IMethod)eDynamicGet(DOMPackage.METHOD_INVOCATION__METHOD_BINDING, DOMPackage.Literals.METHOD_INVOCATION__METHOD_BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodBinding(IMethod newMethodBinding) {
		eDynamicSet(DOMPackage.METHOD_INVOCATION__METHOD_BINDING, DOMPackage.Literals.METHOD_INVOCATION__METHOD_BINDING, newMethodBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.METHOD_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case DOMPackage.METHOD_INVOCATION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.METHOD_INVOCATION__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.METHOD_INVOCATION__TYPE_ARGUMENTS:
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
			case DOMPackage.METHOD_INVOCATION__ARGUMENTS:
				return getArguments();
			case DOMPackage.METHOD_INVOCATION__EXPRESSION:
				return getExpression();
			case DOMPackage.METHOD_INVOCATION__NAME:
				return getName();
			case DOMPackage.METHOD_INVOCATION__TYPE_ARGUMENTS:
				return getTypeArguments();
			case DOMPackage.METHOD_INVOCATION__METHOD_BINDING:
				if (resolve) return getMethodBinding();
				return basicGetMethodBinding();
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
			case DOMPackage.METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.METHOD_INVOCATION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.METHOD_INVOCATION__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.METHOD_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends Type>)newValue);
				return;
			case DOMPackage.METHOD_INVOCATION__METHOD_BINDING:
				setMethodBinding((IMethod)newValue);
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
			case DOMPackage.METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case DOMPackage.METHOD_INVOCATION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.METHOD_INVOCATION__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.METHOD_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case DOMPackage.METHOD_INVOCATION__METHOD_BINDING:
				setMethodBinding((IMethod)null);
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
			case DOMPackage.METHOD_INVOCATION__ARGUMENTS:
				return !getArguments().isEmpty();
			case DOMPackage.METHOD_INVOCATION__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.METHOD_INVOCATION__NAME:
				return getName() != null;
			case DOMPackage.METHOD_INVOCATION__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
			case DOMPackage.METHOD_INVOCATION__METHOD_BINDING:
				return basicGetMethodBinding() != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodInvocationImpl
