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
		while (player.isAlive()) {
			Component[][] components = controller.getModel().getMap();
			controller.getGameFrame().initializeMapComponent(components);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
