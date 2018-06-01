package model.component;

public abstract class Demon extends Component implements Kill {
	private boolean alive;

	public Demon(String path, boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate,
			Direction direction) {
		super(path, lorannPermeability, demonPermeability, coordinate, direction);
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