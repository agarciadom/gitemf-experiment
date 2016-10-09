/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.core.Core.IType;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ExpressionImpl#getResolveBoxing <em>Resolve Boxing</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ExpressionImpl#getResolveUnboxing <em>Resolve Unboxing</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ExpressionImpl#getTypeBinding <em>Type Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends ASTNodeImpl implements Expression {
	/**
	 * The default value of the '{@link #getResolveBoxing() <em>Resolve Boxing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveBoxing()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESOLVE_BOXING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResolveUnboxing() <em>Resolve Unboxing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveUnboxing()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESOLVE_UNBOXING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getResolveBoxing() {
		return (Boolean)eDynamicGet(DOMPackage.EXPRESSION__RESOLVE_BOXING, DOMPackage.Literals.EXPRESSION__RESOLVE_BOXING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveBoxing(Boolean newResolveBoxing) {
		eDynamicSet(DOMPackage.EXPRESSION__RESOLVE_BOXING, DOMPackage.Literals.EXPRESSION__RESOLVE_BOXING, newResolveBoxing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getResolveUnboxing() {
		return (Boolean)eDynamicGet(DOMPackage.EXPRESSION__RESOLVE_UNBOXING, DOMPackage.Literals.EXPRESSION__RESOLVE_UNBOXING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveUnboxing(Boolean newResolveUnboxing) {
		eDynamicSet(DOMPackage.EXPRESSION__RESOLVE_UNBOXING, DOMPackage.Literals.EXPRESSION__RESOLVE_UNBOXING, newResolveUnboxing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType getTypeBinding() {
		return (IType)eDynamicGet(DOMPackage.EXPRESSION__TYPE_BINDING, DOMPackage.Literals.EXPRESSION__TYPE_BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType basicGetTypeBinding() {
		return (IType)eDynamicGet(DOMPackage.EXPRESSION__TYPE_BINDING, DOMPackage.Literals.EXPRESSION__TYPE_BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeBinding(IType newTypeBinding) {
		eDynamicSet(DOMPackage.EXPRESSION__TYPE_BINDING, DOMPackage.Literals.EXPRESSION__TYPE_BINDING, newTypeBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.EXPRESSION__RESOLVE_BOXING:
				return getResolveBoxing();
			case DOMPackage.EXPRESSION__RESOLVE_UNBOXING:
				return getResolveUnboxing();
			case DOMPackage.EXPRESSION__TYPE_BINDING:
				if (resolve) return getTypeBinding();
				return basicGetTypeBinding();
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
			case DOMPackage.EXPRESSION__RESOLVE_BOXING:
				setResolveBoxing((Boolean)newValue);
				return;
			case DOMPackage.EXPRESSION__RESOLVE_UNBOXING:
				setResolveUnboxing((Boolean)newValue);
				return;
			case DOMPackage.EXPRESSION__TYPE_BINDING:
				setTypeBinding((IType)newValue);
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
			case DOMPackage.EXPRESSION__RESOLVE_BOXING:
				setResolveBoxing(RESOLVE_BOXING_EDEFAULT);
				return;
			case DOMPackage.EXPRESSION__RESOLVE_UNBOXING:
				setResolveUnboxing(RESOLVE_UNBOXING_EDEFAULT);
				return;
			case DOMPackage.EXPRESSION__TYPE_BINDING:
				setTypeBinding((IType)null);
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
			case DOMPackage.EXPRESSION__RESOLVE_BOXING:
				return RESOLVE_BOXING_EDEFAULT == null ? getResolveBoxing() != null : !RESOLVE_BOXING_EDEFAULT.equals(getResolveBoxing());
			case DOMPackage.EXPRESSION__RESOLVE_UNBOXING:
				return RESOLVE_UNBOXING_EDEFAULT == null ? getResolveUnboxing() != null : !RESOLVE_UNBOXING_EDEFAULT.equals(getResolveUnboxing());
			case DOMPackage.EXPRESSION__TYPE_BINDING:
				return basicGetTypeBinding() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionImpl
