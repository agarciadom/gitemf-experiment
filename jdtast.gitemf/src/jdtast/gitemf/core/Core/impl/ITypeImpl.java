/**
 */
package jdtast.gitemf.core.Core.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IField;
import jdtast.gitemf.core.Core.IInitializer;
import jdtast.gitemf.core.Core.IMethod;
import jdtast.gitemf.core.Core.IType;
import jdtast.gitemf.core.Core.ITypeParameter;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getFullyQualifiedParametrizedName <em>Fully Qualified Parametrized Name</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ITypeImpl extends IMemberImpl implements IType {
	/**
	 * The default value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFullyQualifiedParametrizedName() <em>Fully Qualified Parametrized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedParametrizedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ITYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName() {
		return (String)eDynamicGet(CorePackage.ITYPE__FULLY_QUALIFIED_NAME, CorePackage.Literals.ITYPE__FULLY_QUALIFIED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedName(String newFullyQualifiedName) {
		eDynamicSet(CorePackage.ITYPE__FULLY_QUALIFIED_NAME, CorePackage.Literals.ITYPE__FULLY_QUALIFIED_NAME, newFullyQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedParametrizedName() {
		return (String)eDynamicGet(CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, CorePackage.Literals.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedParametrizedName(String newFullyQualifiedParametrizedName) {
		eDynamicSet(CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, CorePackage.Literals.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, newFullyQualifiedParametrizedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IInitializer> getInitializers() {
		return (EList<IInitializer>)eDynamicGet(CorePackage.ITYPE__INITIALIZERS, CorePackage.Literals.ITYPE__INITIALIZERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IField> getFields() {
		return (EList<IField>)eDynamicGet(CorePackage.ITYPE__FIELDS, CorePackage.Literals.ITYPE__FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IMethod> getMethods() {
		return (EList<IMethod>)eDynamicGet(CorePackage.ITYPE__METHODS, CorePackage.Literals.ITYPE__METHODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IType> getTypes() {
		return (EList<IType>)eDynamicGet(CorePackage.ITYPE__TYPES, CorePackage.Literals.ITYPE__TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ITypeParameter> getTypeParameters() {
		return (EList<ITypeParameter>)eDynamicGet(CorePackage.ITYPE__TYPE_PARAMETERS, CorePackage.Literals.ITYPE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ITYPE__INITIALIZERS:
				return ((InternalEList<?>)getInitializers()).basicRemove(otherEnd, msgs);
			case CorePackage.ITYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case CorePackage.ITYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case CorePackage.ITYPE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				return getFullyQualifiedParametrizedName();
			case CorePackage.ITYPE__INITIALIZERS:
				return getInitializers();
			case CorePackage.ITYPE__FIELDS:
				return getFields();
			case CorePackage.ITYPE__METHODS:
				return getMethods();
			case CorePackage.ITYPE__TYPES:
				return getTypes();
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				return getTypeParameters();
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName((String)newValue);
				return;
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				setFullyQualifiedParametrizedName((String)newValue);
				return;
			case CorePackage.ITYPE__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection<? extends IInitializer>)newValue);
				return;
			case CorePackage.ITYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends IField>)newValue);
				return;
			case CorePackage.ITYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends IMethod>)newValue);
				return;
			case CorePackage.ITYPE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends IType>)newValue);
				return;
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends ITypeParameter>)newValue);
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName(FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				setFullyQualifiedParametrizedName(FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT);
				return;
			case CorePackage.ITYPE__INITIALIZERS:
				getInitializers().clear();
				return;
			case CorePackage.ITYPE__FIELDS:
				getFields().clear();
				return;
			case CorePackage.ITYPE__METHODS:
				getMethods().clear();
				return;
			case CorePackage.ITYPE__TYPES:
				getTypes().clear();
				return;
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				getTypeParameters().clear();
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				return FULLY_QUALIFIED_NAME_EDEFAULT == null ? getFullyQualifiedName() != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(getFullyQualifiedName());
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				return FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT == null ? getFullyQualifiedParametrizedName() != null : !FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT.equals(getFullyQualifiedParametrizedName());
			case CorePackage.ITYPE__INITIALIZERS:
				return !getInitializers().isEmpty();
			case CorePackage.ITYPE__FIELDS:
				return !getFields().isEmpty();
			case CorePackage.ITYPE__METHODS:
				return !getMethods().isEmpty();
			case CorePackage.ITYPE__TYPES:
				return !getTypes().isEmpty();
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ITypeImpl
