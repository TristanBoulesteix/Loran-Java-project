package view.gameview;

import static org.junit.Assert.*;

import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Model;

public class GameFrameTest {
	GamePanel panel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		panel = new GamePanel(new Model(),null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPanel() {
		final Panel expected;
		asserEquals(expected, panel.GetPanel());
	}

}
