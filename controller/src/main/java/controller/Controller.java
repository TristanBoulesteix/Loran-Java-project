package controller;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import model.Model;
import model.component.Component;
import model.component.Coordinate;
import view.gameview.GameFrame;
import view.gameview.GamePanel;
import view.levelselector.LevelSelector;

public class Controller implements Observer{ // Create class controller

	private GameFrame gameFrame;
	private GamePanel gamePanel;
	private Model model;
	private ArrayList<Thread> processus;
	private Thread playerMover;
	private Thread demon;
	private int score;

	public Controller(Model model) { // Create the controller with parameters
	
		this.model = model;
		gameFrame = new GameFrame(model, this);
	}

	public void play() { // Launch the game
		LevelSelector lvlselect = new LevelSelector();
		Component[][] components = model.generateMap(lvlselect);
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

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println(arg1);
		
	}
}
