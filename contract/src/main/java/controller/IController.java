package controller;

import java.sql.SQLException;
import java.util.Observable;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {
	
	public Controller(Model model);

	public void play();

	private void initializeGame();

	public synchronized void moveComponent(Component component, Direction direction);

	public void update(Observable arg0, Object arg1);

	public Model getModel();

	public GameFrame getGameFrame();

	public int getScore();

	public void setScore(int score);

	public boolean isVictory();

	public void setVictory(boolean victory);
}


