/**
 */
package jdtast.gitemf.core.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IType Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.ITypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.core.Core.CorePackage#getITypeParameter()
 * @model
 * @generated
 */
public interface ITypeParameter extends IJavaElement, ISourceReference {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' attribute list.
	 * @see jdtast.gitemf.core.Core.CorePackage#getITypeParameter_Bounds()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	EList<String> getBounds();

} // ITypeParameter
