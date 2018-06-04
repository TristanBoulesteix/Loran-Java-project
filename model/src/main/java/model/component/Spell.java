package model.component;

import java.awt.Image;
import java.util.ArrayList;

/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean
 *         Pierre
 *
 */
public class Spell extends Touch implements ISpell, Kill {
	private final static String PATH = "Pictures/spell";

	private IComponent target;

	/**
	 * Constructor of spell.
	 * 
	 * @param lorannPermeability
	 * The Lorann Permeability.
	 * 
	 * @param demonPermeability
	 * The demon Permeability.
	 * 
	 * @param coordinate
	 * The coordinate.
	 * 
	 * @param available
	 * The availability.
	 * 
	 */
	public Spell(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available,
			Direction direction) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, direction);

		setTarget(null);
	}

	@Override
	public void kill(Component target) {
		if (target instanceof Demon) {
			Demon character = (Demon) target;
			character.kill();
		}
	}

	@Override
	public void actionWhenContactHappend() {
		super.actionWhenContactHappend();

		if (target instanceof Lorann) {
			Lorann lorann = (Lorann) target;
			lorann.setSpellLaunched(false);

		} else if (target instanceof Demon) {
			Demon demon = (Demon) target;
			demon.kill();
		}
	}

	@Override
	public IComponent getTarget() {
		return target;
	}

	@Override
	public void setTarget(IComponent target) {
		this.target = target;
	}

	@Override
	public Image getImage(Direction direction) {
		int random = (int) (Math.random() * (getSprites().size() - 1));
		return getSprites().get(random);
	}
}
