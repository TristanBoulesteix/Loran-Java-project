package model.component;

public class Lorann extends Component {
	private final static String PATH = "";

	public boolean alive;

	public Lorann(boolean permeability, Coordinate coordinate) {
		super(PATH, permeability, coordinate);

		this.alive = true;
	}

	public void launchSpell() {

	}

	public boolean isAlive() {
		return alive;
	}

	public void kill() {
		this.alive = false;
	}

}
