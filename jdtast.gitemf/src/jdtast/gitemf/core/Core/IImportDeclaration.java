/**
 */
package jdtast.gitemf.core.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IImport Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.IImportDeclaration#getIsOnDemand <em>Is On Demand</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IImportDeclaration#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.core.Core.CorePackage#getIImportDeclaration()
 * @model
 * @generated
 */
public interface IImportDeclaration extends IJavaElement, ISourceReference {
	/**
	 * Returns the value of the '<em><b>Is On Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is On Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is On Demand</em>' attribute.
	 * @see #setIsOnDemand(Boolean)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIImportDeclaration_IsOnDemand()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOnDemand();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IImportDeclaration#getIsOnDemand <em>Is On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is On Demand</em>' attribute.
	 * @see #getIsOnDemand()
	 * @generated
	 */
	void setIsOnDemand(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(Boolean)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIImportDeclaration_IsStatic()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IImportDeclaration#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

} // IImportDeclaration
