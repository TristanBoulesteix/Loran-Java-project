package model.component;
/**
 * <h1>The Cargyv class.</h1>
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Cargyv extends Demon {
	private final static String PATH = "Pictures/demons/cargyv";


	/**
	 * Constructor call to create a Cargyv.
	 * @param lorannPermeability
	 * The Lorann Permeability.
	 * @param demonPermeability
	 * The Demon permeability.
	 * 
	 * @param coordinate
	 * The coordinate.
	 */

	public Cargyv(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}