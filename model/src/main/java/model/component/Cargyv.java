package model.component;

public class Cargyv extends Demon {
	private final static String PATH = "Pictures/demons/cargyv";

	/**
	 * 
	 * @param lorannPermeability
	 * @param demonPermeability
	 * @param coordinate
	 */
	public Cargyv(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, direction);
	}

}