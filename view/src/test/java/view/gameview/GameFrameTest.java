package view.gameview;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Model;
/**
 * 
 *@author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class GameFrameTest {
	GameFrame frame;
	Model model;
/**
 * 
 * @throws Exception
 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
/**
 * 
 * @throws Exception
 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
/**
 * 
 * @throws Exception
 */
	@Before
	public void setUp() throws Exception {
		model = new Model();
		frame = new GameFrame(model, null);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * asserEquals compare the expected value relative to GamePanel from the frame
	 */
	@Test
	public void testGetPanel() {
		
		final GamePanel expected = this.frame.getPanel();	
		assertEquals(expected, frame.getPanel());
	}

}
