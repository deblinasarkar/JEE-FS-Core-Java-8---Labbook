package maven.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/*
 * public class AppTest extends TestCase {
 *//**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
/*
 * public AppTest( String testName ) { super( testName ); }
 * 
 *//**
	 * @return the suite of tests being tested
	 */
/*
 * public static Test suite() { return new TestSuite( AppTest.class ); }
 * 
 *//**
	 * Rigourous Test :-)
	 *//*
		 * public void testApp() { assertTrue( true ); } }
		 */

public class AppTest{
	@Test
	public void testCase() {
		System.out.println("Testcase");
		assertEquals(10,10);
	}
	
	@Test
	public void testCase2() {
		System.out.println("Testcase2");
		assertNotEquals(10,11);
	}
}