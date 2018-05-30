package model.component;

public abstract class Demon extends Component implements Kill {
	private boolean alive;

	public Demon(String path, boolean permeability, Coordinate coordinate) {
		super(path, permeability, coordinate);
		this.alive = true;
	}

	@Override
	public void kill(Component target) {
		if (target instanceof Lorann) {
			Lorann character = (Lorann) target;
			character.kill();
		}
	}

	public boolean isAlive() {
		return alive;
	}

	public void kill() {
		this.alive = false;
	}
}