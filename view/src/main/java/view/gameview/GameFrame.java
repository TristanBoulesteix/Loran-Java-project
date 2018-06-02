package view.gameview;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import controller.IController;
import model.Model;
import view.IGameFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame implements IGameFrame {
	private GamePanel panel;

	public GameFrame(Model model, IController controller) {
		/* We create a Frame with parameters */
		this.panel = new GamePanel(model, controller);
		/* we put the Panel attentive to the events */
		this.panel.setFocusable(true);
		/* prevent the creation of a shortcut bar at the top of the screen */
		this.setUndecorated(true);
		/* We put the title of the game on the Frame */
		this.setTitle("Lorann");
		/* We put the Frame on the center of the screen */
		this.setLocationRelativeTo(null);
		/* We close the processus when we close the window */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* We put the Frame on full screen */
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		/* We put the background in black */
		this.getContentPane().setBackground(Color.BLACK);
		/* We put the Panel on the center of the Frame */
		this.getContentPane().add(panel, BorderLayout.CENTER);
		/* we forbid resizing */
		this.setResizable(false);
	}

	public GamePanel getPanel() {
		return panel;
	}

}
