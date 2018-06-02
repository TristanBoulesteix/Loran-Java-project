package model.component;

import java.awt.Image;

/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean
 *         Pierre
 *
 */
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

	/**
	 * 
	 * @return direction the Direction
	 */
	public Direction getDirection();

	/**
	 * set the Direction
	 * 
	 * @param Direction
	 * 
	 */
	public void setDirection(Direction direction);

}
