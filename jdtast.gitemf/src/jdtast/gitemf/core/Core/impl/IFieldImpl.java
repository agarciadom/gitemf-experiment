/**
 */
package jdtast.gitemf.core.Core.impl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IField;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IFieldImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IFieldImpl#getIsEnumConstant <em>Is Enum Constant</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IFieldImpl#getTypeSignature <em>Type Signature</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IFieldImpl#getIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IFieldImpl#getIsTransient <em>Is Transient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IFieldImpl extends IMemberImpl implements IField {
	/**
	 * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsEnumConstant() <em>Is Enum Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEnumConstant()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ENUM_CONSTANT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTypeSignature() <em>Type Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SIGNATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VOLATILE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsTransient() <em>Is Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TRANSIENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant() {
		return (String)eDynamicGet(CorePackage.IFIELD__CONSTANT, CorePackage.Literals.IFIELD__CONSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(String newConstant) {
		eDynamicSet(CorePackage.IFIELD__CONSTANT, CorePackage.Literals.IFIELD__CONSTANT, newConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEnumConstant() {
		return (Boolean)eDynamicGet(CorePackage.IFIELD__IS_ENUM_CONSTANT, CorePackage.Literals.IFIELD__IS_ENUM_CONSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnumConstant(Boolean newIsEnumConstant) {
		eDynamicSet(CorePackage.IFIELD__IS_ENUM_CONSTANT, CorePackage.Literals.IFIELD__IS_ENUM_CONSTANT, newIsEnumConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeSignature() {
		return (String)eDynamicGet(CorePackage.IFIELD__TYPE_SIGNATURE, CorePackage.Literals.IFIELD__TYPE_SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSignature(String newTypeSignature) {
		eDynamicSet(CorePackage.IFIELD__TYPE_SIGNATURE, CorePackage.Literals.IFIELD__TYPE_SIGNATURE, newTypeSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVolatile() {
		return (Boolean)eDynamicGet(CorePackage.IFIELD__IS_VOLATILE, CorePackage.Literals.IFIELD__IS_VOLATILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVolatile(Boolean newIsVolatile) {
		eDynamicSet(CorePackage.IFIELD__IS_VOLATILE, CorePackage.Literals.IFIELD__IS_VOLATILE, newIsVolatile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTransient() {
		return (Boolean)eDynamicGet(CorePackage.IFIELD__IS_TRANSIENT, CorePackage.Literals.IFIELD__IS_TRANSIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransient(Boolean newIsTransient) {
		eDynamicSet(CorePackage.IFIELD__IS_TRANSIENT, CorePackage.Literals.IFIELD__IS_TRANSIENT, newIsTransient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.IFIELD__CONSTANT:
				return getConstant();
			case CorePackage.IFIELD__IS_ENUM_CONSTANT:
				return getIsEnumConstant();
			case CorePackage.IFIELD__TYPE_SIGNATURE:
				return getTypeSignature();
			case CorePackage.IFIELD__IS_VOLATILE:
				return getIsVolatile();
			case CorePackage.IFIELD__IS_TRANSIENT:
				return getIsTransient();
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
			case CorePackage.IFIELD__CONSTANT:
				setConstant((String)newValue);
				return;
			case CorePackage.IFIELD__IS_ENUM_CONSTANT:
				setIsEnumConstant((Boolean)newValue);
				return;
			case CorePackage.IFIELD__TYPE_SIGNATURE:
				setTypeSignature((String)newValue);
				return;
			case CorePackage.IFIELD__IS_VOLATILE:
				setIsVolatile((Boolean)newValue);
				return;
			case CorePackage.IFIELD__IS_TRANSIENT:
				setIsTransient((Boolean)newValue);
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
			case CorePackage.IFIELD__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case CorePackage.IFIELD__IS_ENUM_CONSTANT:
				setIsEnumConstant(IS_ENUM_CONSTANT_EDEFAULT);
				return;
			case CorePackage.IFIELD__TYPE_SIGNATURE:
				setTypeSignature(TYPE_SIGNATURE_EDEFAULT);
				return;
			case CorePackage.IFIELD__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
				return;
			case CorePackage.IFIELD__IS_TRANSIENT:
				setIsTransient(IS_TRANSIENT_EDEFAULT);
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
			case CorePackage.IFIELD__CONSTANT:
				return CONSTANT_EDEFAULT == null ? getConstant() != null : !CONSTANT_EDEFAULT.equals(getConstant());
			case CorePackage.IFIELD__IS_ENUM_CONSTANT:
				return IS_ENUM_CONSTANT_EDEFAULT == null ? getIsEnumConstant() != null : !IS_ENUM_CONSTANT_EDEFAULT.equals(getIsEnumConstant());
			case CorePackage.IFIELD__TYPE_SIGNATURE:
				return TYPE_SIGNATURE_EDEFAULT == null ? getTypeSignature() != null : !TYPE_SIGNATURE_EDEFAULT.equals(getTypeSignature());
			case CorePackage.IFIELD__IS_VOLATILE:
				return IS_VOLATILE_EDEFAULT == null ? getIsVolatile() != null : !IS_VOLATILE_EDEFAULT.equals(getIsVolatile());
			case CorePackage.IFIELD__IS_TRANSIENT:
				return IS_TRANSIENT_EDEFAULT == null ? getIsTransient() != null : !IS_TRANSIENT_EDEFAULT.equals(getIsTransient());
		}
		return super.eIsSet(featureID);
	}

} //IFieldImpl
