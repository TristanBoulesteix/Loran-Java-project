package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Model;
import model.component.Component;
import model.component.Coordinate;
import view.gameview.GameFrame;
import view.gameview.GamePanel;
import view.levelselector.LevelSelector;

public class Controller { // Create class controller

	private GameFrame gameFrame;
	private GamePanel gamePanel;
	private Model model;
	private ArrayList<Thread> processus;
	private Thread playerMover;
	private Thread demon;
	private int score;

	public Controller(Model model) { // Create the controller with parameters
	
		this.model = model;
		gameFrame = new GameFrame(model);
	}

	public void play() { // Launch the game
		LevelSelector lvlselect = new LevelSelector();
		try {
			model.generateMap(LevelSelector.getLevel());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Component[][] components = model.getMap();
		gameFrame.initializeMapComponent(components);
	}

	private void initializeGame() { // Initialization of the game

	}

	private void updateMap() { // Update Map

	}

	public void moveComponement(Component componement, Coordinate coordinate) { // Displays the componements with
																				// their coordinate

	}

	private void runAllThread() { // Run all Thread

	}

	private void closeAllThread() { // Finish all Thread

	}
}
