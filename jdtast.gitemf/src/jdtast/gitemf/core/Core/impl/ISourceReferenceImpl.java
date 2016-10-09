/**
 */
package jdtast.gitemf.core.Core.impl;

import gitemf.GitEObjectImpl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.ISourceRange;
import jdtast.gitemf.core.Core.ISourceReference;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISource Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ISourceReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ISourceReferenceImpl#getSourceRange <em>Source Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ISourceReferenceImpl extends GitEObjectImpl implements ISourceReference {
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
	protected ISourceReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ISOURCE_REFERENCE;
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
	public String getSource() {
		return (String)eDynamicGet(CorePackage.ISOURCE_REFERENCE__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(CorePackage.ISOURCE_REFERENCE__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getSourceRange() {
		return (ISourceRange)eDynamicGet(CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRange(ISourceRange newSourceRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSourceRange, CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(ISourceRange newSourceRange) {
		eDynamicSet(CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, newSourceRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE:
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
			case CorePackage.ISOURCE_REFERENCE__SOURCE:
				return getSource();
			case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE:
				return getSourceRange();
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
			case CorePackage.ISOURCE_REFERENCE__SOURCE:
				setSource((String)newValue);
				return;
			case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE:
				setSourceRange((ISourceRange)newValue);
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
			case CorePackage.ISOURCE_REFERENCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE:
				setSourceRange((ISourceRange)null);
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
			case CorePackage.ISOURCE_REFERENCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE:
				return getSourceRange() != null;
		}
		return super.eIsSet(featureID);
	}

} //ISourceReferenceImpl
