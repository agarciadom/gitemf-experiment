/**
 */
package jdtast.gitemf.core.Core.impl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IClassFile;
import jdtast.gitemf.core.Core.IType;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IClass File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IClassFileImpl#getIsClass <em>Is Class</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IClassFileImpl#getIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IClassFileImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IClassFileImpl extends ITypeRootImpl implements IClassFile {
	/**
	 * The default value of the '{@link #getIsClass() <em>Is Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsClass()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CLASS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterface()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INTERFACE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IClassFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ICLASS_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsClass() {
		return (Boolean)eDynamicGet(CorePackage.ICLASS_FILE__IS_CLASS, CorePackage.Literals.ICLASS_FILE__IS_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClass(Boolean newIsClass) {
		eDynamicSet(CorePackage.ICLASS_FILE__IS_CLASS, CorePackage.Literals.ICLASS_FILE__IS_CLASS, newIsClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInterface() {
		return (Boolean)eDynamicGet(CorePackage.ICLASS_FILE__IS_INTERFACE, CorePackage.Literals.ICLASS_FILE__IS_INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterface(Boolean newIsInterface) {
		eDynamicSet(CorePackage.ICLASS_FILE__IS_INTERFACE, CorePackage.Literals.ICLASS_FILE__IS_INTERFACE, newIsInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType getType() {
		return (IType)eDynamicGet(CorePackage.ICLASS_FILE__TYPE, CorePackage.Literals.ICLASS_FILE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(IType newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, CorePackage.ICLASS_FILE__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IType newType) {
		eDynamicSet(CorePackage.ICLASS_FILE__TYPE, CorePackage.Literals.ICLASS_FILE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ICLASS_FILE__TYPE:
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
			case CorePackage.ICLASS_FILE__IS_CLASS:
				return getIsClass();
			case CorePackage.ICLASS_FILE__IS_INTERFACE:
				return getIsInterface();
			case CorePackage.ICLASS_FILE__TYPE:
				return getType();
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
			case CorePackage.ICLASS_FILE__IS_CLASS:
				setIsClass((Boolean)newValue);
				return;
			case CorePackage.ICLASS_FILE__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case CorePackage.ICLASS_FILE__TYPE:
				setType((IType)newValue);
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
			case CorePackage.ICLASS_FILE__IS_CLASS:
				setIsClass(IS_CLASS_EDEFAULT);
				return;
			case CorePackage.ICLASS_FILE__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case CorePackage.ICLASS_FILE__TYPE:
				setType((IType)null);
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
			case CorePackage.ICLASS_FILE__IS_CLASS:
				return IS_CLASS_EDEFAULT == null ? getIsClass() != null : !IS_CLASS_EDEFAULT.equals(getIsClass());
			case CorePackage.ICLASS_FILE__IS_INTERFACE:
				return IS_INTERFACE_EDEFAULT == null ? getIsInterface() != null : !IS_INTERFACE_EDEFAULT.equals(getIsInterface());
			case CorePackage.ICLASS_FILE__TYPE:
				return getType() != null;
		}
		return super.eIsSet(featureID);
	}

} //IClassFileImpl
