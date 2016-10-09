/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.StringLiteral;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.StringLiteralImpl#getEscapedValue <em>Escaped Value</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.StringLiteralImpl#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLiteralImpl extends ExpressionImpl implements StringLiteral {
	/**
	 * The default value of the '{@link #getEscapedValue() <em>Escaped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPED_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLiteralValue() <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralValue()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.STRING_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapedValue() {
		return (String)eDynamicGet(DOMPackage.STRING_LITERAL__ESCAPED_VALUE, DOMPackage.Literals.STRING_LITERAL__ESCAPED_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapedValue(String newEscapedValue) {
		eDynamicSet(DOMPackage.STRING_LITERAL__ESCAPED_VALUE, DOMPackage.Literals.STRING_LITERAL__ESCAPED_VALUE, newEscapedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteralValue() {
		return (String)eDynamicGet(DOMPackage.STRING_LITERAL__LITERAL_VALUE, DOMPackage.Literals.STRING_LITERAL__LITERAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralValue(String newLiteralValue) {
		eDynamicSet(DOMPackage.STRING_LITERAL__LITERAL_VALUE, DOMPackage.Literals.STRING_LITERAL__LITERAL_VALUE, newLiteralValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.STRING_LITERAL__ESCAPED_VALUE:
				return getEscapedValue();
			case DOMPackage.STRING_LITERAL__LITERAL_VALUE:
				return getLiteralValue();
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
			case DOMPackage.STRING_LITERAL__ESCAPED_VALUE:
				setEscapedValue((String)newValue);
				return;
			case DOMPackage.STRING_LITERAL__LITERAL_VALUE:
				setLiteralValue((String)newValue);
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
			case DOMPackage.STRING_LITERAL__ESCAPED_VALUE:
				setEscapedValue(ESCAPED_VALUE_EDEFAULT);
				return;
			case DOMPackage.STRING_LITERAL__LITERAL_VALUE:
				setLiteralValue(LITERAL_VALUE_EDEFAULT);
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
			case DOMPackage.STRING_LITERAL__ESCAPED_VALUE:
				return ESCAPED_VALUE_EDEFAULT == null ? getEscapedValue() != null : !ESCAPED_VALUE_EDEFAULT.equals(getEscapedValue());
			case DOMPackage.STRING_LITERAL__LITERAL_VALUE:
				return LITERAL_VALUE_EDEFAULT == null ? getLiteralValue() != null : !LITERAL_VALUE_EDEFAULT.equals(getLiteralValue());
		}
		return super.eIsSet(featureID);
	}

} //StringLiteralImpl
