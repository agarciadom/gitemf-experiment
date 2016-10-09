/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.Block;
import jdtast.gitemf.dom.DOM.CatchClause;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.TryStatement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TryStatementImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TryStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.TryStatementImpl#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TRY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CatchClause> getCatchClauses() {
		return (EList<CatchClause>)eDynamicGet(DOMPackage.TRY_STATEMENT__CATCH_CLAUSES, DOMPackage.Literals.TRY_STATEMENT__CATCH_CLAUSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eDynamicGet(DOMPackage.TRY_STATEMENT__BODY, DOMPackage.Literals.TRY_STATEMENT__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, DOMPackage.TRY_STATEMENT__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eDynamicSet(DOMPackage.TRY_STATEMENT__BODY, DOMPackage.Literals.TRY_STATEMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getFinally() {
		return (Block)eDynamicGet(DOMPackage.TRY_STATEMENT__FINALLY, DOMPackage.Literals.TRY_STATEMENT__FINALLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinally(Block newFinally, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFinally, DOMPackage.TRY_STATEMENT__FINALLY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinally(Block newFinally) {
		eDynamicSet(DOMPackage.TRY_STATEMENT__FINALLY, DOMPackage.Literals.TRY_STATEMENT__FINALLY, newFinally);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.TRY_STATEMENT__CATCH_CLAUSES:
				return ((InternalEList<?>)getCatchClauses()).basicRemove(otherEnd, msgs);
			case DOMPackage.TRY_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case DOMPackage.TRY_STATEMENT__FINALLY:
				return basicSetFinally(null, msgs);
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
			case DOMPackage.TRY_STATEMENT__CATCH_CLAUSES:
				return getCatchClauses();
			case DOMPackage.TRY_STATEMENT__BODY:
				return getBody();
			case DOMPackage.TRY_STATEMENT__FINALLY:
				return getFinally();
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
			case DOMPackage.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((Collection<? extends CatchClause>)newValue);
				return;
			case DOMPackage.TRY_STATEMENT__BODY:
				setBody((Block)newValue);
				return;
			case DOMPackage.TRY_STATEMENT__FINALLY:
				setFinally((Block)newValue);
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
			case DOMPackage.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
				return;
			case DOMPackage.TRY_STATEMENT__BODY:
				setBody((Block)null);
				return;
			case DOMPackage.TRY_STATEMENT__FINALLY:
				setFinally((Block)null);
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
			case DOMPackage.TRY_STATEMENT__CATCH_CLAUSES:
				return !getCatchClauses().isEmpty();
			case DOMPackage.TRY_STATEMENT__BODY:
				return getBody() != null;
			case DOMPackage.TRY_STATEMENT__FINALLY:
				return getFinally() != null;
		}
		return super.eIsSet(featureID);
	}

} //TryStatementImpl
