package model.component;

/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean
 *         Pierre
 *
 */
public interface ISpell extends IComponent {
	/**
	 * Operation call to get a Target
	 * @return {@link IComponent} 
	 * The component targeted.
	 */
	public IComponent getTarget();

	/**
	 * Operation call to set the target.
	 * 
	 * @param target
	 * The component targeted.
	 */
	public void setTarget(IComponent target);
}