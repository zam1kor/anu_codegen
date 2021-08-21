/**
 */
package metamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metamodel.ClassElement;
import metamodel.MetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassElementTest extends TestCase {

	/**
	 * The fixture for this Class Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassElementTest.class);
	}

	/**
	 * Constructs a new Class Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClassElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassElement getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelFactory.eINSTANCE.createClassElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClassElementTest
