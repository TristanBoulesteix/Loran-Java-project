package model.component;
/**
 * <h1>The HorizontalSet class.</h1>
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class HorizontalSet extends Setting {
	private final static String PATH = "Pictures/set/horizontalSet";
/**
 * Constructor of HorizontalSet.
 * @param coordinate
 * The coordinate.
 */
	public HorizontalSet(Coordinate coordinate) {
		super(coordinate, PATH);
	}

}
