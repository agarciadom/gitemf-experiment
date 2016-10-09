/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.ExtendedModifier;
import jdtast.gitemf.dom.DOM.Type;
import jdtast.gitemf.dom.DOM.VariableDeclarationFragment;
import jdtast.gitemf.dom.DOM.VariableDeclarationStatement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.VariableDeclarationStatementImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.VariableDeclarationStatementImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.VariableDeclarationStatementImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationStatementImpl extends StatementImpl implements VariableDeclarationStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.VARIABLE_DECLARATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VariableDeclarationFragment> getFragments() {
		return (EList<VariableDeclarationFragment>)eDynamicGet(DOMPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS, DOMPackage.Literals.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedModifier> getModifiers() {
		return (EList<ExtendedModifier>)eDynamicGet(DOMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIERS, DOMPackage.Literals.VARIABLE_DECLARATION_STATEMENT__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE, DOMPackage.Literals.VARIABLE_DECLARATION_STATEMENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE, DOMPackage.Literals.VARIABLE_DECLARATION_STATEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE:
				return basicSetType(null, msgs);
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
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS:
				return getFragments();
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIERS:
				return getModifiers();
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE:
				return getType();
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
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends VariableDeclarationFragment>)newValue);
				return;
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends ExtendedModifier>)newValue);
				return;
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE:
				setType((Type)newValue);
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
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS:
				getFragments().clear();
				return;
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIERS:
				getModifiers().clear();
				return;
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE:
				setType((Type)null);
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
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS:
				return !getFragments().isEmpty();
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIERS:
				return !getModifiers().isEmpty();
			case DOMPackage.VARIABLE_DECLARATION_STATEMENT__TYPE:
				return getType() != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationStatementImpl
