package view;

import model.component.IComponent;
/**
 * <h1>The interface IGamePanel.</h1>
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public interface IGamePanel {
	/**
	 * Operation call to update the Map.
	 * @param components
	 * The updated Map.
	 */
	public void updateMap(IComponent[][] components);
}
