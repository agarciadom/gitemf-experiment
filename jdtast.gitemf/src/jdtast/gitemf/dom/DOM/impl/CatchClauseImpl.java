/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.Block;
import jdtast.gitemf.dom.DOM.CatchClause;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.SingleVariableDeclaration;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CatchClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.CatchClauseImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClauseImpl extends ASTNodeImpl implements CatchClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CATCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eDynamicGet(DOMPackage.CATCH_CLAUSE__BODY, DOMPackage.Literals.CATCH_CLAUSE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, DOMPackage.CATCH_CLAUSE__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eDynamicSet(DOMPackage.CATCH_CLAUSE__BODY, DOMPackage.Literals.CATCH_CLAUSE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration getException() {
		return (SingleVariableDeclaration)eDynamicGet(DOMPackage.CATCH_CLAUSE__EXCEPTION, DOMPackage.Literals.CATCH_CLAUSE__EXCEPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(SingleVariableDeclaration newException, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newException, DOMPackage.CATCH_CLAUSE__EXCEPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(SingleVariableDeclaration newException) {
		eDynamicSet(DOMPackage.CATCH_CLAUSE__EXCEPTION, DOMPackage.Literals.CATCH_CLAUSE__EXCEPTION, newException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.CATCH_CLAUSE__BODY:
				return basicSetBody(null, msgs);
			case DOMPackage.CATCH_CLAUSE__EXCEPTION:
				return basicSetException(null, msgs);
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
			case DOMPackage.CATCH_CLAUSE__BODY:
				return getBody();
			case DOMPackage.CATCH_CLAUSE__EXCEPTION:
				return getException();
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
			case DOMPackage.CATCH_CLAUSE__BODY:
				setBody((Block)newValue);
				return;
			case DOMPackage.CATCH_CLAUSE__EXCEPTION:
				setException((SingleVariableDeclaration)newValue);
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
			case DOMPackage.CATCH_CLAUSE__BODY:
				setBody((Block)null);
				return;
			case DOMPackage.CATCH_CLAUSE__EXCEPTION:
				setException((SingleVariableDeclaration)null);
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
			case DOMPackage.CATCH_CLAUSE__BODY:
				return getBody() != null;
			case DOMPackage.CATCH_CLAUSE__EXCEPTION:
				return getException() != null;
		}
		return super.eIsSet(featureID);
	}

} //CatchClauseImpl
