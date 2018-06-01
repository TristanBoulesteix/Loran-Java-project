package model.component;
/**
 * Demon class
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public abstract class Demon extends Component implements Kill {
	private boolean alive;
	/**
	 * 
	 * @param path
	 * @param lorannPermeability
	 * @param demonPermeability
	 * @param coordinate
	 * @param direction
	 */
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
	/**
	 * 
	 * @return alive
	 */
	public boolean isAlive() {
		return alive;
	}
	/**
	 * Kill demon
	 * 
	 */
	public void kill() {
		this.alive = false;
	}
}