/**
 */
package jdtast.gitemf.core.Core.impl;

import java.util.Collection;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.ICompilationUnit;
import jdtast.gitemf.core.Core.IImportDeclaration;
import jdtast.gitemf.core.Core.IType;

import jdtast.gitemf.dom.DOM.CompilationUnit;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ICompilationUnitImpl#getAllType <em>All Type</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ICompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ICompilationUnitImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ICompilationUnitImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.impl.ICompilationUnitImpl#getAst <em>Ast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICompilationUnitImpl extends ITypeRootImpl implements ICompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ICOMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IType> getAllType() {
		return (EList<IType>)eDynamicGet(CorePackage.ICOMPILATION_UNIT__ALL_TYPE, CorePackage.Literals.ICOMPILATION_UNIT__ALL_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IImportDeclaration> getImports() {
		return (EList<IImportDeclaration>)eDynamicGet(CorePackage.ICOMPILATION_UNIT__IMPORTS, CorePackage.Literals.ICOMPILATION_UNIT__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IType> getTypes() {
		return (EList<IType>)eDynamicGet(CorePackage.ICOMPILATION_UNIT__TYPES, CorePackage.Literals.ICOMPILATION_UNIT__TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICompilationUnit getPrimary() {
		return (ICompilationUnit)eDynamicGet(CorePackage.ICOMPILATION_UNIT__PRIMARY, CorePackage.Literals.ICOMPILATION_UNIT__PRIMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICompilationUnit basicGetPrimary() {
		return (ICompilationUnit)eDynamicGet(CorePackage.ICOMPILATION_UNIT__PRIMARY, CorePackage.Literals.ICOMPILATION_UNIT__PRIMARY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(ICompilationUnit newPrimary) {
		eDynamicSet(CorePackage.ICOMPILATION_UNIT__PRIMARY, CorePackage.Literals.ICOMPILATION_UNIT__PRIMARY, newPrimary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getAst() {
		return (CompilationUnit)eDynamicGet(CorePackage.ICOMPILATION_UNIT__AST, CorePackage.Literals.ICOMPILATION_UNIT__AST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAst(CompilationUnit newAst, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAst, CorePackage.ICOMPILATION_UNIT__AST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAst(CompilationUnit newAst) {
		eDynamicSet(CorePackage.ICOMPILATION_UNIT__AST, CorePackage.Literals.ICOMPILATION_UNIT__AST, newAst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ICOMPILATION_UNIT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case CorePackage.ICOMPILATION_UNIT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case CorePackage.ICOMPILATION_UNIT__AST:
				return basicSetAst(null, msgs);
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
			case CorePackage.ICOMPILATION_UNIT__ALL_TYPE:
				return getAllType();
			case CorePackage.ICOMPILATION_UNIT__IMPORTS:
				return getImports();
			case CorePackage.ICOMPILATION_UNIT__TYPES:
				return getTypes();
			case CorePackage.ICOMPILATION_UNIT__PRIMARY:
				if (resolve) return getPrimary();
				return basicGetPrimary();
			case CorePackage.ICOMPILATION_UNIT__AST:
				return getAst();
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
			case CorePackage.ICOMPILATION_UNIT__ALL_TYPE:
				getAllType().clear();
				getAllType().addAll((Collection<? extends IType>)newValue);
				return;
			case CorePackage.ICOMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends IImportDeclaration>)newValue);
				return;
			case CorePackage.ICOMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends IType>)newValue);
				return;
			case CorePackage.ICOMPILATION_UNIT__PRIMARY:
				setPrimary((ICompilationUnit)newValue);
				return;
			case CorePackage.ICOMPILATION_UNIT__AST:
				setAst((CompilationUnit)newValue);
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
			case CorePackage.ICOMPILATION_UNIT__ALL_TYPE:
				getAllType().clear();
				return;
			case CorePackage.ICOMPILATION_UNIT__IMPORTS:
				getImports().clear();
				return;
			case CorePackage.ICOMPILATION_UNIT__TYPES:
				getTypes().clear();
				return;
			case CorePackage.ICOMPILATION_UNIT__PRIMARY:
				setPrimary((ICompilationUnit)null);
				return;
			case CorePackage.ICOMPILATION_UNIT__AST:
				setAst((CompilationUnit)null);
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
			case CorePackage.ICOMPILATION_UNIT__ALL_TYPE:
				return !getAllType().isEmpty();
			case CorePackage.ICOMPILATION_UNIT__IMPORTS:
				return !getImports().isEmpty();
			case CorePackage.ICOMPILATION_UNIT__TYPES:
				return !getTypes().isEmpty();
			case CorePackage.ICOMPILATION_UNIT__PRIMARY:
				return basicGetPrimary() != null;
			case CorePackage.ICOMPILATION_UNIT__AST:
				return getAst() != null;
		}
		return super.eIsSet(featureID);
	}

} //ICompilationUnitImpl
