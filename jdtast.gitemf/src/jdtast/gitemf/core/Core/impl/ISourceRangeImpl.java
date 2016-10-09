/**
 */
package jdtast.gitemf.core.Core.impl;

import gitemf.GitEObjectImpl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.ISourceRange;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISource Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ISourceRangeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ISourceRangeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISourceRangeImpl extends GitEObjectImpl implements ISourceRange {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OFFSET_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISourceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ISOURCE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLength() {
		return (Integer)eDynamicGet(CorePackage.ISOURCE_RANGE__LENGTH, CorePackage.Literals.ISOURCE_RANGE__LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Integer newLength) {
		eDynamicSet(CorePackage.ISOURCE_RANGE__LENGTH, CorePackage.Literals.ISOURCE_RANGE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOffset() {
		return (Integer)eDynamicGet(CorePackage.ISOURCE_RANGE__OFFSET, CorePackage.Literals.ISOURCE_RANGE__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Integer newOffset) {
		eDynamicSet(CorePackage.ISOURCE_RANGE__OFFSET, CorePackage.Literals.ISOURCE_RANGE__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ISOURCE_RANGE__LENGTH:
				return getLength();
			case CorePackage.ISOURCE_RANGE__OFFSET:
				return getOffset();
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
			case CorePackage.ISOURCE_RANGE__LENGTH:
				setLength((Integer)newValue);
				return;
			case CorePackage.ISOURCE_RANGE__OFFSET:
				setOffset((Integer)newValue);
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
			case CorePackage.ISOURCE_RANGE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case CorePackage.ISOURCE_RANGE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case CorePackage.ISOURCE_RANGE__LENGTH:
				return LENGTH_EDEFAULT == null ? getLength() != null : !LENGTH_EDEFAULT.equals(getLength());
			case CorePackage.ISOURCE_RANGE__OFFSET:
				return OFFSET_EDEFAULT == null ? getOffset() != null : !OFFSET_EDEFAULT.equals(getOffset());
		}
		return super.eIsSet(featureID);
	}

} //ISourceRangeImpl
