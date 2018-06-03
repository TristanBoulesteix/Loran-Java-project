package controller;

import model.IModel;
import model.component.Direction;
import model.component.IComponent;
import view.IGameFrame;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {

	public void play();

	/**
	 * 
	 * @param component
	 * @param direction
	 */
	public void moveComponent(IComponent component, Direction direction);

	/**
	 * 
	 * @param order
	 *            The order Lorann has to execute
	 */
	public void setAction(Order order);

	/**
	 * 
	 * @return Imodel
	 */
	public IModel getModel();

	/**
	 * 
	 * @return IGameFrame
	 */
	public IGameFrame getGameFrame();

	/**
	 * 
	 * @return int
	 */
	public int getScore();

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score);

	/**
	 * 
	 * @return boolean
	 */
	public boolean isVictory();

	/**
	 * 
	 * @param victory
	 */
	public void setVictory(boolean victory);

	/**
	 * 
	 * @param component
	 */
	public void removeComponent(IComponent component);
}
