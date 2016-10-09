/**
 */
package jdtast.gitemf.core.Core.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IClassFile;
import jdtast.gitemf.core.Core.ICompilationUnit;
import jdtast.gitemf.core.Core.IPackageFragment;
import jdtast.gitemf.core.Core.IPackageFragmentRoot;
import jdtast.gitemf.core.Core.PhysicalElement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPackage Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IPackageFragmentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IPackageFragmentImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IPackageFragmentImpl#getIsDefaultPackage <em>Is Default Package</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IPackageFragmentImpl#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IPackageFragmentImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IPackageFragmentImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPackageFragmentImpl extends IJavaElementImpl implements IPackageFragment {
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
	 * The default value of the '{@link #getIsDefaultPackage() <em>Is Default Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefaultPackage()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_PACKAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPackageFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IPACKAGE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eDynamicGet(CorePackage.IPACKAGE_FRAGMENT__PATH, CorePackage.Literals.PHYSICAL_ELEMENT__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eDynamicSet(CorePackage.IPACKAGE_FRAGMENT__PATH, CorePackage.Literals.PHYSICAL_ELEMENT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return (Boolean)eDynamicGet(CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY, CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		eDynamicSet(CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY, CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, newIsReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDefaultPackage() {
		return (Boolean)eDynamicGet(CorePackage.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE, CorePackage.Literals.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefaultPackage(Boolean newIsDefaultPackage) {
		eDynamicSet(CorePackage.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE, CorePackage.Literals.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE, newIsDefaultPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPackageFragmentRoot getPackageFragmentRoot() {
		return (IPackageFragmentRoot)eDynamicGet(CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, CorePackage.Literals.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageFragmentRoot(IPackageFragmentRoot newPackageFragmentRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageFragmentRoot, CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragmentRoot(IPackageFragmentRoot newPackageFragmentRoot) {
		eDynamicSet(CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, CorePackage.Literals.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, newPackageFragmentRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IClassFile> getClassFiles() {
		return (EList<IClassFile>)eDynamicGet(CorePackage.IPACKAGE_FRAGMENT__CLASS_FILES, CorePackage.Literals.IPACKAGE_FRAGMENT__CLASS_FILES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ICompilationUnit> getCompilationUnits() {
		return (EList<ICompilationUnit>)eDynamicGet(CorePackage.IPACKAGE_FRAGMENT__COMPILATION_UNITS, CorePackage.Literals.IPACKAGE_FRAGMENT__COMPILATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackageFragmentRoot((IPackageFragmentRoot)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return basicSetPackageFragmentRoot(null, msgs);
			case CorePackage.IPACKAGE_FRAGMENT__CLASS_FILES:
				return ((InternalEList<?>)getClassFiles()).basicRemove(otherEnd, msgs);
			case CorePackage.IPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return eInternalContainer().eInverseRemove(this, CorePackage.IPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, IPackageFragmentRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.IPACKAGE_FRAGMENT__PATH:
				return getPath();
			case CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY:
				return getIsReadOnly();
			case CorePackage.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE:
				return getIsDefaultPackage();
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return getPackageFragmentRoot();
			case CorePackage.IPACKAGE_FRAGMENT__CLASS_FILES:
				return getClassFiles();
			case CorePackage.IPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return getCompilationUnits();
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
			case CorePackage.IPACKAGE_FRAGMENT__PATH:
				setPath((String)newValue);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE:
				setIsDefaultPackage((Boolean)newValue);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				setPackageFragmentRoot((IPackageFragmentRoot)newValue);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((Collection<? extends IClassFile>)newValue);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends ICompilationUnit>)newValue);
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
			case CorePackage.IPACKAGE_FRAGMENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE:
				setIsDefaultPackage(IS_DEFAULT_PACKAGE_EDEFAULT);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				setPackageFragmentRoot((IPackageFragmentRoot)null);
				return;
			case CorePackage.IPACKAGE_FRAGMENT__CLASS_FILES:
				getClassFiles().clear();
				return;
			case CorePackage.IPACKAGE_FRAGMENT__COMPILATION_UNITS:
				getCompilationUnits().clear();
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
			case CorePackage.IPACKAGE_FRAGMENT__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? getIsReadOnly() != null : !IS_READ_ONLY_EDEFAULT.equals(getIsReadOnly());
			case CorePackage.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE:
				return IS_DEFAULT_PACKAGE_EDEFAULT == null ? getIsDefaultPackage() != null : !IS_DEFAULT_PACKAGE_EDEFAULT.equals(getIsDefaultPackage());
			case CorePackage.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return getPackageFragmentRoot() != null;
			case CorePackage.IPACKAGE_FRAGMENT__CLASS_FILES:
				return !getClassFiles().isEmpty();
			case CorePackage.IPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return !getCompilationUnits().isEmpty();
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
				case CorePackage.IPACKAGE_FRAGMENT__PATH: return CorePackage.PHYSICAL_ELEMENT__PATH;
				case CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY: return CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY;
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
				case CorePackage.PHYSICAL_ELEMENT__PATH: return CorePackage.IPACKAGE_FRAGMENT__PATH;
				case CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY: return CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IPackageFragmentImpl
