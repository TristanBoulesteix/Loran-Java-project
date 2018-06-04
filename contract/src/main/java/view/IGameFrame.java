package view;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre

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
