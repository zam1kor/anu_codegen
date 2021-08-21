/**
 */
package metamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metamodel.MemberFunction;
import metamodel.MetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Member Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberFunctionTest extends TestCase {

	/**
	 * The fixture for this Member Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberFunction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemberFunctionTest.class);
	}

	/**
	 * Constructs a new Member Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberFunctionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Member Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MemberFunction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Member Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberFunction getFixture() {
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
		setFixture(MetamodelFactory.eINSTANCE.createMemberFunction());
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

} //MemberFunctionTest
