package controller;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import model.Model;
import model.component.Component;
import model.component.Coordinate;
import model.component.Direction;
import model.component.Empty;
import view.gameview.GameFrame;
import view.levelselector.LevelSelector;

public class Controller implements Observer { // Create class controller
	private GameFrame gameFrame;
	private Model model;
	private GameController gameController;
	private Thread game;
	private int score;

	public Controller(Model model) { // Create the controller with parameters
		this.model = model;
		gameFrame = new GameFrame(model, this);
		initializeGame();
	}

	public void play() { // Run the game
		game.run();
	}

	private void initializeGame() { // Initialization of the game
		try {
			model.generateMap(LevelSelector.getLevel());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Component[][] components = model.getMap();
		gameController = new GameController(model.getLorann(), this);
		game = new Thread(gameController);
		gameFrame.setVisible(true);
	}

	public void moveComponent(Component component, Direction direction) { // Displays the components with their
																			// direction
		Coordinate currentCoordinates = component.getCoordinate();
		Coordinate newCoordinates;

		switch (direction) {
		case DOWN:
			newCoordinates = new Coordinate(currentCoordinates.getX() + 1, currentCoordinates.getY());
			break;

		case DOWNLEFT:
			newCoordinates = new Coordinate(currentCoordinates.getX() + 1, currentCoordinates.getY() - 1);
			break;

		case DOWNRIGHT:
			newCoordinates = new Coordinate(currentCoordinates.getX() + 1, currentCoordinates.getY() + 1);
			break;

		case LEFT:
			newCoordinates = new Coordinate(currentCoordinates.getX(), currentCoordinates.getY() - 1);
			break;

		case RIGHT:
			newCoordinates = new Coordinate(currentCoordinates.getX(), currentCoordinates.getY() + 1);
			break;

		case UP:
			newCoordinates = new Coordinate(currentCoordinates.getX() - 1, currentCoordinates.getY());
			break;

		case UPLEFT:
			newCoordinates = new Coordinate(currentCoordinates.getX() - 1, currentCoordinates.getY());
			break;

		case UPRIGHT:
			newCoordinates = new Coordinate(currentCoordinates.getX() - 1, currentCoordinates.getY() + 1);
			break;
		default:
			newCoordinates = new Coordinate(currentCoordinates.getX(), currentCoordinates.getY());
			break;
		}

		if (directionisAvailable(newCoordinates)) {
			component.setCoordinate(newCoordinates);
			model.getMap()[currentCoordinates.getX()][currentCoordinates.getY()] = new Empty(true, currentCoordinates);
			model.getMap()[newCoordinates.getX()][newCoordinates.getY()] = component;
		}
	}

	public boolean directionisAvailable(Coordinate coordinateToCheck) {
		Component destination = model.getMap()[coordinateToCheck.getX()][coordinateToCheck.getY()];

		if (destination.isPERMEABLE()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		moveComponent(model.getLorann(), (Direction) arg1);
		System.out.println(arg1);
	}

	public Model getModel() {
		return model;
	}

	public GameFrame getGameFrame() {
		return gameFrame;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
