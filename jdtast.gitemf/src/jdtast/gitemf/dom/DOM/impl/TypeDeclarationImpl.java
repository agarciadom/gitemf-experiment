/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Type;
import jdtast.gitemf.dom.DOM.TypeDeclaration;
import jdtast.gitemf.dom.DOM.TypeParameter;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TypeDeclarationImpl#getSuperclassType <em>Superclass Type</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TypeDeclarationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TypeDeclarationImpl#getSuperInterfaceTypes <em>Super Interface Types</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TypeDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationImpl extends AbstractTypeDeclarationImpl implements TypeDeclaration {
	/**
	 * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERFACE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSuperclassType() {
		return (Type)eDynamicGet(DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE, DOMPackage.Literals.TYPE_DECLARATION__SUPERCLASS_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperclassType(Type newSuperclassType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSuperclassType, DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclassType(Type newSuperclassType) {
		eDynamicSet(DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE, DOMPackage.Literals.TYPE_DECLARATION__SUPERCLASS_TYPE, newSuperclassType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInterface() {
		return (Boolean)eDynamicGet(DOMPackage.TYPE_DECLARATION__INTERFACE, DOMPackage.Literals.TYPE_DECLARATION__INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Boolean newInterface) {
		eDynamicSet(DOMPackage.TYPE_DECLARATION__INTERFACE, DOMPackage.Literals.TYPE_DECLARATION__INTERFACE, newInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getSuperInterfaceTypes() {
		return (EList<Type>)eDynamicGet(DOMPackage.TYPE_DECLARATION__SUPER_INTERFACE_TYPES, DOMPackage.Literals.TYPE_DECLARATION__SUPER_INTERFACE_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(DOMPackage.TYPE_DECLARATION__TYPE_PARAMETERS, DOMPackage.Literals.TYPE_DECLARATION__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE:
				return basicSetSuperclassType(null, msgs);
			case DOMPackage.TYPE_DECLARATION__SUPER_INTERFACE_TYPES:
				return ((InternalEList<?>)getSuperInterfaceTypes()).basicRemove(otherEnd, msgs);
			case DOMPackage.TYPE_DECLARATION__TYPE_PARAMETERS:
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
			case DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE:
				return getSuperclassType();
			case DOMPackage.TYPE_DECLARATION__INTERFACE:
				return getInterface();
			case DOMPackage.TYPE_DECLARATION__SUPER_INTERFACE_TYPES:
				return getSuperInterfaceTypes();
			case DOMPackage.TYPE_DECLARATION__TYPE_PARAMETERS:
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
			case DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE:
				setSuperclassType((Type)newValue);
				return;
			case DOMPackage.TYPE_DECLARATION__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case DOMPackage.TYPE_DECLARATION__SUPER_INTERFACE_TYPES:
				getSuperInterfaceTypes().clear();
				getSuperInterfaceTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case DOMPackage.TYPE_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
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
			case DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE:
				setSuperclassType((Type)null);
				return;
			case DOMPackage.TYPE_DECLARATION__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case DOMPackage.TYPE_DECLARATION__SUPER_INTERFACE_TYPES:
				getSuperInterfaceTypes().clear();
				return;
			case DOMPackage.TYPE_DECLARATION__TYPE_PARAMETERS:
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
			case DOMPackage.TYPE_DECLARATION__SUPERCLASS_TYPE:
				return getSuperclassType() != null;
			case DOMPackage.TYPE_DECLARATION__INTERFACE:
				return INTERFACE_EDEFAULT == null ? getInterface() != null : !INTERFACE_EDEFAULT.equals(getInterface());
			case DOMPackage.TYPE_DECLARATION__SUPER_INTERFACE_TYPES:
				return !getSuperInterfaceTypes().isEmpty();
			case DOMPackage.TYPE_DECLARATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeDeclarationImpl
