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

	public void moveComponent(IComponent component, Direction direction);

	public IModel getModel();

	public IGameFrame getGameFrame();

	public int getScore();

	public void setScore(int score);

	public boolean isVictory();

	public void setVictory(boolean victory);
}
