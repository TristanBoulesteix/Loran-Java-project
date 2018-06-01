package model.component;

public class Setting extends Component {
	public Setting(Coordinate coordinate, String path) {
		super(path, false, false, coordinate, Direction.UP);
	}
}
