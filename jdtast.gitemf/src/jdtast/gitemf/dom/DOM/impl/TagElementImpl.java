/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.ASTNode;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.TagElement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TagElementImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TagElementImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TagElementImpl#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagElementImpl extends ASTNodeImpl implements TagElement {
	/**
	 * The default value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagName()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNested() <em>Nested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NESTED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TAG_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ASTNode> getFragments() {
		return (EList<ASTNode>)eDynamicGet(DOMPackage.TAG_ELEMENT__FRAGMENTS, DOMPackage.Literals.TAG_ELEMENT__FRAGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagName() {
		return (String)eDynamicGet(DOMPackage.TAG_ELEMENT__TAG_NAME, DOMPackage.Literals.TAG_ELEMENT__TAG_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagName(String newTagName) {
		eDynamicSet(DOMPackage.TAG_ELEMENT__TAG_NAME, DOMPackage.Literals.TAG_ELEMENT__TAG_NAME, newTagName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNested() {
		return (Boolean)eDynamicGet(DOMPackage.TAG_ELEMENT__NESTED, DOMPackage.Literals.TAG_ELEMENT__NESTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNested(Boolean newNested) {
		eDynamicSet(DOMPackage.TAG_ELEMENT__NESTED, DOMPackage.Literals.TAG_ELEMENT__NESTED, newNested);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.TAG_ELEMENT__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.TAG_ELEMENT__FRAGMENTS:
				return getFragments();
			case DOMPackage.TAG_ELEMENT__TAG_NAME:
				return getTagName();
			case DOMPackage.TAG_ELEMENT__NESTED:
				return getNested();
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
			case DOMPackage.TAG_ELEMENT__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends ASTNode>)newValue);
				return;
			case DOMPackage.TAG_ELEMENT__TAG_NAME:
				setTagName((String)newValue);
				return;
			case DOMPackage.TAG_ELEMENT__NESTED:
				setNested((Boolean)newValue);
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
			case DOMPackage.TAG_ELEMENT__FRAGMENTS:
				getFragments().clear();
				return;
			case DOMPackage.TAG_ELEMENT__TAG_NAME:
				setTagName(TAG_NAME_EDEFAULT);
				return;
			case DOMPackage.TAG_ELEMENT__NESTED:
				setNested(NESTED_EDEFAULT);
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
			case DOMPackage.TAG_ELEMENT__FRAGMENTS:
				return !getFragments().isEmpty();
			case DOMPackage.TAG_ELEMENT__TAG_NAME:
				return TAG_NAME_EDEFAULT == null ? getTagName() != null : !TAG_NAME_EDEFAULT.equals(getTagName());
			case DOMPackage.TAG_ELEMENT__NESTED:
				return NESTED_EDEFAULT == null ? getNested() != null : !NESTED_EDEFAULT.equals(getNested());
		}
		return super.eIsSet(featureID);
	}

} //TagElementImpl
