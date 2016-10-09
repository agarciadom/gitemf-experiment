/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.AnonymousClassDeclaration;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.EnumConstantDeclaration;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.SimpleName;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.EnumConstantDeclarationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.EnumConstantDeclarationImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.EnumConstantDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantDeclarationImpl extends BodyDeclarationImpl implements EnumConstantDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ENUM_CONSTANT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(DOMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS, DOMPackage.Literals.ENUM_CONSTANT_DECLARATION__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration getAnonymousClassDeclaration() {
		return (AnonymousClassDeclaration)eDynamicGet(DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, DOMPackage.Literals.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAnonymousClassDeclaration, DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration) {
		eDynamicSet(DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, DOMPackage.Literals.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, newAnonymousClassDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.ENUM_CONSTANT_DECLARATION__NAME, DOMPackage.Literals.ENUM_CONSTANT_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.ENUM_CONSTANT_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.ENUM_CONSTANT_DECLARATION__NAME, DOMPackage.Literals.ENUM_CONSTANT_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return basicSetAnonymousClassDeclaration(null, msgs);
			case DOMPackage.ENUM_CONSTANT_DECLARATION__NAME:
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
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return getArguments();
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration();
			case DOMPackage.ENUM_CONSTANT_DECLARATION__NAME:
				return getName();
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
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration)newValue);
				return;
			case DOMPackage.ENUM_CONSTANT_DECLARATION__NAME:
				setName((SimpleName)newValue);
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
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				getArguments().clear();
				return;
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration)null);
				return;
			case DOMPackage.ENUM_CONSTANT_DECLARATION__NAME:
				setName((SimpleName)null);
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
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return !getArguments().isEmpty();
			case DOMPackage.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration() != null;
			case DOMPackage.ENUM_CONSTANT_DECLARATION__NAME:
				return getName() != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumConstantDeclarationImpl
