/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.IfStatement;
import jdtast.gitemf.dom.DOM.Statement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.IfStatementImpl#getElseStatement <em>Else Statement</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.IfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.IfStatementImpl#getThenStatement <em>Then Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseStatement() {
		return (Statement)eDynamicGet(DOMPackage.IF_STATEMENT__ELSE_STATEMENT, DOMPackage.Literals.IF_STATEMENT__ELSE_STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElseStatement, DOMPackage.IF_STATEMENT__ELSE_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseStatement(Statement newElseStatement) {
		eDynamicSet(DOMPackage.IF_STATEMENT__ELSE_STATEMENT, DOMPackage.Literals.IF_STATEMENT__ELSE_STATEMENT, newElseStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.IF_STATEMENT__EXPRESSION, DOMPackage.Literals.IF_STATEMENT__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.IF_STATEMENT__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.IF_STATEMENT__EXPRESSION, DOMPackage.Literals.IF_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getThenStatement() {
		return (Statement)eDynamicGet(DOMPackage.IF_STATEMENT__THEN_STATEMENT, DOMPackage.Literals.IF_STATEMENT__THEN_STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenStatement(Statement newThenStatement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newThenStatement, DOMPackage.IF_STATEMENT__THEN_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenStatement(Statement newThenStatement) {
		eDynamicSet(DOMPackage.IF_STATEMENT__THEN_STATEMENT, DOMPackage.Literals.IF_STATEMENT__THEN_STATEMENT, newThenStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.IF_STATEMENT__ELSE_STATEMENT:
				return basicSetElseStatement(null, msgs);
			case DOMPackage.IF_STATEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.IF_STATEMENT__THEN_STATEMENT:
				return basicSetThenStatement(null, msgs);
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
			case DOMPackage.IF_STATEMENT__ELSE_STATEMENT:
				return getElseStatement();
			case DOMPackage.IF_STATEMENT__EXPRESSION:
				return getExpression();
			case DOMPackage.IF_STATEMENT__THEN_STATEMENT:
				return getThenStatement();
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
			case DOMPackage.IF_STATEMENT__ELSE_STATEMENT:
				setElseStatement((Statement)newValue);
				return;
			case DOMPackage.IF_STATEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.IF_STATEMENT__THEN_STATEMENT:
				setThenStatement((Statement)newValue);
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
			case DOMPackage.IF_STATEMENT__ELSE_STATEMENT:
				setElseStatement((Statement)null);
				return;
			case DOMPackage.IF_STATEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.IF_STATEMENT__THEN_STATEMENT:
				setThenStatement((Statement)null);
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
			case DOMPackage.IF_STATEMENT__ELSE_STATEMENT:
				return getElseStatement() != null;
			case DOMPackage.IF_STATEMENT__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.IF_STATEMENT__THEN_STATEMENT:
				return getThenStatement() != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
