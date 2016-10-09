/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.SimpleName;
import jdtast.gitemf.dom.DOM.VariableDeclaration;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.VariableDeclarationImpl#getExtraDimensions <em>Extra Dimensions</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.VariableDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableDeclarationImpl extends ASTNodeImpl implements VariableDeclaration {
	/**
	 * The default value of the '{@link #getExtraDimensions() <em>Extra Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTRA_DIMENSIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getExtraDimensions() {
		return (Integer)eDynamicGet(DOMPackage.VARIABLE_DECLARATION__EXTRA_DIMENSIONS, DOMPackage.Literals.VARIABLE_DECLARATION__EXTRA_DIMENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDimensions(Integer newExtraDimensions) {
		eDynamicSet(DOMPackage.VARIABLE_DECLARATION__EXTRA_DIMENSIONS, DOMPackage.Literals.VARIABLE_DECLARATION__EXTRA_DIMENSIONS, newExtraDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializer() {
		return (Expression)eDynamicGet(DOMPackage.VARIABLE_DECLARATION__INITIALIZER, DOMPackage.Literals.VARIABLE_DECLARATION__INITIALIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Expression newInitializer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitializer, DOMPackage.VARIABLE_DECLARATION__INITIALIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		eDynamicSet(DOMPackage.VARIABLE_DECLARATION__INITIALIZER, DOMPackage.Literals.VARIABLE_DECLARATION__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eDynamicGet(DOMPackage.VARIABLE_DECLARATION__NAME, DOMPackage.Literals.VARIABLE_DECLARATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newName, DOMPackage.VARIABLE_DECLARATION__NAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eDynamicSet(DOMPackage.VARIABLE_DECLARATION__NAME, DOMPackage.Literals.VARIABLE_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.VARIABLE_DECLARATION__INITIALIZER:
				return basicSetInitializer(null, msgs);
			case DOMPackage.VARIABLE_DECLARATION__NAME:
				return basicSetName(null, msgs);
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
			case DOMPackage.VARIABLE_DECLARATION__EXTRA_DIMENSIONS:
				return getExtraDimensions();
			case DOMPackage.VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer();
			case DOMPackage.VARIABLE_DECLARATION__NAME:
				return getName();
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
			case DOMPackage.VARIABLE_DECLARATION__EXTRA_DIMENSIONS:
				setExtraDimensions((Integer)newValue);
				return;
			case DOMPackage.VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((Expression)newValue);
				return;
			case DOMPackage.VARIABLE_DECLARATION__NAME:
				setName((SimpleName)newValue);
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
			case DOMPackage.VARIABLE_DECLARATION__EXTRA_DIMENSIONS:
				setExtraDimensions(EXTRA_DIMENSIONS_EDEFAULT);
				return;
			case DOMPackage.VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((Expression)null);
				return;
			case DOMPackage.VARIABLE_DECLARATION__NAME:
				setName((SimpleName)null);
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
			case DOMPackage.VARIABLE_DECLARATION__EXTRA_DIMENSIONS:
				return EXTRA_DIMENSIONS_EDEFAULT == null ? getExtraDimensions() != null : !EXTRA_DIMENSIONS_EDEFAULT.equals(getExtraDimensions());
			case DOMPackage.VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer() != null;
			case DOMPackage.VARIABLE_DECLARATION__NAME:
				return getName() != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationImpl
