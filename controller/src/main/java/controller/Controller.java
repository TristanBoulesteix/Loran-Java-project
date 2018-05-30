package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import model.Model;
import model.component.Component;
import model.component.Direction;
import view.gameview.GameFrame;
import view.gameview.GamePanel;
import view.levelselector.LevelSelector;

public class Controller implements Observer { // Create class controller

	private GameFrame gameFrame;
	private GamePanel gamePanel;
	private Model model;
	private ArrayList<Thread> processus;
	private Thread player;
	private Thread demon;
	private int score;

	public Controller(Model model) { // Create the controller with parameters
		this.model = model;
		gameFrame = new GameFrame(model, this);
		processus = new ArrayList<Thread>();
		initializeGame();
	}

	public void play() { // Run the game
		while (model.getLorann().isAlive()) {

		}
	}

	private void initializeGame() { // Initialization of the game
		try {
			model.generateMap(LevelSelector.getLevel());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Component[][] components = model.getMap();
		gameFrame.initializeMapComponent(components);
		gameFrame.setVisible(true);

		demon = new Thread(new DemonMover(components));
		player = new Thread(new PlayerMover());

		processus.add(demon);
		processus.add(player);
	}

	private void updateMap() { // Update Map
		Component[][] map = model.getMap();
		gameFrame.initializeMapComponent(map);
	}

	public void moveComponent(Component component, Direction direction) { // Displays the components with
																			// their coordinate

	}

	private void runAllThread() { // Run all Thread
		for (int i = 0; i < processus.size(); i++) {
			processus.get(i).run();
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println(arg1);
		moveComponent(null, (Direction) arg1);
	}
}
