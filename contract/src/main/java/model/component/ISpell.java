package model.component;

public interface ISpell extends IComponent {
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
