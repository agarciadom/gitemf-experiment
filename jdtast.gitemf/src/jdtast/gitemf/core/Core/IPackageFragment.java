/**
 */
package jdtast.gitemf.core.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPackage Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.IPackageFragment#getIsDefaultPackage <em>Is Default Package</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IPackageFragment#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IPackageFragment#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.core.Core.CorePackage#getIPackageFragment()
 * @model
 * @generated
 */
public interface IPackageFragment extends IJavaElement, PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Is Default Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Package</em>' attribute.
	 * @see #setIsDefaultPackage(Boolean)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIPackageFragment_IsDefaultPackage()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDefaultPackage();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IPackageFragment#getIsDefaultPackage <em>Is Default Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Package</em>' attribute.
	 * @see #getIsDefaultPackage()
	 * @generated
	 */
	void setIsDefaultPackage(Boolean value);

	/**
	 * Returns the value of the '<em><b>Package Fragment Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jdtast.gitemf.core.Core.IPackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment Root</em>' container reference.
	 * @see #setPackageFragmentRoot(IPackageFragmentRoot)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIPackageFragment_PackageFragmentRoot()
	 * @see jdtast.gitemf.core.Core.IPackageFragmentRoot#getPackageFragments
	 * @model opposite="packageFragments" required="true" transient="false" ordered="false"
	 * @generated
	 */
	IPackageFragmentRoot getPackageFragmentRoot();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Fragment Root</em>' container reference.
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	void setPackageFragmentRoot(IPackageFragmentRoot value);

	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.core.Core.IClassFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' containment reference list.
	 * @see jdtast.gitemf.core.Core.CorePackage#getIPackageFragment_ClassFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<IClassFile> getClassFiles();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.core.Core.ICompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see jdtast.gitemf.core.Core.CorePackage#getIPackageFragment_CompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ICompilationUnit> getCompilationUnits();

} // IPackageFragment
