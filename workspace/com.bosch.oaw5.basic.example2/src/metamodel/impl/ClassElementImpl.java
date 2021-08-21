/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.ClassElement;
import metamodel.GlobalVariable;
import metamodel.MemberFunction;
import metamodel.MetamodelPackage;
import metamodel.Namespace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.impl.ClassElementImpl#getNamespaceRefs <em>Namespace Refs</em>}</li>
 *   <li>{@link metamodel.impl.ClassElementImpl#getGlobalVariableDefs <em>Global Variable Defs</em>}</li>
 *   <li>{@link metamodel.impl.ClassElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.impl.ClassElementImpl#getMemberFunctions <em>Member Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassElementImpl extends MinimalEObjectImpl.Container implements ClassElement {
	/**
	 * The cached value of the '{@link #getNamespaceRefs() <em>Namespace Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaceRefs;

	/**
	 * The cached value of the '{@link #getGlobalVariableDefs() <em>Global Variable Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> globalVariableDefs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberFunctions() <em>Member Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberFunction> memberFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLASS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespaceRefs() {
		if (namespaceRefs == null) {
			namespaceRefs = new EObjectResolvingEList<Namespace>(Namespace.class, this, MetamodelPackage.CLASS_ELEMENT__NAMESPACE_REFS);
		}
		return namespaceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getGlobalVariableDefs() {
		if (globalVariableDefs == null) {
			globalVariableDefs = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, MetamodelPackage.CLASS_ELEMENT__GLOBAL_VARIABLE_DEFS);
		}
		return globalVariableDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLASS_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberFunction> getMemberFunctions() {
		if (memberFunctions == null) {
			memberFunctions = new EObjectContainmentEList<MemberFunction>(MemberFunction.class, this, MetamodelPackage.CLASS_ELEMENT__MEMBER_FUNCTIONS);
		}
		return memberFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.CLASS_ELEMENT__GLOBAL_VARIABLE_DEFS:
				return ((InternalEList<?>)getGlobalVariableDefs()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.CLASS_ELEMENT__MEMBER_FUNCTIONS:
				return ((InternalEList<?>)getMemberFunctions()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.CLASS_ELEMENT__NAMESPACE_REFS:
				return getNamespaceRefs();
			case MetamodelPackage.CLASS_ELEMENT__GLOBAL_VARIABLE_DEFS:
				return getGlobalVariableDefs();
			case MetamodelPackage.CLASS_ELEMENT__NAME:
				return getName();
			case MetamodelPackage.CLASS_ELEMENT__MEMBER_FUNCTIONS:
				return getMemberFunctions();
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
			case MetamodelPackage.CLASS_ELEMENT__NAMESPACE_REFS:
				getNamespaceRefs().clear();
				getNamespaceRefs().addAll((Collection<? extends Namespace>)newValue);
				return;
			case MetamodelPackage.CLASS_ELEMENT__GLOBAL_VARIABLE_DEFS:
				getGlobalVariableDefs().clear();
				getGlobalVariableDefs().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case MetamodelPackage.CLASS_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.CLASS_ELEMENT__MEMBER_FUNCTIONS:
				getMemberFunctions().clear();
				getMemberFunctions().addAll((Collection<? extends MemberFunction>)newValue);
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
			case MetamodelPackage.CLASS_ELEMENT__NAMESPACE_REFS:
				getNamespaceRefs().clear();
				return;
			case MetamodelPackage.CLASS_ELEMENT__GLOBAL_VARIABLE_DEFS:
				getGlobalVariableDefs().clear();
				return;
			case MetamodelPackage.CLASS_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.CLASS_ELEMENT__MEMBER_FUNCTIONS:
				getMemberFunctions().clear();
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
			case MetamodelPackage.CLASS_ELEMENT__NAMESPACE_REFS:
				return namespaceRefs != null && !namespaceRefs.isEmpty();
			case MetamodelPackage.CLASS_ELEMENT__GLOBAL_VARIABLE_DEFS:
				return globalVariableDefs != null && !globalVariableDefs.isEmpty();
			case MetamodelPackage.CLASS_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.CLASS_ELEMENT__MEMBER_FUNCTIONS:
				return memberFunctions != null && !memberFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassElementImpl
