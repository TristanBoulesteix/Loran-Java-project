package model.component;

public abstract class Demon extends Component implements Kill {
	public Demon(String path, boolean permeability, Coordinate coordinate) {
		super(path, permeability, coordinate);
	}
}