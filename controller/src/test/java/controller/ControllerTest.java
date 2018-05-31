package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Model;

public class ControllerTest {
Controller control;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		control = new Controller(new Model());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetScore() {
		final int expected = 0;
		assertEquals(expected,control.getScore());
		
		
	}

}
