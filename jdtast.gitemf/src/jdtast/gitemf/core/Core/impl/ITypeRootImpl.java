/**
 */
package jdtast.gitemf.core.Core.impl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.ISourceRange;
import jdtast.gitemf.core.Core.ISourceReference;
import jdtast.gitemf.core.Core.ITypeRoot;
import jdtast.gitemf.core.Core.PhysicalElement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IType Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeRootImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeRootImpl#getPath <em>Path</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ITypeRootImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ITypeRootImpl extends IJavaElementImpl implements ITypeRoot {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

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
	protected ITypeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ITYPE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eDynamicGet(CorePackage.ITYPE_ROOT__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(CorePackage.ITYPE_ROOT__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getSourceRange() {
		return (ISourceRange)eDynamicGet(CorePackage.ITYPE_ROOT__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRange(ISourceRange newSourceRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSourceRange, CorePackage.ITYPE_ROOT__SOURCE_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(ISourceRange newSourceRange) {
		eDynamicSet(CorePackage.ITYPE_ROOT__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, newSourceRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eDynamicGet(CorePackage.ITYPE_ROOT__PATH, CorePackage.Literals.PHYSICAL_ELEMENT__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eDynamicSet(CorePackage.ITYPE_ROOT__PATH, CorePackage.Literals.PHYSICAL_ELEMENT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return (Boolean)eDynamicGet(CorePackage.ITYPE_ROOT__IS_READ_ONLY, CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		eDynamicSet(CorePackage.ITYPE_ROOT__IS_READ_ONLY, CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, newIsReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ITYPE_ROOT__SOURCE_RANGE:
				return basicSetSourceRange(null, msgs);
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
			case CorePackage.ITYPE_ROOT__SOURCE:
				return getSource();
			case CorePackage.ITYPE_ROOT__SOURCE_RANGE:
				return getSourceRange();
			case CorePackage.ITYPE_ROOT__PATH:
				return getPath();
			case CorePackage.ITYPE_ROOT__IS_READ_ONLY:
				return getIsReadOnly();
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
			case CorePackage.ITYPE_ROOT__SOURCE:
				setSource((String)newValue);
				return;
			case CorePackage.ITYPE_ROOT__SOURCE_RANGE:
				setSourceRange((ISourceRange)newValue);
				return;
			case CorePackage.ITYPE_ROOT__PATH:
				setPath((String)newValue);
				return;
			case CorePackage.ITYPE_ROOT__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
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
			case CorePackage.ITYPE_ROOT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorePackage.ITYPE_ROOT__SOURCE_RANGE:
				setSourceRange((ISourceRange)null);
				return;
			case CorePackage.ITYPE_ROOT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CorePackage.ITYPE_ROOT__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
			case CorePackage.ITYPE_ROOT__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case CorePackage.ITYPE_ROOT__SOURCE_RANGE:
				return getSourceRange() != null;
			case CorePackage.ITYPE_ROOT__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case CorePackage.ITYPE_ROOT__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? getIsReadOnly() != null : !IS_READ_ONLY_EDEFAULT.equals(getIsReadOnly());
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
		if (baseClass == ISourceReference.class) {
			switch (derivedFeatureID) {
				case CorePackage.ITYPE_ROOT__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.ITYPE_ROOT__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
				default: return -1;
			}
		}
		if (baseClass == PhysicalElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.ITYPE_ROOT__PATH: return CorePackage.PHYSICAL_ELEMENT__PATH;
				case CorePackage.ITYPE_ROOT__IS_READ_ONLY: return CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY;
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
		if (baseClass == ISourceReference.class) {
			switch (baseFeatureID) {
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.ITYPE_ROOT__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.ITYPE_ROOT__SOURCE_RANGE;
				default: return -1;
			}
		}
		if (baseClass == PhysicalElement.class) {
			switch (baseFeatureID) {
				case CorePackage.PHYSICAL_ELEMENT__PATH: return CorePackage.ITYPE_ROOT__PATH;
				case CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY: return CorePackage.ITYPE_ROOT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ITypeRootImpl
