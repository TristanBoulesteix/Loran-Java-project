package model.component;

public abstract class Touch extends Component {
	private boolean available;

	public Touch(String path, boolean permeability, Coordinate coordinate, boolean available) {
		super(path, permeability, coordinate);
		this.setAvailable(available);
	}

	public abstract void actionWhenContactHappend();

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
