package model;

import model.component.IComponent;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public interface ISpell {
	/**
	 * 
	 * @return {@link IComponent} the component targeted
	 */
	public IComponent getTarget();

	/**
	 * 
	 * 
	 * @param target
	 */
	public void setTarget(IComponent target);
}
