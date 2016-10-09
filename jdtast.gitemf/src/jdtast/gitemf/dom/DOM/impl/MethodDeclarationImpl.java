/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.IMethod;

import jdtast.gitemf.dom.DOM.Block;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.MethodDeclaration;
import jdtast.gitemf.dom.DOM.Name;
import jdtast.gitemf.dom.DOM.SimpleName;
import jdtast.gitemf.dom.DOM.SingleVariableDeclaration;
import jdtast.gitemf.dom.DOM.Type;
import jdtast.gitemf.dom.DOM.TypeParameter;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getExtraDimensions <em>Extra Dimensions</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.MethodDeclarationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends BodyDeclarationImpl implements MethodDeclaration {
	/**
	 * The default value of the '{@link #getExtraDimensions() <em>Extra Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTRA_DIMENSIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSTRUCTOR_EDEFAULT = null;

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
	protected MethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.METHOD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eDynamicGet(DOMPackage.METHOD_DECLARATION__BODY, DOMPackage.Literals.METHOD_DECLARATION__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, DOMPackage.METHOD_DECLARATION__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__BODY, DOMPackage.Literals.METHOD_DECLARATION__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getExtraDimensions() {
		return (Integer)eDynamicGet(DOMPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS, DOMPackage.Literals.METHOD_DECLARATION__EXTRA_DIMENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDimensions(Integer newExtraDimensions) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS, DOMPackage.Literals.METHOD_DECLARATION__EXTRA_DIMENSIONS, newExtraDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.METHOD_DECLARATION__NAME, DOMPackage.Literals.METHOD_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.METHOD_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__NAME, DOMPackage.Literals.METHOD_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return (Type)eDynamicGet(DOMPackage.METHOD_DECLARATION__RETURN_TYPE, DOMPackage.Literals.METHOD_DECLARATION__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, DOMPackage.METHOD_DECLARATION__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__RETURN_TYPE, DOMPackage.Literals.METHOD_DECLARATION__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getConstructor() {
		return (Boolean)eDynamicGet(DOMPackage.METHOD_DECLARATION__CONSTRUCTOR, DOMPackage.Literals.METHOD_DECLARATION__CONSTRUCTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(Boolean newConstructor) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__CONSTRUCTOR, DOMPackage.Literals.METHOD_DECLARATION__CONSTRUCTOR, newConstructor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVarargs() {
		return (Boolean)eDynamicGet(DOMPackage.METHOD_DECLARATION__VARARGS, DOMPackage.Literals.METHOD_DECLARATION__VARARGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(Boolean newVarargs) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__VARARGS, DOMPackage.Literals.METHOD_DECLARATION__VARARGS, newVarargs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SingleVariableDeclaration> getParameters() {
		return (EList<SingleVariableDeclaration>)eDynamicGet(DOMPackage.METHOD_DECLARATION__PARAMETERS, DOMPackage.Literals.METHOD_DECLARATION__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Name> getThrownExceptions() {
		return (EList<Name>)eDynamicGet(DOMPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS, DOMPackage.Literals.METHOD_DECLARATION__THROWN_EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(DOMPackage.METHOD_DECLARATION__TYPE_PARAMETERS, DOMPackage.Literals.METHOD_DECLARATION__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMethod getBinding() {
		return (IMethod)eDynamicGet(DOMPackage.METHOD_DECLARATION__BINDING, DOMPackage.Literals.METHOD_DECLARATION__BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMethod basicGetBinding() {
		return (IMethod)eDynamicGet(DOMPackage.METHOD_DECLARATION__BINDING, DOMPackage.Literals.METHOD_DECLARATION__BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(IMethod newBinding) {
		eDynamicSet(DOMPackage.METHOD_DECLARATION__BINDING, DOMPackage.Literals.METHOD_DECLARATION__BINDING, newBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.METHOD_DECLARATION__BODY:
				return basicSetBody(null, msgs);
			case DOMPackage.METHOD_DECLARATION__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.METHOD_DECLARATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case DOMPackage.METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DOMPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return ((InternalEList<?>)getThrownExceptions()).basicRemove(otherEnd, msgs);
			case DOMPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.METHOD_DECLARATION__BODY:
				return getBody();
			case DOMPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS:
				return getExtraDimensions();
			case DOMPackage.METHOD_DECLARATION__NAME:
				return getName();
			case DOMPackage.METHOD_DECLARATION__RETURN_TYPE:
				return getReturnType();
			case DOMPackage.METHOD_DECLARATION__CONSTRUCTOR:
				return getConstructor();
			case DOMPackage.METHOD_DECLARATION__VARARGS:
				return getVarargs();
			case DOMPackage.METHOD_DECLARATION__PARAMETERS:
				return getParameters();
			case DOMPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case DOMPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case DOMPackage.METHOD_DECLARATION__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
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
			case DOMPackage.METHOD_DECLARATION__BODY:
				setBody((Block)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS:
				setExtraDimensions((Integer)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__CONSTRUCTOR:
				setConstructor((Boolean)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__VARARGS:
				setVarargs((Boolean)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends Name>)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case DOMPackage.METHOD_DECLARATION__BINDING:
				setBinding((IMethod)newValue);
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
			case DOMPackage.METHOD_DECLARATION__BODY:
				setBody((Block)null);
				return;
			case DOMPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS:
				setExtraDimensions(EXTRA_DIMENSIONS_EDEFAULT);
				return;
			case DOMPackage.METHOD_DECLARATION__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.METHOD_DECLARATION__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case DOMPackage.METHOD_DECLARATION__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
				return;
			case DOMPackage.METHOD_DECLARATION__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
				return;
			case DOMPackage.METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case DOMPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case DOMPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case DOMPackage.METHOD_DECLARATION__BINDING:
				setBinding((IMethod)null);
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
			case DOMPackage.METHOD_DECLARATION__BODY:
				return getBody() != null;
			case DOMPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS:
				return EXTRA_DIMENSIONS_EDEFAULT == null ? getExtraDimensions() != null : !EXTRA_DIMENSIONS_EDEFAULT.equals(getExtraDimensions());
			case DOMPackage.METHOD_DECLARATION__NAME:
				return getName() != null;
			case DOMPackage.METHOD_DECLARATION__RETURN_TYPE:
				return getReturnType() != null;
			case DOMPackage.METHOD_DECLARATION__CONSTRUCTOR:
				return CONSTRUCTOR_EDEFAULT == null ? getConstructor() != null : !CONSTRUCTOR_EDEFAULT.equals(getConstructor());
			case DOMPackage.METHOD_DECLARATION__VARARGS:
				return VARARGS_EDEFAULT == null ? getVarargs() != null : !VARARGS_EDEFAULT.equals(getVarargs());
			case DOMPackage.METHOD_DECLARATION__PARAMETERS:
				return !getParameters().isEmpty();
			case DOMPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return !getThrownExceptions().isEmpty();
			case DOMPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case DOMPackage.METHOD_DECLARATION__BINDING:
				return basicGetBinding() != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodDeclarationImpl
