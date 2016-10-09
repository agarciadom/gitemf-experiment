/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.BooleanLiteral;
import jdtast.gitemf.dom.DOM.DOMPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.BooleanLiteralImpl#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanLiteralImpl extends ExpressionImpl implements BooleanLiteral {
	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.BOOLEAN_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBooleanValue() {
		return (Boolean)eDynamicGet(DOMPackage.BOOLEAN_LITERAL__BOOLEAN_VALUE, DOMPackage.Literals.BOOLEAN_LITERAL__BOOLEAN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(Boolean newBooleanValue) {
		eDynamicSet(DOMPackage.BOOLEAN_LITERAL__BOOLEAN_VALUE, DOMPackage.Literals.BOOLEAN_LITERAL__BOOLEAN_VALUE, newBooleanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.BOOLEAN_LITERAL__BOOLEAN_VALUE:
				return getBooleanValue();
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
			case DOMPackage.BOOLEAN_LITERAL__BOOLEAN_VALUE:
				setBooleanValue((Boolean)newValue);
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
			case DOMPackage.BOOLEAN_LITERAL__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
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
			case DOMPackage.BOOLEAN_LITERAL__BOOLEAN_VALUE:
				return BOOLEAN_VALUE_EDEFAULT == null ? getBooleanValue() != null : !BOOLEAN_VALUE_EDEFAULT.equals(getBooleanValue());
		}
		return super.eIsSet(featureID);
	}

} //BooleanLiteralImpl
