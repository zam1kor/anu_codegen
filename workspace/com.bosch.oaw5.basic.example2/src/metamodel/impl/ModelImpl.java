/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.ClassElement;
import metamodel.MetamodelPackage;
import metamodel.Model;
import metamodel.Namespace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.impl.ModelImpl#getClassesList <em>Classes List</em>}</li>
 *   <li>{@link metamodel.impl.ModelImpl#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getClassesList() <em>Classes List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesList()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassElement> classesList;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassElement> getClassesList() {
		if (classesList == null) {
			classesList = new EObjectContainmentEList<ClassElement>(ClassElement.class, this, MetamodelPackage.MODEL__CLASSES_LIST);
		}
		return classesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this, MetamodelPackage.MODEL__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.MODEL__CLASSES_LIST:
				return ((InternalEList<?>)getClassesList()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.MODEL__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.MODEL__CLASSES_LIST:
				return getClassesList();
			case MetamodelPackage.MODEL__NAMESPACES:
				return getNamespaces();
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
			case MetamodelPackage.MODEL__CLASSES_LIST:
				getClassesList().clear();
				getClassesList().addAll((Collection<? extends ClassElement>)newValue);
				return;
			case MetamodelPackage.MODEL__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends Namespace>)newValue);
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
			case MetamodelPackage.MODEL__CLASSES_LIST:
				getClassesList().clear();
				return;
			case MetamodelPackage.MODEL__NAMESPACES:
				getNamespaces().clear();
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
			case MetamodelPackage.MODEL__CLASSES_LIST:
				return classesList != null && !classesList.isEmpty();
			case MetamodelPackage.MODEL__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
