package controller;

import java.awt.Component;
import java.util.Observable;

import com.sun.javafx.scene.traversal.Direction;

import model.IModel;
import view.IView;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {
	public void play();

	public synchronized void moveComponent(Component component, Direction direction);

	public void update(Observable arg0, Object arg1);

	public IModel getModel();

	public IView getGameFrame();

	public int getScore();

	public void setScore(int score);

	public boolean isVictory();

	public void setVictory(boolean victory);
}
