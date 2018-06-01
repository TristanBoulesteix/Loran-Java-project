package model.component;

import java.awt.Image;
import java.util.ArrayList;

import model.dao.SpriteReader;

public abstract class Component implements IComponent {
	private final boolean PERMEABILITY;

	private ICoordinate coordinate;
	private ArrayList<Image> sprites;

	public Component(String path, boolean permeability, ICoordinate coordinate) {
		this.PERMEABILITY = permeability;
		this.coordinate = coordinate;
		this.sprites = new ArrayList<Image>();

		SpriteReader reader = new SpriteReader(path);
		sprites = reader.getSprites();
	}

	@Override
	public ICoordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public Image getImage(Direction direction) {
		return sprites.get(0);
	}

	@Override
	public void setCoordinate(ICoordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public boolean isPERMEABLE() {
		return PERMEABILITY;
	}

	protected ArrayList<Image> getSprites() {
		return sprites;
	}
}
