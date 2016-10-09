/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.ForStatement;
import jdtast.gitemf.dom.DOM.Statement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ForStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ForStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ForStatementImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ForStatementImpl#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends StatementImpl implements ForStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return (Statement)eDynamicGet(DOMPackage.FOR_STATEMENT__BODY, DOMPackage.Literals.FOR_STATEMENT__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Statement newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, DOMPackage.FOR_STATEMENT__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		eDynamicSet(DOMPackage.FOR_STATEMENT__BODY, DOMPackage.Literals.FOR_STATEMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.FOR_STATEMENT__EXPRESSION, DOMPackage.Literals.FOR_STATEMENT__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.FOR_STATEMENT__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.FOR_STATEMENT__EXPRESSION, DOMPackage.Literals.FOR_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getInitializers() {
		return (EList<Expression>)eDynamicGet(DOMPackage.FOR_STATEMENT__INITIALIZERS, DOMPackage.Literals.FOR_STATEMENT__INITIALIZERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getUpdaters() {
		return (EList<Expression>)eDynamicGet(DOMPackage.FOR_STATEMENT__UPDATERS, DOMPackage.Literals.FOR_STATEMENT__UPDATERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.FOR_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case DOMPackage.FOR_STATEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.FOR_STATEMENT__INITIALIZERS:
				return ((InternalEList<?>)getInitializers()).basicRemove(otherEnd, msgs);
			case DOMPackage.FOR_STATEMENT__UPDATERS:
				return ((InternalEList<?>)getUpdaters()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.FOR_STATEMENT__BODY:
				return getBody();
			case DOMPackage.FOR_STATEMENT__EXPRESSION:
				return getExpression();
			case DOMPackage.FOR_STATEMENT__INITIALIZERS:
				return getInitializers();
			case DOMPackage.FOR_STATEMENT__UPDATERS:
				return getUpdaters();
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
			case DOMPackage.FOR_STATEMENT__BODY:
				setBody((Statement)newValue);
				return;
			case DOMPackage.FOR_STATEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.FOR_STATEMENT__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.FOR_STATEMENT__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends Expression>)newValue);
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
			case DOMPackage.FOR_STATEMENT__BODY:
				setBody((Statement)null);
				return;
			case DOMPackage.FOR_STATEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.FOR_STATEMENT__INITIALIZERS:
				getInitializers().clear();
				return;
			case DOMPackage.FOR_STATEMENT__UPDATERS:
				getUpdaters().clear();
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
			case DOMPackage.FOR_STATEMENT__BODY:
				return getBody() != null;
			case DOMPackage.FOR_STATEMENT__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.FOR_STATEMENT__INITIALIZERS:
				return !getInitializers().isEmpty();
			case DOMPackage.FOR_STATEMENT__UPDATERS:
				return !getUpdaters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForStatementImpl
