package model.component;

public interface ILorann {

	/**
	 * 
	 * @return boolean
	 */
	public boolean launchSpell();

	/**
	 * 
	 * @return boolean
	 */
	public boolean isAlive();

	/**
	 * 
	 */
	public void kill();

	/**
	 * 
	 * @return true if the spell is launched
	 */
	public boolean isSpellLaunched();

	/**
	 * 
	 * 
	 * @param spellLaunched
	 */
	public void setSpellLaunched(boolean spellLaunched);
}
