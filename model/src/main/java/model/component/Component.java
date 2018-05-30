package model.component;

import java.awt.Image;
import java.util.ArrayList;

import model.dao.SpriteReader;

public abstract class Component {
	private final boolean PERMEABILITY;

	private Coordinate coordinate;
	private ArrayList<Image> sprites;

	public Component(String path, boolean permeability, Coordinate coordinate) {
		this.PERMEABILITY = permeability;
		this.coordinate = coordinate;
		this.sprites = new ArrayList<Image>();

		SpriteReader reader = new SpriteReader(path);
		sprites = reader.getSprites();
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public Image getImage(Direction direction) {
		return sprites.get(0);
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public boolean isPERMEABLE() {
		return PERMEABILITY;
	}

	protected ArrayList<Image> getSprites() {
		return sprites;
	}
}
