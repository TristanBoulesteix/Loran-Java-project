package view;

import model.component.IComponent;

public interface IGamePanel {
	/**
	 * 
	 * @param components
	 */
	public void updateMap(IComponent[][] components);
}
