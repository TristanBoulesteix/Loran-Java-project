package model.component;
/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Arrbarr extends Demon {
	private final static String PATH = "Pictures/demons/arrbarr";



	/**
	 * Constructor call to create a Arrbarr.
	 * 
	 * @param lorannPermeability
	 * The lorann permeability.
	 * @param demonPermeability
	 * The demon permeability.
	 * 
	 * @param coordinate
	 * The coordinate.
	 */

	public Arrbarr(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}