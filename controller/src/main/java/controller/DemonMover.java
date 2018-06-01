package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import model.component.Component;
import model.component.Demon;
import model.component.Direction;

public class DemonMover { // Create the class DemonMover wich is implements by Runable

	private Demon demon; // Create the attribute direction
	private Controller controller;
	
	public DemonMover(Demon demon, Controller controller) { // Demons Movement
		this.demon = demon;
		this.controller = controller;

	}
	
	public void move() {
	//methode move appel d'autre methode crer un nbr aléatoir
	Random rand = new Random();
	
	//get toute les position possible puis arraylist de enum
	ArrayList<Direction> list = Stream.of(Direction.values());
	
	//apel de la methode moveC du contructeur
	controller.moveComponent(demon, direction);
	}


	public Component[][] getComponementsPosition() { // Access to variables
		return null;
	}

	public void setComponement(Component[][] componementsPosition) { // Edit variables

	}

}