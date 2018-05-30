package controller;

import model.component.Component;
import model.component.Direction;

public class DemonMover implements Runnable { // Create the class DemonMover wich is implements by Runable

	private Direction direction; // Create the attribute direction

	public DemonMover(Component[][] componementsPosition) { // Demons Movement
		/* Point pos = monster.getPos().getLocation();
	        Point nextPos = this.computeNextPos(
	                monster.getDirection(
	                        this.hero.getPos().getLocation(),
	                        this.tileMap),
	                pos);
	        if(nextPos != pos) {
	            String element = tileMap[nextPos.x][nextPos.y].getClass()
	                    .getSimpleName();
	            if(element.contains("Hero")) {
	                this.dead = true;
	            } else if(!element.contains("Monster") &&
	                    !element.contains("Purse") &&
	                    !element.contains("Crystal") &&
	                    !element.contains("Door")) {
	                tileMap[pos.x][pos.y] = model.element(' ', pos.getLocation());
	                monster.setLocation(nextPos);
	                tileMap[nextPos.x][nextPos.y] = monster;
	            }
	        }
	}*/ //ID demon mover

	public Component[][] getComponementsPosition() { // Access to variables
		return null;
	}

	public void setComponement(Component[][] componementsPosition) { // Edit variables

	}

	@Override
	public void run() {

	}

}