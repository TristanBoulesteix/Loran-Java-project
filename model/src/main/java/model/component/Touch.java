package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public abstract class Touch extends Component {
	private boolean available;
	private boolean touched;
/**
 * 
 * @param path
 * @param lorannPermeability
 * @param demonPermeability
 * @param coordinate
 * @param available
 * @param direction
 */
	public Touch(String path, boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate,
			boolean available, Direction direction) {
		super(path, lorannPermeability, demonPermeability, coordinate, direction);
		this.setAvailable(available);
	}

	public void actionWhenContactHappend() {
		this.touched = true;
	}
/**
 * 
 * @return available
 */
	public boolean isAvailable() {
		return available;
	}
/**
 * 
 * @param available
 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
/**
 * 
 * @return touched
 */
	public boolean isTouched() {
		return touched;
	}
}
