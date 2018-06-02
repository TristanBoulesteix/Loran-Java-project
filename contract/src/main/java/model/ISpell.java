package model;

import model.component.IComponent;

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
