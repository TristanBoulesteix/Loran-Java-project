package controller;

import java.util.ArrayList;

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

		while (player.isAlive() || !controller.isVictory()) {
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
		}

		System.out.println("Dead !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
