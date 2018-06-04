package model.component;
/**
 * <h1>The VerticalSet class.</h1>
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class VerticalSet extends Setting {
	private final static String PATH = "Pictures/set/verticalSet";
/**
 * Constructor of vertical Set.
 * @param coordinate
 * The coordinate.
 *
 */
	public VerticalSet(Coordinate coordinate) {
		super(coordinate, PATH);
	}

}
