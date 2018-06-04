package model.component;
/**
 * <h1>The Setting class.</h1>
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Setting extends Component {
	/**
	 * Constructor of setting.
	 * @param coordinate
	 * The coordinate.
	 * @param path
	 * The path.
	 */
	public Setting(Coordinate coordinate, String path) {
		super(path, false, false, coordinate, Direction.UP);
	}
}
