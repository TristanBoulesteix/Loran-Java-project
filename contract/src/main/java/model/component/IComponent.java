package model.component;

import java.awt.Image;

public interface IComponent {
	/**
	 * 
	 * @return
	 */
	public ICoordinate getCoordinate();
	/**
	 * 
	 * @param direction
	 * @return
	 */
	public Image getImage(Direction direction);
	
	/**
	 * 
	 * @param coordinate
	 */
	public void setCoordinate(ICoordinate coordinate);
	
	/**
	 * 
	 * @return
	 */
	public boolean isLORANN_PERMEABLE();

	/**
	 * 
	 * @return
	 */
	public boolean isDEMON_PERMEABLE();

}
