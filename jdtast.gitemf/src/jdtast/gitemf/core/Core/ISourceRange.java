/**
 */
package jdtast.gitemf.core.Core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISource Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.ISourceRange#getLength <em>Length</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.ISourceRange#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.core.Core.CorePackage#getISourceRange()
 * @model
 * @generated
 */
public interface ISourceRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(Integer)
	 * @see jdtast.gitemf.core.Core.CorePackage#getISourceRange_Length()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getLength();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.ISourceRange#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Integer)
	 * @see jdtast.gitemf.core.Core.CorePackage#getISourceRange_Offset()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getOffset();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.ISourceRange#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Integer value);

} // ISourceRange
