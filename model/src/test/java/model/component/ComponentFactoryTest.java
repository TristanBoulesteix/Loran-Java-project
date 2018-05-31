package model.component;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComponentFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Lorann Lorann = new Lorann(false, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

	public void getLorann() {
		final Object expected  =new Lorann(false, null);
		
		assertEquals(expected, getLorann());
	}

}

