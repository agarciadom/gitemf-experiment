/**
 */
package jdtast.gitemf.core.Core.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IJavaModel;
import jdtast.gitemf.core.Core.IJavaProject;
import jdtast.gitemf.core.Core.IPackageFragmentRoot;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IJava Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaModelImpl#getJavaProjects <em>Java Projects</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaModelImpl#getExternalPackageFragmentRoots <em>External Package Fragment Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IJavaModelImpl extends PhysicalElementImpl implements IJavaModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IJavaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IJAVA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IJavaProject> getJavaProjects() {
		return (EList<IJavaProject>)eDynamicGet(CorePackage.IJAVA_MODEL__JAVA_PROJECTS, CorePackage.Literals.IJAVA_MODEL__JAVA_PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IPackageFragmentRoot> getExternalPackageFragmentRoots() {
		return (EList<IPackageFragmentRoot>)eDynamicGet(CorePackage.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS, CorePackage.Literals.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IJAVA_MODEL__JAVA_PROJECTS:
				return ((InternalEList<?>)getJavaProjects()).basicRemove(otherEnd, msgs);
			case CorePackage.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				return ((InternalEList<?>)getExternalPackageFragmentRoots()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IJAVA_MODEL__JAVA_PROJECTS:
				return getJavaProjects();
			case CorePackage.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				return getExternalPackageFragmentRoots();
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
			case CorePackage.IJAVA_MODEL__JAVA_PROJECTS:
				getJavaProjects().clear();
				getJavaProjects().addAll((Collection<? extends IJavaProject>)newValue);
				return;
			case CorePackage.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				getExternalPackageFragmentRoots().clear();
				getExternalPackageFragmentRoots().addAll((Collection<? extends IPackageFragmentRoot>)newValue);
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
			case CorePackage.IJAVA_MODEL__JAVA_PROJECTS:
				getJavaProjects().clear();
				return;
			case CorePackage.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				getExternalPackageFragmentRoots().clear();
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
			case CorePackage.IJAVA_MODEL__JAVA_PROJECTS:
				return !getJavaProjects().isEmpty();
			case CorePackage.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				return !getExternalPackageFragmentRoots().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IJavaModelImpl
