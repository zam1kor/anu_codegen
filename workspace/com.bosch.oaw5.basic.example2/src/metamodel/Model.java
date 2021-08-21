/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Model#getClassesList <em>Classes List</em>}</li>
 *   <li>{@link metamodel.Model#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes List</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.ClassElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes List</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getModel_ClassesList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassElement> getClassesList();

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getModel_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

} // Model
