package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.component.IComponent;
import model.component.ILorann;

public class GameController implements Runnable {
	private ILorann player;
	private IController controller;
	private ArrayList<DemonMover> movers;

	public GameController(ILorann player, IController controller, ArrayList<DemonMover> movers) {
		this.player = player;
		this.controller = controller;
		this.movers = movers;
	}

	@Override
	public void run() {
		int count = 0;

		while (player.isAlive()) {
			IComponent[][] components = controller.getModel().getMap();

			if (count == 4) {
				for (DemonMover mover : movers) {
					mover.move();
				}
				count = 0;
			}

			controller.getGameFrame().getPanel().updateMap(components);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			count++;

			if (controller.isVictory()) {
				break;
			}
		}

		if (controller.isVictory()) { // Add Popup for victory or defeat
			int finalscore = 100 + controller.getScore();
			JOptionPane.showMessageDialog(null, "CONGRATULATION !\nYour score is " + finalscore, "GAME OVER",
					JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "GAME OVER\nYour score is " + controller.getScore(), "GAME OVER",
					JOptionPane.OK_OPTION);
		}
		controller.getGameFrame().dispose();
	}

}
