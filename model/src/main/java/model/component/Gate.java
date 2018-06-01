package model.component;

import java.awt.Image;

public class Gate extends Touch implements IGate, Kill {
	private final static String PATH = "Pictures/gate";

	public Gate(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available);
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
		if (direction.equals(Direction.UP)) {
			return getSprites().get(0);
		} else {
			return getSprites().get(1);
		}
	}

}
