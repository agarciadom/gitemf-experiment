/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.SimpleName;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SimpleNameImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.SimpleNameImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleNameImpl extends NameImpl implements SimpleName {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DECLARATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SIMPLE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return (String)eDynamicGet(DOMPackage.SIMPLE_NAME__IDENTIFIER, DOMPackage.Literals.SIMPLE_NAME__IDENTIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		eDynamicSet(DOMPackage.SIMPLE_NAME__IDENTIFIER, DOMPackage.Literals.SIMPLE_NAME__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeclaration() {
		return (Boolean)eDynamicGet(DOMPackage.SIMPLE_NAME__DECLARATION, DOMPackage.Literals.SIMPLE_NAME__DECLARATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(Boolean newDeclaration) {
		eDynamicSet(DOMPackage.SIMPLE_NAME__DECLARATION, DOMPackage.Literals.SIMPLE_NAME__DECLARATION, newDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.SIMPLE_NAME__IDENTIFIER:
				return getIdentifier();
			case DOMPackage.SIMPLE_NAME__DECLARATION:
				return getDeclaration();
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
			case DOMPackage.SIMPLE_NAME__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case DOMPackage.SIMPLE_NAME__DECLARATION:
				setDeclaration((Boolean)newValue);
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
			case DOMPackage.SIMPLE_NAME__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case DOMPackage.SIMPLE_NAME__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
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
			case DOMPackage.SIMPLE_NAME__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? getIdentifier() != null : !IDENTIFIER_EDEFAULT.equals(getIdentifier());
			case DOMPackage.SIMPLE_NAME__DECLARATION:
				return DECLARATION_EDEFAULT == null ? getDeclaration() != null : !DECLARATION_EDEFAULT.equals(getDeclaration());
		}
		return super.eIsSet(featureID);
	}

} //SimpleNameImpl
