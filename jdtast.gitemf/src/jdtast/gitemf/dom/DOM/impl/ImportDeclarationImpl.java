/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.ImportDeclaration;
import jdtast.gitemf.dom.DOM.Name;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ImportDeclarationImpl#getOnDemand <em>On Demand</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ImportDeclarationImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ImportDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportDeclarationImpl extends ASTNodeImpl implements ImportDeclaration {
	/**
	 * The default value of the '{@link #getOnDemand() <em>On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDemand()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_DEMAND_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.IMPORT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOnDemand() {
		return (Boolean)eDynamicGet(DOMPackage.IMPORT_DECLARATION__ON_DEMAND, DOMPackage.Literals.IMPORT_DECLARATION__ON_DEMAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDemand(Boolean newOnDemand) {
		eDynamicSet(DOMPackage.IMPORT_DECLARATION__ON_DEMAND, DOMPackage.Literals.IMPORT_DECLARATION__ON_DEMAND, newOnDemand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return (Boolean)eDynamicGet(DOMPackage.IMPORT_DECLARATION__STATIC, DOMPackage.Literals.IMPORT_DECLARATION__STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		eDynamicSet(DOMPackage.IMPORT_DECLARATION__STATIC, DOMPackage.Literals.IMPORT_DECLARATION__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return (Name)eDynamicGet(DOMPackage.IMPORT_DECLARATION__NAME, DOMPackage.Literals.IMPORT_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.IMPORT_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		eDynamicSet(DOMPackage.IMPORT_DECLARATION__NAME, DOMPackage.Literals.IMPORT_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.IMPORT_DECLARATION__NAME:
				return basicSetName(null, msgs);
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
			case DOMPackage.IMPORT_DECLARATION__ON_DEMAND:
				return getOnDemand();
			case DOMPackage.IMPORT_DECLARATION__STATIC:
				return getStatic();
			case DOMPackage.IMPORT_DECLARATION__NAME:
				return getName();
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
			case DOMPackage.IMPORT_DECLARATION__ON_DEMAND:
				setOnDemand((Boolean)newValue);
				return;
			case DOMPackage.IMPORT_DECLARATION__STATIC:
				setStatic((Boolean)newValue);
				return;
			case DOMPackage.IMPORT_DECLARATION__NAME:
				setName((Name)newValue);
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
			case DOMPackage.IMPORT_DECLARATION__ON_DEMAND:
				setOnDemand(ON_DEMAND_EDEFAULT);
				return;
			case DOMPackage.IMPORT_DECLARATION__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case DOMPackage.IMPORT_DECLARATION__NAME:
				setName((Name)null);
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
			case DOMPackage.IMPORT_DECLARATION__ON_DEMAND:
				return ON_DEMAND_EDEFAULT == null ? getOnDemand() != null : !ON_DEMAND_EDEFAULT.equals(getOnDemand());
			case DOMPackage.IMPORT_DECLARATION__STATIC:
				return STATIC_EDEFAULT == null ? getStatic() != null : !STATIC_EDEFAULT.equals(getStatic());
			case DOMPackage.IMPORT_DECLARATION__NAME:
				return getName() != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportDeclarationImpl
