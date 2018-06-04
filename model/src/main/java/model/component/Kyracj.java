package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Kyracj extends Demon {
	private final static String PATH = "Pictures/demons/kyracj";
/**
 * The constructor of Kyracj.
 * 
 * @param lorannPermeability
 * The Lorann permeability.
 * @param demonPermeability
 * The demon permeability.
 * @param coordinate
 * The coordinate.
 * @param direction
 * The direction.
 */
	public Kyracj(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}
