package view.gameview;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Model;
import model.component.Component;
import model.component.Direction;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements KeyListener {
	private JLabel[][] labels;
	private Model model;
	private Observer observer;

	public GamePanel(Model model, Observer observer) {
		setLayout(new GridBagLayout());
		this.addKeyListener(this);
		this.observer = observer;
	}

	void gameview() {

	}

	public void updateMap(Component[][] components) {

		for (int x = 0; x < components.length; x++) {
			for (int y = 0; y < components[x].length; y++) {
				GridBagConstraints constraints = new GridBagConstraints();
				constraints.gridx = x;
				constraints.gridx = y;
				constraints.fill = GridBagConstraints.BOTH;
				JLabel label = new JLabel(new ImageIcon(components[x][y].getImage(Direction.DOWN)));
				this.add(label, constraints);
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