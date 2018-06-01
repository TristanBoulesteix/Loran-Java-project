package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Setting extends Component {
	/**
	 * 
	 * @param coordinate
	 * @param path
	 */
	public Setting(Coordinate coordinate, String path) {
		super(path, false, false, coordinate, Direction.UP);
	}
}
