package controller;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import model.Model;
import model.component.Component;
import model.component.Coordinate;
import model.component.Demon;
import model.component.Direction;
import model.component.Empty;
import model.component.EnergySphere;
import model.component.Gate;
import model.component.Lorann;
import model.component.Treasure;
import view.gameview.GameFrame;
import view.levelselector.LevelSelector;

public class Controller implements Observer { // Create class controller
	private GameFrame gameFrame;
	private Model model;
	private GameController gameController;
	private Thread game;
	private int score;
	private boolean victory;

	public Controller(Model model) { // Create the controller with parameters
		this.model = model;
		gameFrame = new GameFrame(model, this);
		initializeGame();
	}

	public void play() { // Run the game
		game.run();
	}

	private void initializeGame() { // Initialization of the game
		setVictory(false);

		try {
			model.generateMap(LevelSelector.getLevel());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gameController = new GameController(model.getLorann(), this);
		game = new Thread(gameController);
		gameFrame.setVisible(true);
	}

	public synchronized void moveComponent(Component component, Direction direction) { // Displays the components with
																						// their
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
			checkTargetLocation(component, model.getMap()[currentCoordinates.getX()][currentCoordinates.getY()]);

			component.setCoordinate(newCoordinates);
			model.getMap()[currentCoordinates.getX()][currentCoordinates.getY()] = new Empty(true, currentCoordinates);
			model.getMap()[newCoordinates.getX()][newCoordinates.getY()] = component;
		}
	}

	private synchronized boolean directionisAvailable(Coordinate coordinateToCheck) {
		Component destination = model.getMap()[coordinateToCheck.getX()][coordinateToCheck.getY()];

		if (destination.isPERMEABLE()) {
			return true;
		} else {
			return false;
		}
	}

	private synchronized Component checkTargetLocation(Component componentToMove, Component componentInPosition) {
		if (componentToMove instanceof Lorann) {
			Lorann lorann = (Lorann) componentToMove;

			if (componentInPosition instanceof Treasure) {
				Treasure treasure = (Treasure) componentInPosition;

				this.score = score + treasure.getValue();

				return new Empty(true, new Coordinate(componentInPosition.getCoordinate()));
			} else if (componentInPosition instanceof Demon) {
				lorann.kill();
				return null;
			} else if (componentInPosition instanceof Gate) {
				Gate gate = (Gate) componentInPosition;

				if (gate.isAvailable()) {
					setVictory(true);
				} else {
					lorann.kill();
				}
			} else if (componentInPosition instanceof EnergySphere) {
				model.getGate().setAvailable(true);
			}
		}

		return null;
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

	public boolean isVictory() {
		return victory;
	}

	public void setVictory(boolean victory) {
		this.victory = victory;
	}
}
