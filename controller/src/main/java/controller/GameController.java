package controller;

import model.component.Component;
import model.component.Lorann;

public class GameController implements Runnable {
	private Lorann player;
	private Controller controller;

	public GameController(Lorann player, Controller controller) {
		this.player = player;
		this.controller = controller;
	}

	@Override
	public void run() {
		while (player.isAlive() || !controller.isVictory()) {
			Component[][] components = controller.getModel().getMap();
			controller.getGameFrame().getPanel().updateMap(components);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Dead");
	}

}
