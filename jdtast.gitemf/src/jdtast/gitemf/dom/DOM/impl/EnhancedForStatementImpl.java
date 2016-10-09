/**
 */
package jdtast.gitemf.dom.DOM.impl;

import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.EnhancedForStatement;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.SingleVariableDeclaration;
import jdtast.gitemf.dom.DOM.Statement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enhanced For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.EnhancedForStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.EnhancedForStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.EnhancedForStatementImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnhancedForStatementImpl extends StatementImpl implements EnhancedForStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnhancedForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ENHANCED_FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return (Statement)eDynamicGet(DOMPackage.ENHANCED_FOR_STATEMENT__BODY, DOMPackage.Literals.ENHANCED_FOR_STATEMENT__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Statement newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, DOMPackage.ENHANCED_FOR_STATEMENT__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		eDynamicSet(DOMPackage.ENHANCED_FOR_STATEMENT__BODY, DOMPackage.Literals.ENHANCED_FOR_STATEMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION, DOMPackage.Literals.ENHANCED_FOR_STATEMENT__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION, DOMPackage.Literals.ENHANCED_FOR_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration getParameter() {
		return (SingleVariableDeclaration)eDynamicGet(DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER, DOMPackage.Literals.ENHANCED_FOR_STATEMENT__PARAMETER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(SingleVariableDeclaration newParameter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParameter, DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(SingleVariableDeclaration newParameter) {
		eDynamicSet(DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER, DOMPackage.Literals.ENHANCED_FOR_STATEMENT__PARAMETER, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.ENHANCED_FOR_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER:
				return basicSetParameter(null, msgs);
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
			case DOMPackage.ENHANCED_FOR_STATEMENT__BODY:
				return getBody();
			case DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION:
				return getExpression();
			case DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER:
				return getParameter();
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
			case DOMPackage.ENHANCED_FOR_STATEMENT__BODY:
				setBody((Statement)newValue);
				return;
			case DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER:
				setParameter((SingleVariableDeclaration)newValue);
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
			case DOMPackage.ENHANCED_FOR_STATEMENT__BODY:
				setBody((Statement)null);
				return;
			case DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER:
				setParameter((SingleVariableDeclaration)null);
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
			case DOMPackage.ENHANCED_FOR_STATEMENT__BODY:
				return getBody() != null;
			case DOMPackage.ENHANCED_FOR_STATEMENT__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.ENHANCED_FOR_STATEMENT__PARAMETER:
				return getParameter() != null;
		}
		return super.eIsSet(featureID);
	}

} //EnhancedForStatementImpl
