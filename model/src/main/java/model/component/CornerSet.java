package model.component;
/**
 * 
 * <h1>The CornerSet class.</h1>
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
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
