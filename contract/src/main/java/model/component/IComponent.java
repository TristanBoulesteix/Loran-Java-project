package model.component;

import java.awt.Image;

public interface IComponent {
	public ICoordinate getCoordinate();

	public Image getImage(Direction direction);

	public void setCoordinate(ICoordinate coordinate);

	public boolean isLORANN_PERMEABLE();

	public boolean isDEMON_PERMEABLE();

}
