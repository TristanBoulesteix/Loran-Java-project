package controller;

import model.component.IComponent;
import model.component.ILorann;

public class GameController implements Runnable {
	private ILorann player;
	private IController controller;

	public GameController(ILorann player, IController controller) {
		this.player = player;
		this.controller = controller;
	}

	@Override
	public void run() {
		while (player.isAlive() || !controller.isVictory()) {
			IComponent[][] components = controller.getModel().getMap();
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
