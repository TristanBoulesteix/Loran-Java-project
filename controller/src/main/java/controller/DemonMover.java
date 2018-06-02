package controller;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

import model.component.Demon;
import model.component.Direction;

/**
 * Create the class DemonMover which is implements by Runnable
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class DemonMover {
	private Demon demon;
	private static Controller controller;

	// Demons Movement
	public DemonMover(Demon demon, Controller controller) {
		this.demon = demon;
		DemonMover.controller = controller;

	}
/** 
 * call of MoveComponent.
 * get the enum in an ArrayList and use it randomly.
 *  Creation of the new Random.
 * 
 */
	public void move() {
		Random random = new Random();
		ArrayList<Direction> list = new ArrayList<Direction>(EnumSet.allOf(Direction.class));
		int index = random.nextInt(list.size());
		controller.moveComponent(demon, list.get(index));
	}
/**get the enum in an ArrayList and use it randomly.
 * 	Creation of the new Random.
 *  Call of MoveComponent
 * @param demonToMove
 */
	public static void move(Demon demonToMove) {
	
		Random random = new Random();
		ArrayList<Direction> list = new ArrayList<Direction>(EnumSet.allOf(Direction.class));
		int index = random.nextInt(list.size());
		controller.moveComponent(demonToMove, list.get(index));
	}

}