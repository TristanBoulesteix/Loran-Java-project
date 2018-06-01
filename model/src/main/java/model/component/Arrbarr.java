package model.component;

public class Arrbarr extends Demon {
	private final static String PATH = "Pictures/demons/arrbarr";

	/**
	 * 
	 * @param lorannPermeability
	 * @param demonPermeability
	 * @param coordinate
	 */
	public Arrbarr(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}