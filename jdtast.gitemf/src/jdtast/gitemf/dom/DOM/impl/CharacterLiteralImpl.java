/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.CharacterLiteral;
import jdtast.gitemf.dom.DOM.DOMPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CharacterLiteralImpl#getCharValue <em>Char Value</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CharacterLiteralImpl#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterLiteralImpl extends ExpressionImpl implements CharacterLiteral {
	/**
	 * The default value of the '{@link #getCharValue() <em>Char Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_VALUE_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CHARACTER_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharValue() {
		return (String)eDynamicGet(DOMPackage.CHARACTER_LITERAL__CHAR_VALUE, DOMPackage.Literals.CHARACTER_LITERAL__CHAR_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharValue(String newCharValue) {
		eDynamicSet(DOMPackage.CHARACTER_LITERAL__CHAR_VALUE, DOMPackage.Literals.CHARACTER_LITERAL__CHAR_VALUE, newCharValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapedValue() {
		return (String)eDynamicGet(DOMPackage.CHARACTER_LITERAL__ESCAPED_VALUE, DOMPackage.Literals.CHARACTER_LITERAL__ESCAPED_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapedValue(String newEscapedValue) {
		eDynamicSet(DOMPackage.CHARACTER_LITERAL__ESCAPED_VALUE, DOMPackage.Literals.CHARACTER_LITERAL__ESCAPED_VALUE, newEscapedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.CHARACTER_LITERAL__CHAR_VALUE:
				return getCharValue();
			case DOMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				return getEscapedValue();
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
			case DOMPackage.CHARACTER_LITERAL__CHAR_VALUE:
				setCharValue((String)newValue);
				return;
			case DOMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				setEscapedValue((String)newValue);
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
			case DOMPackage.CHARACTER_LITERAL__CHAR_VALUE:
				setCharValue(CHAR_VALUE_EDEFAULT);
				return;
			case DOMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				setEscapedValue(ESCAPED_VALUE_EDEFAULT);
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
			case DOMPackage.CHARACTER_LITERAL__CHAR_VALUE:
				return CHAR_VALUE_EDEFAULT == null ? getCharValue() != null : !CHAR_VALUE_EDEFAULT.equals(getCharValue());
			case DOMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				return ESCAPED_VALUE_EDEFAULT == null ? getEscapedValue() != null : !ESCAPED_VALUE_EDEFAULT.equals(getEscapedValue());
		}
		return super.eIsSet(featureID);
	}

} //CharacterLiteralImpl
