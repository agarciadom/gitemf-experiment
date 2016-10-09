/**
 */
package jdtast.gitemf.core.Core.impl;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IImportDeclaration;
import jdtast.gitemf.core.Core.ISourceRange;
import jdtast.gitemf.core.Core.ISourceReference;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IImport Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IImportDeclarationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IImportDeclarationImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IImportDeclarationImpl#getIsOnDemand <em>Is On Demand</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.IImportDeclarationImpl#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IImportDeclarationImpl extends IJavaElementImpl implements IImportDeclaration {
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
	 * The default value of the '{@link #getIsOnDemand() <em>Is On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOnDemand()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ON_DEMAND_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATIC_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IImportDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IIMPORT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eDynamicGet(CorePackage.IIMPORT_DECLARATION__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(CorePackage.IIMPORT_DECLARATION__SOURCE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getSourceRange() {
		return (ISourceRange)eDynamicGet(CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRange(ISourceRange newSourceRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSourceRange, CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(ISourceRange newSourceRange) {
		eDynamicSet(CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE, CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, newSourceRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOnDemand() {
		return (Boolean)eDynamicGet(CorePackage.IIMPORT_DECLARATION__IS_ON_DEMAND, CorePackage.Literals.IIMPORT_DECLARATION__IS_ON_DEMAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOnDemand(Boolean newIsOnDemand) {
		eDynamicSet(CorePackage.IIMPORT_DECLARATION__IS_ON_DEMAND, CorePackage.Literals.IIMPORT_DECLARATION__IS_ON_DEMAND, newIsOnDemand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return (Boolean)eDynamicGet(CorePackage.IIMPORT_DECLARATION__IS_STATIC, CorePackage.Literals.IIMPORT_DECLARATION__IS_STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		eDynamicSet(CorePackage.IIMPORT_DECLARATION__IS_STATIC, CorePackage.Literals.IIMPORT_DECLARATION__IS_STATIC, newIsStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE:
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
			case CorePackage.IIMPORT_DECLARATION__SOURCE:
				return getSource();
			case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE:
				return getSourceRange();
			case CorePackage.IIMPORT_DECLARATION__IS_ON_DEMAND:
				return getIsOnDemand();
			case CorePackage.IIMPORT_DECLARATION__IS_STATIC:
				return getIsStatic();
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
			case CorePackage.IIMPORT_DECLARATION__SOURCE:
				setSource((String)newValue);
				return;
			case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE:
				setSourceRange((ISourceRange)newValue);
				return;
			case CorePackage.IIMPORT_DECLARATION__IS_ON_DEMAND:
				setIsOnDemand((Boolean)newValue);
				return;
			case CorePackage.IIMPORT_DECLARATION__IS_STATIC:
				setIsStatic((Boolean)newValue);
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
			case CorePackage.IIMPORT_DECLARATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE:
				setSourceRange((ISourceRange)null);
				return;
			case CorePackage.IIMPORT_DECLARATION__IS_ON_DEMAND:
				setIsOnDemand(IS_ON_DEMAND_EDEFAULT);
				return;
			case CorePackage.IIMPORT_DECLARATION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
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
			case CorePackage.IIMPORT_DECLARATION__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE:
				return getSourceRange() != null;
			case CorePackage.IIMPORT_DECLARATION__IS_ON_DEMAND:
				return IS_ON_DEMAND_EDEFAULT == null ? getIsOnDemand() != null : !IS_ON_DEMAND_EDEFAULT.equals(getIsOnDemand());
			case CorePackage.IIMPORT_DECLARATION__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? getIsStatic() != null : !IS_STATIC_EDEFAULT.equals(getIsStatic());
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
				case CorePackage.IIMPORT_DECLARATION__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
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
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.IIMPORT_DECLARATION__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IImportDeclarationImpl
