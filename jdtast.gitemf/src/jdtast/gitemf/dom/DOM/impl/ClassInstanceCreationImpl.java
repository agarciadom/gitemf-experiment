/**
 */
package jdtast.gitemf.dom.DOM.impl;

import java.util.Collection;

import jdtast.gitemf.dom.DOM.AnonymousClassDeclaration;
import jdtast.gitemf.dom.DOM.ClassInstanceCreation;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.dom.DOM.Expression;
import jdtast.gitemf.dom.DOM.Type;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ClassInstanceCreationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ClassInstanceCreationImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ClassInstanceCreationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ClassInstanceCreationImpl#getType <em>Type</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.impl.ClassInstanceCreationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassInstanceCreationImpl extends ExpressionImpl implements ClassInstanceCreation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInstanceCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CLASS_INSTANCE_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(DOMPackage.CLASS_INSTANCE_CREATION__ARGUMENTS, DOMPackage.Literals.CLASS_INSTANCE_CREATION__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration getAnonymousClassDeclaration() {
		return (AnonymousClassDeclaration)eDynamicGet(DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, DOMPackage.Literals.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAnonymousClassDeclaration, DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration) {
		eDynamicSet(DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, DOMPackage.Literals.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, newAnonymousClassDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eDynamicGet(DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION, DOMPackage.Literals.CLASS_INSTANCE_CREATION__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION, DOMPackage.Literals.CLASS_INSTANCE_CREATION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(DOMPackage.CLASS_INSTANCE_CREATION__TYPE, DOMPackage.Literals.CLASS_INSTANCE_CREATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, DOMPackage.CLASS_INSTANCE_CREATION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(DOMPackage.CLASS_INSTANCE_CREATION__TYPE, DOMPackage.Literals.CLASS_INSTANCE_CREATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eDynamicGet(DOMPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS, DOMPackage.Literals.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOMPackage.CLASS_INSTANCE_CREATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION:
				return basicSetAnonymousClassDeclaration(null, msgs);
			case DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE:
				return basicSetType(null, msgs);
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
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
			case DOMPackage.CLASS_INSTANCE_CREATION__ARGUMENTS:
				return getArguments();
			case DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration();
			case DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION:
				return getExpression();
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE:
				return getType();
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case DOMPackage.CLASS_INSTANCE_CREATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration)newValue);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE:
				setType((Type)newValue);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends Type>)newValue);
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
			case DOMPackage.CLASS_INSTANCE_CREATION__ARGUMENTS:
				getArguments().clear();
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration)null);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE:
				setType((Type)null);
				return;
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case DOMPackage.CLASS_INSTANCE_CREATION__ARGUMENTS:
				return !getArguments().isEmpty();
			case DOMPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration() != null;
			case DOMPackage.CLASS_INSTANCE_CREATION__EXPRESSION:
				return getExpression() != null;
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE:
				return getType() != null;
			case DOMPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassInstanceCreationImpl
