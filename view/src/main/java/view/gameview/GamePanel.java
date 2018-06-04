package view.gameview;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import controller.IController;
import controller.Order;
import model.Model;
import model.component.IComponent;
import view.IGamePanel;

/**
 * <h1>The GamePanel class.</h1>
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean
 *         Pierre
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements IGamePanel, KeyListener {
	private IComponent[][] components;
	private IController controller;

	/**
	 * Constructor of Game Panel.
	 * 
	 * @param model
	 * The model.
	 * @param controller
	 * The controller.
	 */
	public GamePanel(Model model, IController controller) {
		this.addKeyListener(this);
		this.controller = controller;
		this.setBackground(Color.BLACK);
	}

	/**
	 * Operation call to update the map.
	 */
	public void updateMap(IComponent[][] components) {

		this.components = components;
		repaint();
	}

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
/**
	 * We enlarge the images to put the game in full screen
	 */
		for (int x = 0; x < components.length; x++) {
			for (int y = 0; y < components[x].length; y++) {
				g.drawImage(components[x][y].getImage(components[x][y].getDirection()), y * 91, x * 91, 80, 80, null);
			}
		}

	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
/**
	 * we inform our program of the action of certain keys on the keyboard
	 */
		switch (keyCode) {
		case KeyEvent.VK_UP:
			controller.setAction(Order.UP);
			break;

		case KeyEvent.VK_DOWN:
			controller.setAction(Order.DOWN);
			break;

		case KeyEvent.VK_LEFT:
			controller.setAction(Order.LEFT);
			break;

		case KeyEvent.VK_RIGHT:
			controller.setAction(Order.RIGHT);
			break;

		case KeyEvent.VK_ESCAPE:
			System.exit(0);
			break;

		case KeyEvent.VK_SPACE:
			controller.setAction(Order.FIRE);
		}

	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}