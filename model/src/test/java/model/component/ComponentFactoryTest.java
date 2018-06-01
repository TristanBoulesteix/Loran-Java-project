package model.component;

import static org.junit.Assert.assertEquals;

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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

	}

	@Test
	public void getLorann() {
		//get Lorann is a method who return the object Lorann
		final Object expected = new Lorann(true, true, new Coordinate(0, 0));
		// so we created a new Loran with the basic setup
		assertEquals(expected, ComponentFactory.getLorann());
		//then we use assertEquals to find if expected and the return Lorann are the same
	}

}
