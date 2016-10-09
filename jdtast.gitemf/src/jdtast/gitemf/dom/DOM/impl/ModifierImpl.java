/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Modifier;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getNative <em>Native</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getNone <em>None</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getPublic <em>Public</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ModifierImpl#getVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierImpl extends ASTNodeImpl implements Modifier {
	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FINAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNative()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NATIVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNone()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NONE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIVATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROTECTED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PUBLIC_EDEFAULT = null;

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
	 * The default value of the '{@link #getStrictfp() <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrictfp()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STRICTFP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYNCHRONIZED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRANSIENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VOLATILE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__ABSTRACT, DOMPackage.Literals.MODIFIER__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		eDynamicSet(DOMPackage.MODIFIER__ABSTRACT, DOMPackage.Literals.MODIFIER__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFinal() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__FINAL, DOMPackage.Literals.MODIFIER__FINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(Boolean newFinal) {
		eDynamicSet(DOMPackage.MODIFIER__FINAL, DOMPackage.Literals.MODIFIER__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNative() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__NATIVE, DOMPackage.Literals.MODIFIER__NATIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(Boolean newNative) {
		eDynamicSet(DOMPackage.MODIFIER__NATIVE, DOMPackage.Literals.MODIFIER__NATIVE, newNative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNone() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__NONE, DOMPackage.Literals.MODIFIER__NONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNone(Boolean newNone) {
		eDynamicSet(DOMPackage.MODIFIER__NONE, DOMPackage.Literals.MODIFIER__NONE, newNone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrivate() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__PRIVATE, DOMPackage.Literals.MODIFIER__PRIVATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(Boolean newPrivate) {
		eDynamicSet(DOMPackage.MODIFIER__PRIVATE, DOMPackage.Literals.MODIFIER__PRIVATE, newPrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getProtected() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__PROTECTED, DOMPackage.Literals.MODIFIER__PROTECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(Boolean newProtected) {
		eDynamicSet(DOMPackage.MODIFIER__PROTECTED, DOMPackage.Literals.MODIFIER__PROTECTED, newProtected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPublic() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__PUBLIC, DOMPackage.Literals.MODIFIER__PUBLIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(Boolean newPublic) {
		eDynamicSet(DOMPackage.MODIFIER__PUBLIC, DOMPackage.Literals.MODIFIER__PUBLIC, newPublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__STATIC, DOMPackage.Literals.MODIFIER__STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		eDynamicSet(DOMPackage.MODIFIER__STATIC, DOMPackage.Literals.MODIFIER__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStrictfp() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__STRICTFP, DOMPackage.Literals.MODIFIER__STRICTFP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrictfp(Boolean newStrictfp) {
		eDynamicSet(DOMPackage.MODIFIER__STRICTFP, DOMPackage.Literals.MODIFIER__STRICTFP, newStrictfp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSynchronized() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__SYNCHRONIZED, DOMPackage.Literals.MODIFIER__SYNCHRONIZED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(Boolean newSynchronized) {
		eDynamicSet(DOMPackage.MODIFIER__SYNCHRONIZED, DOMPackage.Literals.MODIFIER__SYNCHRONIZED, newSynchronized);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTransient() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__TRANSIENT, DOMPackage.Literals.MODIFIER__TRANSIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(Boolean newTransient) {
		eDynamicSet(DOMPackage.MODIFIER__TRANSIENT, DOMPackage.Literals.MODIFIER__TRANSIENT, newTransient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVolatile() {
		return (Boolean)eDynamicGet(DOMPackage.MODIFIER__VOLATILE, DOMPackage.Literals.MODIFIER__VOLATILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(Boolean newVolatile) {
		eDynamicSet(DOMPackage.MODIFIER__VOLATILE, DOMPackage.Literals.MODIFIER__VOLATILE, newVolatile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.MODIFIER__ABSTRACT:
				return getAbstract();
			case DOMPackage.MODIFIER__FINAL:
				return getFinal();
			case DOMPackage.MODIFIER__NATIVE:
				return getNative();
			case DOMPackage.MODIFIER__NONE:
				return getNone();
			case DOMPackage.MODIFIER__PRIVATE:
				return getPrivate();
			case DOMPackage.MODIFIER__PROTECTED:
				return getProtected();
			case DOMPackage.MODIFIER__PUBLIC:
				return getPublic();
			case DOMPackage.MODIFIER__STATIC:
				return getStatic();
			case DOMPackage.MODIFIER__STRICTFP:
				return getStrictfp();
			case DOMPackage.MODIFIER__SYNCHRONIZED:
				return getSynchronized();
			case DOMPackage.MODIFIER__TRANSIENT:
				return getTransient();
			case DOMPackage.MODIFIER__VOLATILE:
				return getVolatile();
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
			case DOMPackage.MODIFIER__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__FINAL:
				setFinal((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__NATIVE:
				setNative((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__NONE:
				setNone((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__PROTECTED:
				setProtected((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__PUBLIC:
				setPublic((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__STATIC:
				setStatic((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__STRICTFP:
				setStrictfp((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case DOMPackage.MODIFIER__VOLATILE:
				setVolatile((Boolean)newValue);
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
			case DOMPackage.MODIFIER__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__NONE:
				setNone(NONE_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__PROTECTED:
				setProtected(PROTECTED_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__PUBLIC:
				setPublic(PUBLIC_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__STRICTFP:
				setStrictfp(STRICTFP_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case DOMPackage.MODIFIER__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
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
			case DOMPackage.MODIFIER__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? getAbstract() != null : !ABSTRACT_EDEFAULT.equals(getAbstract());
			case DOMPackage.MODIFIER__FINAL:
				return FINAL_EDEFAULT == null ? getFinal() != null : !FINAL_EDEFAULT.equals(getFinal());
			case DOMPackage.MODIFIER__NATIVE:
				return NATIVE_EDEFAULT == null ? getNative() != null : !NATIVE_EDEFAULT.equals(getNative());
			case DOMPackage.MODIFIER__NONE:
				return NONE_EDEFAULT == null ? getNone() != null : !NONE_EDEFAULT.equals(getNone());
			case DOMPackage.MODIFIER__PRIVATE:
				return PRIVATE_EDEFAULT == null ? getPrivate() != null : !PRIVATE_EDEFAULT.equals(getPrivate());
			case DOMPackage.MODIFIER__PROTECTED:
				return PROTECTED_EDEFAULT == null ? getProtected() != null : !PROTECTED_EDEFAULT.equals(getProtected());
			case DOMPackage.MODIFIER__PUBLIC:
				return PUBLIC_EDEFAULT == null ? getPublic() != null : !PUBLIC_EDEFAULT.equals(getPublic());
			case DOMPackage.MODIFIER__STATIC:
				return STATIC_EDEFAULT == null ? getStatic() != null : !STATIC_EDEFAULT.equals(getStatic());
			case DOMPackage.MODIFIER__STRICTFP:
				return STRICTFP_EDEFAULT == null ? getStrictfp() != null : !STRICTFP_EDEFAULT.equals(getStrictfp());
			case DOMPackage.MODIFIER__SYNCHRONIZED:
				return SYNCHRONIZED_EDEFAULT == null ? getSynchronized() != null : !SYNCHRONIZED_EDEFAULT.equals(getSynchronized());
			case DOMPackage.MODIFIER__TRANSIENT:
				return TRANSIENT_EDEFAULT == null ? getTransient() != null : !TRANSIENT_EDEFAULT.equals(getTransient());
			case DOMPackage.MODIFIER__VOLATILE:
				return VOLATILE_EDEFAULT == null ? getVolatile() != null : !VOLATILE_EDEFAULT.equals(getVolatile());
		}
		return super.eIsSet(featureID);
	}

} //ModifierImpl
