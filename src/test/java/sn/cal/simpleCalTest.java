package sn.cal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class simpleCalTest {
	private simpleCal calculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calculator = new simpleCal();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculator() {

		String args[] = {"1","2","3"};
		
		assertEquals(2,calculator.calculator(args));
	}

}
