package controller;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

import model.component.Demon;
import model.component.Direction;

public class DemonMover { // Create the class DemonMover wich is implements by Runable

	private Demon demon; // Create the attribute direction
	private static Controller controller;

	public DemonMover(Demon demon, Controller controller) { // Demons Movement
		this.demon = demon;
		DemonMover.controller = controller;

	}

	public void move() {
		// Creation of the new Random
		Random random = new Random();

		// get the enum in an ArrayList and use it randomly
		ArrayList<Direction> list = new ArrayList<Direction>(EnumSet.allOf(Direction.class));
		int index = random.nextInt(list.size());
		// call of MoveComponent
		controller.moveComponent(demon, list.get(index));
	}

	public static void move(Demon demonToMove) {
		// Creation of the new Random
		Random random = new Random();

		// get the enum in an ArrayList and use it randomly
		ArrayList<Direction> list = new ArrayList<Direction>(EnumSet.allOf(Direction.class));
		int index = random.nextInt(list.size());
		// call of MoveComponent
		controller.moveComponent(demonToMove, list.get(index));
	}

}