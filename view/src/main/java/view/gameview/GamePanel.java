package view.gameview;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observer;

import javax.swing.JPanel;

import model.Model;
import model.component.Component;
import model.component.Direction;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements KeyListener {
	private Component[][] components;
	private Observer observer;

	public GamePanel(Model model, Observer observer) {
		this.addKeyListener(this);
		this.observer = observer;
		this.setBackground(Color.BLACK);
	}

	public void updateMap(Component[][] components) {
		this.components = components;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int x = 0; x < components.length; x++) {
			for (int y = 0; y < components[x].length; y++) {
				g.drawImage(components[x][y].getImage(Direction.LEFT), y * 91, x * 91, 80, 80, null);
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();

		switch (keyCode) {
		case KeyEvent.VK_UP:
			observer.update(null, Direction.UP);
			break;

		case KeyEvent.VK_DOWN:
			observer.update(null, Direction.DOWN);
			break;

		case KeyEvent.VK_LEFT:
			observer.update(null, Direction.LEFT);
			break;

		case KeyEvent.VK_RIGHT:
			observer.update(null, Direction.RIGHT);
			break;

		case KeyEvent.VK_ESCAPE:
			System.exit(0);
			break;

		case KeyEvent.VK_SPACE:
			// observer.update();
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