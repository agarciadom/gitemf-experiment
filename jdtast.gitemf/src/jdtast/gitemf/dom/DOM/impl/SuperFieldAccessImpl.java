/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Name;
import jdtast.gitemf.dom.DOM.SimpleName;
import jdtast.gitemf.dom.DOM.SuperFieldAccess;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Field Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperFieldAccessImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SuperFieldAccessImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperFieldAccessImpl extends ExpressionImpl implements SuperFieldAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperFieldAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SUPER_FIELD_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.SUPER_FIELD_ACCESS__NAME, DOMPackage.Literals.SUPER_FIELD_ACCESS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.SUPER_FIELD_ACCESS__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.SUPER_FIELD_ACCESS__NAME, DOMPackage.Literals.SUPER_FIELD_ACCESS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getQualifier() {
		return (Name)eDynamicGet(DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER, DOMPackage.Literals.SUPER_FIELD_ACCESS__QUALIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(Name newQualifier, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newQualifier, DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Name newQualifier) {
		eDynamicSet(DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER, DOMPackage.Literals.SUPER_FIELD_ACCESS__QUALIFIER, newQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.SUPER_FIELD_ACCESS__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER:
				return basicSetQualifier(null, msgs);
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
			case DOMPackage.SUPER_FIELD_ACCESS__NAME:
				return getName();
			case DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER:
				return getQualifier();
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
			case DOMPackage.SUPER_FIELD_ACCESS__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER:
				setQualifier((Name)newValue);
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
			case DOMPackage.SUPER_FIELD_ACCESS__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER:
				setQualifier((Name)null);
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
			case DOMPackage.SUPER_FIELD_ACCESS__NAME:
				return getName() != null;
			case DOMPackage.SUPER_FIELD_ACCESS__QUALIFIER:
				return getQualifier() != null;
		}
		return super.eIsSet(featureID);
	}

} //SuperFieldAccessImpl
