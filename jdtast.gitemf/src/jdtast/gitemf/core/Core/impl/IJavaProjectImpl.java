/**
 */
package jdtast.gitemf.core.Core.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IJavaProject;
import jdtast.gitemf.core.Core.IPackageFragmentRoot;
import jdtast.gitemf.core.Core.PhysicalElement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IJava Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaProjectImpl#getPath <em>Path</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaProjectImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaProjectImpl#getPackageFragmentRoots <em>Package Fragment Roots</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaProjectImpl#getExternalPackageFragmentRoots <em>External Package Fragment Roots</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IJavaProjectImpl#getRequiredProjects <em>Required Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IJavaProjectImpl extends IJavaElementImpl implements IJavaProject {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IJavaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IJAVA_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eDynamicGet(CorePackage.IJAVA_PROJECT__PATH, CorePackage.Literals.PHYSICAL_ELEMENT__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eDynamicSet(CorePackage.IJAVA_PROJECT__PATH, CorePackage.Literals.PHYSICAL_ELEMENT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return (Boolean)eDynamicGet(CorePackage.IJAVA_PROJECT__IS_READ_ONLY, CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		eDynamicSet(CorePackage.IJAVA_PROJECT__IS_READ_ONLY, CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, newIsReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IPackageFragmentRoot> getPackageFragmentRoots() {
		return (EList<IPackageFragmentRoot>)eDynamicGet(CorePackage.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS, CorePackage.Literals.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IPackageFragmentRoot> getExternalPackageFragmentRoots() {
		return (EList<IPackageFragmentRoot>)eDynamicGet(CorePackage.IJAVA_PROJECT__EXTERNAL_PACKAGE_FRAGMENT_ROOTS, CorePackage.Literals.IJAVA_PROJECT__EXTERNAL_PACKAGE_FRAGMENT_ROOTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IJavaProject> getRequiredProjects() {
		return (EList<IJavaProject>)eDynamicGet(CorePackage.IJAVA_PROJECT__REQUIRED_PROJECTS, CorePackage.Literals.IJAVA_PROJECT__REQUIRED_PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return ((InternalEList<?>)getPackageFragmentRoots()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IJAVA_PROJECT__PATH:
				return getPath();
			case CorePackage.IJAVA_PROJECT__IS_READ_ONLY:
				return getIsReadOnly();
			case CorePackage.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return getPackageFragmentRoots();
			case CorePackage.IJAVA_PROJECT__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				return getExternalPackageFragmentRoots();
			case CorePackage.IJAVA_PROJECT__REQUIRED_PROJECTS:
				return getRequiredProjects();
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
			case CorePackage.IJAVA_PROJECT__PATH:
				setPath((String)newValue);
				return;
			case CorePackage.IJAVA_PROJECT__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case CorePackage.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				getPackageFragmentRoots().clear();
				getPackageFragmentRoots().addAll((Collection<? extends IPackageFragmentRoot>)newValue);
				return;
			case CorePackage.IJAVA_PROJECT__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				getExternalPackageFragmentRoots().clear();
				getExternalPackageFragmentRoots().addAll((Collection<? extends IPackageFragmentRoot>)newValue);
				return;
			case CorePackage.IJAVA_PROJECT__REQUIRED_PROJECTS:
				getRequiredProjects().clear();
				getRequiredProjects().addAll((Collection<? extends IJavaProject>)newValue);
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
			case CorePackage.IJAVA_PROJECT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CorePackage.IJAVA_PROJECT__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case CorePackage.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				getPackageFragmentRoots().clear();
				return;
			case CorePackage.IJAVA_PROJECT__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				getExternalPackageFragmentRoots().clear();
				return;
			case CorePackage.IJAVA_PROJECT__REQUIRED_PROJECTS:
				getRequiredProjects().clear();
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
			case CorePackage.IJAVA_PROJECT__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case CorePackage.IJAVA_PROJECT__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? getIsReadOnly() != null : !IS_READ_ONLY_EDEFAULT.equals(getIsReadOnly());
			case CorePackage.IJAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return !getPackageFragmentRoots().isEmpty();
			case CorePackage.IJAVA_PROJECT__EXTERNAL_PACKAGE_FRAGMENT_ROOTS:
				return !getExternalPackageFragmentRoots().isEmpty();
			case CorePackage.IJAVA_PROJECT__REQUIRED_PROJECTS:
				return !getRequiredProjects().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PhysicalElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.IJAVA_PROJECT__PATH: return CorePackage.PHYSICAL_ELEMENT__PATH;
				case CorePackage.IJAVA_PROJECT__IS_READ_ONLY: return CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PhysicalElement.class) {
			switch (baseFeatureID) {
				case CorePackage.PHYSICAL_ELEMENT__PATH: return CorePackage.IJAVA_PROJECT__PATH;
				case CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY: return CorePackage.IJAVA_PROJECT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IJavaProjectImpl
