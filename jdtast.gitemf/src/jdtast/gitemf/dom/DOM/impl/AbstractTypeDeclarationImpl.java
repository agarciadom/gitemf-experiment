/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.AbstractTypeDeclaration;
import jdtast.gitemf.dom.DOM.BodyDeclaration;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.SimpleName;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AbstractTypeDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AbstractTypeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AbstractTypeDeclarationImpl#getLocalTypeDeclaration <em>Local Type Declaration</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AbstractTypeDeclarationImpl#getMemberTypeDeclaration <em>Member Type Declaration</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AbstractTypeDeclarationImpl#getPackageMemberTypeDeclaration <em>Package Member Type Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeDeclarationImpl extends BodyDeclarationImpl implements AbstractTypeDeclaration {
	/**
	 * The default value of the '{@link #getLocalTypeDeclaration() <em>Local Type Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCAL_TYPE_DECLARATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMemberTypeDeclaration() <em>Member Type Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MEMBER_TYPE_DECLARATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPackageMemberTypeDeclaration() <em>Package Member Type Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMemberTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PACKAGE_MEMBER_TYPE_DECLARATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> getBodyDeclarations() {
		return (EList<BodyDeclaration>)eDynamicGet(DOMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLocalTypeDeclaration() {
		return (Boolean)eDynamicGet(DOMPackage.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalTypeDeclaration(Boolean newLocalTypeDeclaration) {
		eDynamicSet(DOMPackage.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION, newLocalTypeDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMemberTypeDeclaration() {
		return (Boolean)eDynamicGet(DOMPackage.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberTypeDeclaration(Boolean newMemberTypeDeclaration) {
		eDynamicSet(DOMPackage.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION, newMemberTypeDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPackageMemberTypeDeclaration() {
		return (Boolean)eDynamicGet(DOMPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageMemberTypeDeclaration(Boolean newPackageMemberTypeDeclaration) {
		eDynamicSet(DOMPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION, DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION, newPackageMemberTypeDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<?>)getBodyDeclarations()).basicRemove(otherEnd, msgs);
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME:
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
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME:
				return getName();
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION:
				return getLocalTypeDeclaration();
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION:
				return getMemberTypeDeclaration();
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION:
				return getPackageMemberTypeDeclaration();
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
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((Collection<? extends BodyDeclaration>)newValue);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION:
				setLocalTypeDeclaration((Boolean)newValue);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION:
				setMemberTypeDeclaration((Boolean)newValue);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION:
				setPackageMemberTypeDeclaration((Boolean)newValue);
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
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION:
				setLocalTypeDeclaration(LOCAL_TYPE_DECLARATION_EDEFAULT);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION:
				setMemberTypeDeclaration(MEMBER_TYPE_DECLARATION_EDEFAULT);
				return;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION:
				setPackageMemberTypeDeclaration(PACKAGE_MEMBER_TYPE_DECLARATION_EDEFAULT);
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
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return !getBodyDeclarations().isEmpty();
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__NAME:
				return getName() != null;
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION:
				return LOCAL_TYPE_DECLARATION_EDEFAULT == null ? getLocalTypeDeclaration() != null : !LOCAL_TYPE_DECLARATION_EDEFAULT.equals(getLocalTypeDeclaration());
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION:
				return MEMBER_TYPE_DECLARATION_EDEFAULT == null ? getMemberTypeDeclaration() != null : !MEMBER_TYPE_DECLARATION_EDEFAULT.equals(getMemberTypeDeclaration());
			case DOMPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION:
				return PACKAGE_MEMBER_TYPE_DECLARATION_EDEFAULT == null ? getPackageMemberTypeDeclaration() != null : !PACKAGE_MEMBER_TYPE_DECLARATION_EDEFAULT.equals(getPackageMemberTypeDeclaration());
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypeDeclarationImpl
