/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.AnnotationTypeMemberDeclaration;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.SimpleName;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AnnotationTypeMemberDeclarationImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AnnotationTypeMemberDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.AnnotationTypeMemberDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclarationImpl extends BodyDeclarationImpl implements AnnotationTypeMemberDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefault() {
		return (Expression)eDynamicGet(DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefault, DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Expression newDefault) {
		eDynamicSet(DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, DOMPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return basicSetDefault(null, msgs);
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				return basicSetName(null, msgs);
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return basicSetType(null, msgs);
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
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return getDefault();
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				return getName();
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return getType();
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
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression)newValue);
				return;
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				setName((SimpleName)newValue);
				return;
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((Type)newValue);
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
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression)null);
				return;
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				setName((SimpleName)null);
				return;
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((Type)null);
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
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return getDefault() != null;
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				return getName() != null;
			case DOMPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return getType() != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclarationImpl
