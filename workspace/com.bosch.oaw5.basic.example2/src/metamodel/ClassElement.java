/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.ClassElement#getNamespaceRefs <em>Namespace Refs</em>}</li>
 *   <li>{@link metamodel.ClassElement#getGlobalVariableDefs <em>Global Variable Defs</em>}</li>
 *   <li>{@link metamodel.ClassElement#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.ClassElement#getMemberFunctions <em>Member Functions</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getClassElement()
 * @model
 * @generated
 */
public interface ClassElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Refs</b></em>' reference list.
	 * The list contents are of type {@link metamodel.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Refs</em>' reference list.
	 * @see metamodel.MetamodelPackage#getClassElement_NamespaceRefs()
	 * @model
	 * @generated
	 */
	EList<Namespace> getNamespaceRefs();

	/**
	 * Returns the value of the '<em><b>Global Variable Defs</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Defs</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getClassElement_GlobalVariableDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getGlobalVariableDefs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel.MetamodelPackage#getClassElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.ClassElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Member Functions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.MemberFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Functions</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getClassElement_MemberFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberFunction> getMemberFunctions();

} // ClassElement
