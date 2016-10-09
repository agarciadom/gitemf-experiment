/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.AbstractTypeDeclaration;
import jdtast.gitemf.dom.DOM.Comment;
import jdtast.gitemf.dom.DOM.CompilationUnit;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.ImportDeclaration;
import jdtast.gitemf.dom.DOM.PackageDeclaration;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CompilationUnitImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends ASTNodeImpl implements CompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getComments() {
		return (EList<Comment>)eDynamicGet(DOMPackage.COMPILATION_UNIT__COMMENTS, DOMPackage.Literals.COMPILATION_UNIT__COMMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclaration getPackage() {
		return (PackageDeclaration)eDynamicGet(DOMPackage.COMPILATION_UNIT__PACKAGE, DOMPackage.Literals.COMPILATION_UNIT__PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageDeclaration newPackage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPackage, DOMPackage.COMPILATION_UNIT__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(PackageDeclaration newPackage) {
		eDynamicSet(DOMPackage.COMPILATION_UNIT__PACKAGE, DOMPackage.Literals.COMPILATION_UNIT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImportDeclaration> getImports() {
		return (EList<ImportDeclaration>)eDynamicGet(DOMPackage.COMPILATION_UNIT__IMPORTS, DOMPackage.Literals.COMPILATION_UNIT__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractTypeDeclaration> getTypes() {
		return (EList<AbstractTypeDeclaration>)eDynamicGet(DOMPackage.COMPILATION_UNIT__TYPES, DOMPackage.Literals.COMPILATION_UNIT__TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.COMPILATION_UNIT__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case DOMPackage.COMPILATION_UNIT__PACKAGE:
				return basicSetPackage(null, msgs);
			case DOMPackage.COMPILATION_UNIT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case DOMPackage.COMPILATION_UNIT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.COMPILATION_UNIT__COMMENTS:
				return getComments();
			case DOMPackage.COMPILATION_UNIT__PACKAGE:
				return getPackage();
			case DOMPackage.COMPILATION_UNIT__IMPORTS:
				return getImports();
			case DOMPackage.COMPILATION_UNIT__TYPES:
				return getTypes();
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
			case DOMPackage.COMPILATION_UNIT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case DOMPackage.COMPILATION_UNIT__PACKAGE:
				setPackage((PackageDeclaration)newValue);
				return;
			case DOMPackage.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
				return;
			case DOMPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
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
			case DOMPackage.COMPILATION_UNIT__COMMENTS:
				getComments().clear();
				return;
			case DOMPackage.COMPILATION_UNIT__PACKAGE:
				setPackage((PackageDeclaration)null);
				return;
			case DOMPackage.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				return;
			case DOMPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
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
			case DOMPackage.COMPILATION_UNIT__COMMENTS:
				return !getComments().isEmpty();
			case DOMPackage.COMPILATION_UNIT__PACKAGE:
				return getPackage() != null;
			case DOMPackage.COMPILATION_UNIT__IMPORTS:
				return !getImports().isEmpty();
			case DOMPackage.COMPILATION_UNIT__TYPES:
				return !getTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompilationUnitImpl
