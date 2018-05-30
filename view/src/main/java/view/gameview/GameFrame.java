package view.gameview;

import java.util.Observer;

import javax.swing.JFrame;

import model.Model;
import model.component.Component;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	private GamePanel panel;
	private Model model;

	public GameFrame(Model model, Observer observer) {
		this.panel = new GamePanel(model, observer);
		this.panel.setFocusable(true);
		this.setUndecorated(true);
		this.setTitle("Lorann");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setContentPane(panel);
		this.setResizable(false);
		this.pack();
	}

	public void initializeMapComponent(Component[][] components) {
		panel.updateMap(components);
	}

	public GamePanel getPanel() {
		return panel;
	}

}
