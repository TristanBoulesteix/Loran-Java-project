package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import model.Model;
import model.component.ComponentFactory;
import model.component.Coordinate;
import model.component.Demon;
import model.component.Direction;
import model.component.Empty;
import model.component.EnergySphere;
import model.component.Gate;
import model.component.IComponent;
import model.component.ICoordinate;
import model.component.Lorann;
import model.component.Treasure;
import view.gameview.GameFrame;
import view.levelselector.LevelSelector;

// Create class controller
public class Controller implements IController, Observer {
	private GameFrame gameFrame;
	private Model model;
	private GameController gameController;
	private Thread game;
	private int score;
	private boolean victory;

	// Create the controller with parameters
	public Controller(Model model) {
		this.model = model;
		gameFrame = new GameFrame(model, this);
		initializeGame();
	}

	// Run the game
	public void play() {
		game.run();
	}

	// Initialization of the game
	private void initializeGame() {
		setVictory(false);

		try {
			model.generateMap(LevelSelector.getLevel());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gameController = new GameController(model.getLorann(), this, instantiateDemonMover());
		game = new Thread(gameController);
		gameFrame.setVisible(true);
	}

	// Instantiate the movement of the demon
	private ArrayList<DemonMover> instantiateDemonMover() {
		ArrayList<Demon> demons = ComponentFactory.getDemons();
		ArrayList<DemonMover> movers = new ArrayList<DemonMover>();

		// Loop for ask all demon to move
		for (Demon demon : demons) {
			movers.add(new DemonMover(demon, this));
		}

		return movers;
	}

	@Override
	// Displays the components with their direction
	public void moveComponent(IComponent component, Direction direction) {

		ICoordinate currentCoordinates = component.getCoordinate();
		ICoordinate newCoordinates;
		// Generate coordinate relative to the direction
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
		// Condition, if the component is Lorann, check if Lorann can move
		if (component instanceof Lorann) {
			if (directionisAvailableForLorann(newCoordinates)) {
				checkTargetLocation(component, model.getMap()[newCoordinates.getX()][newCoordinates.getY()]);

				component.setCoordinate(newCoordinates);
				model.getMap()[currentCoordinates.getX()][currentCoordinates.getY()] = new Empty(currentCoordinates);
				model.getMap()[newCoordinates.getX()][newCoordinates.getY()] = component;
			}
		} else if (component instanceof Demon) {
			if (directionIsAvailableForDemons(newCoordinates)) {
				checkTargetLocation(component, model.getMap()[newCoordinates.getX()][newCoordinates.getY()]);

				component.setCoordinate(newCoordinates);
				model.getMap()[currentCoordinates.getX()][currentCoordinates.getY()] = new Empty(currentCoordinates);
				model.getMap()[newCoordinates.getX()][newCoordinates.getY()] = component;
			}
		}
	}

	// Check is Lorann can move here.
	private synchronized boolean directionisAvailableForLorann(ICoordinate coordinateToCheck) {
		IComponent destination = model.getMap()[coordinateToCheck.getX()][coordinateToCheck.getY()];

		if (destination.isLORANN_PERMEABLE()) {
			return true;
		} else {
			return false;
		}
	}

	// Check if the demon can move here.
	private synchronized boolean directionIsAvailableForDemons(ICoordinate coordinateToCheck) {
		IComponent destination = model.getMap()[coordinateToCheck.getX()][coordinateToCheck.getY()];

		if (destination.isDEMON_PERMEABLE()) {
			return true;
		} else {
			return false;
		}

	}

	// Realize action relative to the target component
	private synchronized void checkTargetLocation(IComponent componentToMove, IComponent componentInPosition) {
		if (componentToMove instanceof Lorann) {
			Lorann lorann = (Lorann) componentToMove;
			// If Lorann catch a treasure, give 10 points.
			if (componentInPosition instanceof Treasure) {
				Treasure treasure = (Treasure) componentInPosition;

				this.score = score + treasure.getValue();
			} else if (componentInPosition instanceof Demon) {
				this.model.getLorann().kill();

			} else if (componentInPosition instanceof Gate) {
				Gate gate = (Gate) componentInPosition;
				// If gate is available, we win the game
				if (gate.isAvailable()) {
					setVictory(true);
				} else {
					// If gate is not available, kill Lorann
					lorann.kill();
				}

			} else if (componentInPosition instanceof EnergySphere) {
				EnergySphere sphere = (EnergySphere) componentInPosition;
				// When we take the EnergySphere, open the gate
				if (sphere.isAvailable()) {
					model.getGate().setAvailable(true);
				}
				sphere.setAvailable(false);
			}
			// If Lorann has the same position than a demon, Lorann die.
		} else if (componentToMove instanceof Demon) {
			if (componentInPosition instanceof Lorann) {
				Lorann lorann = (Lorann) componentInPosition;
				lorann.kill();

			}
		}

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (!arg1.equals(Order.FIRE)) {
			moveComponent(model.getLorann(), Direction.getDirectionFromOrder((Order) arg1));
		} else {
			if (model.getLorann().launchSpell()) {
				moveComponent(component, Direction.getOpositeDirection(model.getLorann().getDirection()));
			}
		}
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
