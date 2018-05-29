package model.component;

import java.awt.Image;

public abstract class Component {
	private final boolean PERMEABILITY;

	private Coordinate coordinate;

	public Component(String path, boolean permeability, Coordinate coordinate) {
		this.PERMEABILITY = permeability;
		this.coordinate = coordinate;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public Image getImage(Direction direction) {
		return null;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
}
