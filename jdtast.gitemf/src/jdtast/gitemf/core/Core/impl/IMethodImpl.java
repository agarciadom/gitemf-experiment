/**
 */
package jdtast.gitemf.core.Core.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IMethod;
import jdtast.gitemf.core.Core.Parameter;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMethodImpl#getIsConstructor <em>Is Constructor</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMethodImpl#getIsMainMethod <em>Is Main Method</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMethodImpl#getExceptionTypes <em>Exception Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMethodImpl extends IMemberImpl implements IMethod {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsConstructor() <em>Is Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONSTRUCTOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsMainMethod() <em>Is Main Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMainMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MAIN_METHOD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return (String)eDynamicGet(CorePackage.IMETHOD__RETURN_TYPE, CorePackage.Literals.IMETHOD__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		eDynamicSet(CorePackage.IMETHOD__RETURN_TYPE, CorePackage.Literals.IMETHOD__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConstructor() {
		return (Boolean)eDynamicGet(CorePackage.IMETHOD__IS_CONSTRUCTOR, CorePackage.Literals.IMETHOD__IS_CONSTRUCTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstructor(Boolean newIsConstructor) {
		eDynamicSet(CorePackage.IMETHOD__IS_CONSTRUCTOR, CorePackage.Literals.IMETHOD__IS_CONSTRUCTOR, newIsConstructor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMainMethod() {
		return (Boolean)eDynamicGet(CorePackage.IMETHOD__IS_MAIN_METHOD, CorePackage.Literals.IMETHOD__IS_MAIN_METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMainMethod(Boolean newIsMainMethod) {
		eDynamicSet(CorePackage.IMETHOD__IS_MAIN_METHOD, CorePackage.Literals.IMETHOD__IS_MAIN_METHOD, newIsMainMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(CorePackage.IMETHOD__PARAMETERS, CorePackage.Literals.IMETHOD__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getExceptionTypes() {
		return (EList<String>)eDynamicGet(CorePackage.IMETHOD__EXCEPTION_TYPES, CorePackage.Literals.IMETHOD__EXCEPTION_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IMETHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IMETHOD__RETURN_TYPE:
				return getReturnType();
			case CorePackage.IMETHOD__IS_CONSTRUCTOR:
				return getIsConstructor();
			case CorePackage.IMETHOD__IS_MAIN_METHOD:
				return getIsMainMethod();
			case CorePackage.IMETHOD__PARAMETERS:
				return getParameters();
			case CorePackage.IMETHOD__EXCEPTION_TYPES:
				return getExceptionTypes();
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
			case CorePackage.IMETHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case CorePackage.IMETHOD__IS_CONSTRUCTOR:
				setIsConstructor((Boolean)newValue);
				return;
			case CorePackage.IMETHOD__IS_MAIN_METHOD:
				setIsMainMethod((Boolean)newValue);
				return;
			case CorePackage.IMETHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case CorePackage.IMETHOD__EXCEPTION_TYPES:
				getExceptionTypes().clear();
				getExceptionTypes().addAll((Collection<? extends String>)newValue);
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
			case CorePackage.IMETHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case CorePackage.IMETHOD__IS_CONSTRUCTOR:
				setIsConstructor(IS_CONSTRUCTOR_EDEFAULT);
				return;
			case CorePackage.IMETHOD__IS_MAIN_METHOD:
				setIsMainMethod(IS_MAIN_METHOD_EDEFAULT);
				return;
			case CorePackage.IMETHOD__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.IMETHOD__EXCEPTION_TYPES:
				getExceptionTypes().clear();
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
			case CorePackage.IMETHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? getReturnType() != null : !RETURN_TYPE_EDEFAULT.equals(getReturnType());
			case CorePackage.IMETHOD__IS_CONSTRUCTOR:
				return IS_CONSTRUCTOR_EDEFAULT == null ? getIsConstructor() != null : !IS_CONSTRUCTOR_EDEFAULT.equals(getIsConstructor());
			case CorePackage.IMETHOD__IS_MAIN_METHOD:
				return IS_MAIN_METHOD_EDEFAULT == null ? getIsMainMethod() != null : !IS_MAIN_METHOD_EDEFAULT.equals(getIsMainMethod());
			case CorePackage.IMETHOD__PARAMETERS:
				return !getParameters().isEmpty();
			case CorePackage.IMETHOD__EXCEPTION_TYPES:
				return !getExceptionTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IMethodImpl
