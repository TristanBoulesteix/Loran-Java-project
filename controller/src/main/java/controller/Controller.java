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

public class Controller implements IController, Observer { // Create class controller
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
		gameController = new GameController(model.getLorann(), this, instantiateDemonMover());
		game = new Thread(gameController);
		gameFrame.setVisible(true);
	}

	private ArrayList<DemonMover> instantiateDemonMover() {
		ArrayList<Demon> demons = ComponentFactory.getDemons();
		ArrayList<DemonMover> movers = new ArrayList<DemonMover>();

		for (Demon demon : demons) {
			movers.add(new DemonMover(demon, this));
		}

		return movers;
	}

	@Override
	public void moveComponent(IComponent component, Direction direction) { // Displays the components with
																			// their
		// direction
		ICoordinate currentCoordinates = component.getCoordinate();
		ICoordinate newCoordinates;

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

	private synchronized boolean directionisAvailableForLorann(ICoordinate coordinateToCheck) {
		IComponent destination = model.getMap()[coordinateToCheck.getX()][coordinateToCheck.getY()];

		if (destination.isLORANN_PERMEABLE()) {
			return true;
		} else {
			return false;
		}
	}

	private synchronized boolean directionIsAvailableForDemons(ICoordinate coordinateToCheck) {
		IComponent destination = model.getMap()[coordinateToCheck.getX()][coordinateToCheck.getY()];

		if (destination.isDEMON_PERMEABLE()) {
			return true;
		} else {
			return false;
		}

	}

	private synchronized void checkTargetLocation(IComponent componentToMove, IComponent componentInPosition) {
		if (componentToMove instanceof Lorann) {
			Lorann lorann = (Lorann) componentToMove;

			if (componentInPosition instanceof Treasure) {
				Treasure treasure = (Treasure) componentInPosition;

				this.score = score + treasure.getValue();
			} else if (componentInPosition instanceof Demon) {
				this.model.getLorann().kill();

			} else if (componentInPosition instanceof Gate) {
				Gate gate = (Gate) componentInPosition;

				if (gate.isAvailable()) {
					setVictory(true);
				} else {
					lorann.kill();
				}

			} else if (componentInPosition instanceof EnergySphere) {
				EnergySphere sphere = (EnergySphere) componentInPosition;

				if (sphere.isAvailable()) {
					model.getGate().setAvailable(true);
				}
				sphere.setAvailable(false);
			}

		} else if (componentToMove instanceof Demon) {
			Demon demon = (Demon) componentToMove;

			if (componentInPosition instanceof Lorann) {
				Lorann lorann = (Lorann) componentInPosition;
				lorann.kill();

			} else if (componentInPosition instanceof Demon) {
				DemonMover.move(demon);

			} else if (componentInPosition instanceof EnergySphere) {
				DemonMover.move(demon);
			}
		}

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		moveComponent(model.getLorann(), (Direction) arg1);
		// System.out.println(arg1);
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
