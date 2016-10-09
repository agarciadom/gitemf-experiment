/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.ASTNode;
import jdtast.gitemf.dom.DOM.Comment;
import jdtast.gitemf.dom.DOM.DOMPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CommentImpl#getAlternateRoot <em>Alternate Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommentImpl extends ASTNodeImpl implements Comment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode getAlternateRoot() {
		return (ASTNode)eDynamicGet(DOMPackage.COMMENT__ALTERNATE_ROOT, DOMPackage.Literals.COMMENT__ALTERNATE_ROOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode basicGetAlternateRoot() {
		return (ASTNode)eDynamicGet(DOMPackage.COMMENT__ALTERNATE_ROOT, DOMPackage.Literals.COMMENT__ALTERNATE_ROOT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternateRoot(ASTNode newAlternateRoot) {
		eDynamicSet(DOMPackage.COMMENT__ALTERNATE_ROOT, DOMPackage.Literals.COMMENT__ALTERNATE_ROOT, newAlternateRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOMPackage.COMMENT__ALTERNATE_ROOT:
				if (resolve) return getAlternateRoot();
				return basicGetAlternateRoot();
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
			case DOMPackage.COMMENT__ALTERNATE_ROOT:
				setAlternateRoot((ASTNode)newValue);
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
			case DOMPackage.COMMENT__ALTERNATE_ROOT:
				setAlternateRoot((ASTNode)null);
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
			case DOMPackage.COMMENT__ALTERNATE_ROOT:
				return basicGetAlternateRoot() != null;
		}
		return super.eIsSet(featureID);
	}

} //CommentImpl
