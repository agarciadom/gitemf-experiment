/**
 */
package jdtast.gitemf.core.Core.impl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IMember;
import jdtast.gitemf.core.Core.ISourceRange;
import jdtast.gitemf.core.Core.ISourceReference;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMemberImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMemberImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMemberImpl#getJavadocRange <em>Javadoc Range</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IMemberImpl#getNameRange <em>Name Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IMemberImpl extends IJavaElementImpl implements IMember {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eDynamicGet(CorePackage.IMEMBER__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(CorePackage.IMEMBER__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getSourceRange() {
		return (ISourceRange)eDynamicGet(CorePackage.IMEMBER__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRange(ISourceRange newSourceRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSourceRange, CorePackage.IMEMBER__SOURCE_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(ISourceRange newSourceRange) {
		eDynamicSet(CorePackage.IMEMBER__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, newSourceRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getJavadocRange() {
		return (ISourceRange)eDynamicGet(CorePackage.IMEMBER__JAVADOC_RANGE, CorePackage.Literals.IMEMBER__JAVADOC_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavadocRange(ISourceRange newJavadocRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newJavadocRange, CorePackage.IMEMBER__JAVADOC_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadocRange(ISourceRange newJavadocRange) {
		eDynamicSet(CorePackage.IMEMBER__JAVADOC_RANGE, CorePackage.Literals.IMEMBER__JAVADOC_RANGE, newJavadocRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getNameRange() {
		return (ISourceRange)eDynamicGet(CorePackage.IMEMBER__NAME_RANGE, CorePackage.Literals.IMEMBER__NAME_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameRange(ISourceRange newNameRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNameRange, CorePackage.IMEMBER__NAME_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameRange(ISourceRange newNameRange) {
		eDynamicSet(CorePackage.IMEMBER__NAME_RANGE, CorePackage.Literals.IMEMBER__NAME_RANGE, newNameRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IMEMBER__SOURCE_RANGE:
				return basicSetSourceRange(null, msgs);
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				return basicSetJavadocRange(null, msgs);
			case CorePackage.IMEMBER__NAME_RANGE:
				return basicSetNameRange(null, msgs);
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
			case CorePackage.IMEMBER__SOURCE:
				return getSource();
			case CorePackage.IMEMBER__SOURCE_RANGE:
				return getSourceRange();
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				return getJavadocRange();
			case CorePackage.IMEMBER__NAME_RANGE:
				return getNameRange();
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
			case CorePackage.IMEMBER__SOURCE:
				setSource((String)newValue);
				return;
			case CorePackage.IMEMBER__SOURCE_RANGE:
				setSourceRange((ISourceRange)newValue);
				return;
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				setJavadocRange((ISourceRange)newValue);
				return;
			case CorePackage.IMEMBER__NAME_RANGE:
				setNameRange((ISourceRange)newValue);
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
			case CorePackage.IMEMBER__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorePackage.IMEMBER__SOURCE_RANGE:
				setSourceRange((ISourceRange)null);
				return;
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				setJavadocRange((ISourceRange)null);
				return;
			case CorePackage.IMEMBER__NAME_RANGE:
				setNameRange((ISourceRange)null);
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
			case CorePackage.IMEMBER__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case CorePackage.IMEMBER__SOURCE_RANGE:
				return getSourceRange() != null;
			case CorePackage.IMEMBER__JAVADOC_RANGE:
				return getJavadocRange() != null;
			case CorePackage.IMEMBER__NAME_RANGE:
				return getNameRange() != null;
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
				case CorePackage.IMEMBER__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.IMEMBER__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
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
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.IMEMBER__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.IMEMBER__SOURCE_RANGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IMemberImpl
