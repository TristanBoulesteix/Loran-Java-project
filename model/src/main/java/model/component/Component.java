package model.component;

import java.awt.Image;
import java.util.ArrayList;

import model.dao.SpriteReader;

public abstract class Component implements IComponent {
	private final boolean LORANN_PERMEABILITY;
	private final boolean DEMON_PERMEABILITY;

	private ICoordinate coordinate;
	private ArrayList<Image> sprites;
	/**
	 * 
	 * @param path
	 * @param lorannPermeability
	 * @param demonPermeability
	 * @param coordinate
	 */
	public Component(String path, boolean lorannPermeability, boolean demonPermeability, ICoordinate coordinate) {
		this.LORANN_PERMEABILITY = lorannPermeability;
		this.DEMON_PERMEABILITY = demonPermeability;
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
	public boolean isLORANN_PERMEABLE() {
		return LORANN_PERMEABILITY;
	}
	/**
	 * 
	 * @return sprites
	 */
	protected ArrayList<Image> getSprites() {
		return sprites;
	}
	/**
	 * @return DEMON_PERMEABILITY
	 */
	public boolean isDEMON_PERMEABLE() {
		return DEMON_PERMEABILITY;
	}
}
