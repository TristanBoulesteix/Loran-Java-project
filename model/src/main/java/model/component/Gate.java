package model.component;

import java.awt.Image;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Gate extends Touch implements IGate, Kill {
	private final static String PATH = "Pictures/gate";
	/**
	 * 
	 * @param lorannPermeability
	 * @param demonPermeability
	 * @param coordinate
	 * @param available
	 */
	public Gate(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, Direction.UP);
	}

	@Override
	public void kill(Component target) {
		if (!isAvailable()) {
			if (target instanceof Lorann) {
				Lorann character = (Lorann) target;
				character.kill();
			}
		}
	}

	@Override
	public Image getImage(Direction direction) { // If direction equal up, the sprite of the door is closed else, it's
													// open
		if (isAvailable()) {
			return getSprites().get(1);
		} else {
			return getSprites().get(0);
		}
	}

}
