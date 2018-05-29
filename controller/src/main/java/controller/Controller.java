package controller;

import java.util.ArrayList;

import model.Model;
import model.component.Component;
import model.component.Coordinate;
import view.gameview.GameFrame;
import view.gameview.GamePanel;

public class Controller { // Create class controller

	private GameFrame gameFrame;
	private GamePanel gamePanel;
	private Model model;
	private ArrayList<Thread> processus;
	private Thread playerMover;
	private Thread demon;
	private int score;

	public Controller(GameFrame gameFrame, Model model) { // Create the controller with parameters
	}

	public void play() { // Launch the game

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
