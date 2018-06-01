package view;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IGameFrame {
	/**
	 * 
	 * @return IGamePanel
	 */
	public IGamePanel getPanel();
	
	/**
	 * 
	 */
	public void dispose();
}
