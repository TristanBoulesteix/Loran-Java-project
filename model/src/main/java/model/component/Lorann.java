package model.component;

import java.awt.Image;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Lorann extends Component implements ILorann {
	private final static String PATH = "Pictures/Lorann";

	private boolean alive;
	private boolean spellLaunched;
/**
 * 
 * @param lorannPermeability
 * @param demonPermeability
 * @param coordinate
 * @param direction
 */
	public Lorann(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);

		this.alive = true;
		this.spellLaunched = false;
	}
/**
 * @return boolean
 */
	public boolean launchSpell() {
		if (spellLaunched) {
			return false;
		} else {
			spellLaunched = true;
			return true;
		}
	}
/**
 * @return alive
 */
	public boolean isAlive() {
		return alive;
	}
/**
 * Kill Lorann
 */
	public void kill() {
		this.alive = false;
	}

	@Override
	public Image getImage(Direction direction) {
		switch (direction) {
		case DOWN:
			return getSprites().get(0);

		case DOWNLEFT:
			return getSprites().get(1);

		case DOWNRIGHT:
			return getSprites().get(2);

		case LEFT:
			return getSprites().get(3);

		case RIGHT:
			return getSprites().get(4);

		case UP:
			return getSprites().get(5);

		case UPLEFT:
			return getSprites().get(6);

		case UPRIGHT:
			return getSprites().get(7);

		default:
			return getSprites().get(0);
		}
	}
/**
 * 
 * @return spellLaunched
 */
	public boolean isSpellLaunched() {
		return spellLaunched;
	}
	/**
	 * 
	 * @param spellLaunched
	 */
	public void setSpellLaunched(boolean spellLaunched) {
		this.spellLaunched = spellLaunched;
	}
}
