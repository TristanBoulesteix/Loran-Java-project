package model.component;

public class Empty extends Component {
	private final static String PATH = "Pictures/empty";

	public Empty(boolean permeability, Coordinate coordinate) {
		super(PATH, permeability, coordinate);
	}

}
