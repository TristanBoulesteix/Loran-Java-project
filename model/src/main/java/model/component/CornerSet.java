package model.component;
/**
 * CornerSet
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class CornerSet extends Setting {
	private final static String PATH = "Pictures/set/cornerSet";
	/**
	 * Constructor of cornerset.
	 * @param coordinate
	 * The coordinate.
	 */
	public CornerSet(Coordinate coordinate) {
		super(coordinate, PATH);
	}

}
