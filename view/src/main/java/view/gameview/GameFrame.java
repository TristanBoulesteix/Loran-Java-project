package view.gameview;

import java.util.Observer;

import javax.swing.JFrame;

import model.Model;
import model.component.Component;

public class GameFrame extends JFrame {

	private GamePanel panel;
	private Model model;

	public GameFrame(Model model, Observer observer) {

		panel = new GamePanel(model, observer);
		panel.setFocusable(true);
		this.setTitle("Lorann");
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
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
