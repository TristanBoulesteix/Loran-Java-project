package view.gameview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observer;

import javax.swing.JFrame;

import model.Model;

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
		this.getContentPane().setBackground(Color.BLACK);
		this.getContentPane().add(panel, BorderLayout.CENTER);
		this.setResizable(false);
	}

	public GamePanel getPanel() {
		return panel;
	}

}
