package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Maarcg extends Demon {
	private final static String PATH = "Pictures/demons/maarcg";
/**
 * 
 * @param lorannPermeability
 * @param demonPermeability
 * @param coordinate
 * @param direction
 */
	public Maarcg(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}