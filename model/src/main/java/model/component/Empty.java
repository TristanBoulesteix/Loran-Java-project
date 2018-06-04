package model.component;
/**
 * <h1>The Empty class.</h1>
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Empty extends Component {
	private final static String PATH = "Pictures/empty";
	/**
	 * Constructor of Empty element
	 */
	public Empty(ICoordinate coordinate) {
		super(PATH, true, true, coordinate, null);
	}

}
