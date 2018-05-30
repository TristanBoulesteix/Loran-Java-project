package model.component;

public abstract class Touch extends Component {
	private boolean available;
	private boolean touched;

	public Touch(String path, boolean permeability, Coordinate coordinate, boolean available) {
		super(path, permeability, coordinate);
		this.setAvailable(available);
	}

	public void actionWhenContactHappend() {
		this.touched = true;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isTouched() {
		return touched;
	}
}
