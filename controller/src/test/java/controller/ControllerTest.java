package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Model;
/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class ControllerTest {
Controller control;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
/**
 * Creation of an new Controller Before
 * @throws Exception
 */
	@Before
	public void setUp() throws Exception {
		control = new Controller(new Model());
	}

	@After
	public void tearDown() throws Exception {
	}
/**
 * the final int expected of the method testGetScore
 * after we use assertEquals to find if contro.getScore is = with expected
 */
	@Test
	public void testGetScore() {
		final int expected = 0;
		assertEquals(expected,control.getScore());
		
		
		
	}

}
