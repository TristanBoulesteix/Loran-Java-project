package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Kyracj extends Demon {
	private final static String PATH = "Pictures/demons/kyracj";
/**
 * 
 * @param lorannPermeability
 * @param demonPermeability
 * @param coordinate
 * @param direction
 */
	public Kyracj(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}
