/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.IPackageFragment;

import jdtast.gitemf.dom.DOM.Annotation;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Javadoc;
import jdtast.gitemf.dom.DOM.Name;
import jdtast.gitemf.dom.DOM.PackageDeclaration;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PackageDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PackageDeclarationImpl#getJavadoc <em>Javadoc</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PackageDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.PackageDeclarationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDeclarationImpl extends ASTNodeImpl implements PackageDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.PACKAGE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Annotation> getAnnotations() {
		return (EList<Annotation>)eDynamicGet(DOMPackage.PACKAGE_DECLARATION__ANNOTATIONS, DOMPackage.Literals.PACKAGE_DECLARATION__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Javadoc getJavadoc() {
		return (Javadoc)eDynamicGet(DOMPackage.PACKAGE_DECLARATION__JAVADOC, DOMPackage.Literals.PACKAGE_DECLARATION__JAVADOC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavadoc(Javadoc newJavadoc, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newJavadoc, DOMPackage.PACKAGE_DECLARATION__JAVADOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadoc(Javadoc newJavadoc) {
		eDynamicSet(DOMPackage.PACKAGE_DECLARATION__JAVADOC, DOMPackage.Literals.PACKAGE_DECLARATION__JAVADOC, newJavadoc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return (Name)eDynamicGet(DOMPackage.PACKAGE_DECLARATION__NAME, DOMPackage.Literals.PACKAGE_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.PACKAGE_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		eDynamicSet(DOMPackage.PACKAGE_DECLARATION__NAME, DOMPackage.Literals.PACKAGE_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPackageFragment getBinding() {
		return (IPackageFragment)eDynamicGet(DOMPackage.PACKAGE_DECLARATION__BINDING, DOMPackage.Literals.PACKAGE_DECLARATION__BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPackageFragment basicGetBinding() {
		return (IPackageFragment)eDynamicGet(DOMPackage.PACKAGE_DECLARATION__BINDING, DOMPackage.Literals.PACKAGE_DECLARATION__BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(IPackageFragment newBinding) {
		eDynamicSet(DOMPackage.PACKAGE_DECLARATION__BINDING, DOMPackage.Literals.PACKAGE_DECLARATION__BINDING, newBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.PACKAGE_DECLARATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case DOMPackage.PACKAGE_DECLARATION__JAVADOC:
				return basicSetJavadoc(null, msgs);
			case DOMPackage.PACKAGE_DECLARATION__NAME:
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
			case DOMPackage.PACKAGE_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case DOMPackage.PACKAGE_DECLARATION__JAVADOC:
				return getJavadoc();
			case DOMPackage.PACKAGE_DECLARATION__NAME:
				return getName();
			case DOMPackage.PACKAGE_DECLARATION__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
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
			case DOMPackage.PACKAGE_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case DOMPackage.PACKAGE_DECLARATION__JAVADOC:
				setJavadoc((Javadoc)newValue);
				return;
			case DOMPackage.PACKAGE_DECLARATION__NAME:
				setName((Name)newValue);
				return;
			case DOMPackage.PACKAGE_DECLARATION__BINDING:
				setBinding((IPackageFragment)newValue);
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
			case DOMPackage.PACKAGE_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DOMPackage.PACKAGE_DECLARATION__JAVADOC:
				setJavadoc((Javadoc)null);
				return;
			case DOMPackage.PACKAGE_DECLARATION__NAME:
				setName((Name)null);
				return;
			case DOMPackage.PACKAGE_DECLARATION__BINDING:
				setBinding((IPackageFragment)null);
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
			case DOMPackage.PACKAGE_DECLARATION__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case DOMPackage.PACKAGE_DECLARATION__JAVADOC:
				return getJavadoc() != null;
			case DOMPackage.PACKAGE_DECLARATION__NAME:
				return getName() != null;
			case DOMPackage.PACKAGE_DECLARATION__BINDING:
				return basicGetBinding() != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageDeclarationImpl
