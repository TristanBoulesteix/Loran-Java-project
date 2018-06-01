package model.component;

public class Empty extends Component {
	private final static String PATH = "Pictures/empty";

	public Empty(ICoordinate coordinate) {
		super(PATH, true, true, coordinate, null);
	}

}
