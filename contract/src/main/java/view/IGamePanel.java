package view;

import model.component.IComponent;
/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public interface IGamePanel {
	/**
	 * 
	 * @param components
	 */
	public void updateMap(IComponent[][] components);
}
