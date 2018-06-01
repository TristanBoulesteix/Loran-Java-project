package model.component;

import java.awt.Image;

public interface IComponent {
	/**
	 * 
	 * @return ICoordinate
	 */
	public ICoordinate getCoordinate();
	/**
	 * 
	 * @param direction
	 * @return Image
	 */
	public Image getImage(Direction direction);
	
	/**
	 * 
	 * @param coordinate
	 */
	public void setCoordinate(ICoordinate coordinate);
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean isLORANN_PERMEABLE();

	/**
	 * 
	 * @return boolean
	 */
	public boolean isDEMON_PERMEABLE();

}
