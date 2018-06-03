package model.component;

/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean
 *         Pierre
 *
 */
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