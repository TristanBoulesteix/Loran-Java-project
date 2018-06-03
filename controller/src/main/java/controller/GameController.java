package controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JOptionPane;

import model.component.IComponent;
import model.component.ILorann;
/**
 * 
 *@author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class GameController implements Runnable {
	private ILorann player;
	private IController controller;
	private List<DemonMover> movers;
/**
 * 
 * @param player
 * @param controller
 * @param movers
 */
	public GameController(ILorann player, IController controller, CopyOnWriteArrayList<DemonMover> movers) {
		this.player = player;
		this.controller = controller;
		this.movers = movers;
	}
/**
 * 
 */
	@Override
	public void run() {
		int count = 0;

		while (player.isAlive()) {
			IComponent[][] components = controller.getModel().getMap();

			if (count == 4) {
				if (controller.getModel().getLorann().isSpellLaunched()) {
					controller.moveComponent((IComponent) controller.getModel().getSpell(null, null),
							((IComponent) controller.getModel().getSpell(null, null)).getDirection());
				}

				for (DemonMover mover : movers) {
					if (!mover.getDemon().isAlive()) {
						controller.removeComponent(mover.getDemon());
						movers.remove(mover);
					} else {
						mover.move();
					}
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

		if (controller.isVictory()) {
			// Add popup for victory or defeat
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
