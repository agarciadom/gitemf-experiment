/**
 */
package jdtast.gitemf.dom.DOM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.NormalAnnotation#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getNormalAnnotation()
 * @model
 * @generated
 */
public interface NormalAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.MemberValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getNormalAnnotation_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberValuePair> getValues();

} // NormalAnnotation
