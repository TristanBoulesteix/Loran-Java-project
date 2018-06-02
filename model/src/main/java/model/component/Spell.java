package model.component;

/**
 * 
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean
 *         Pierre
 *
 */
public class Spell extends Touch implements Kill {
	private final static String PATH = "Pictures/spell";

	private IComponent target;

	/**
	 * 
	 * @param lorannPermeability
	 * @param demonPermeability
	 * @param coordinate
	 * @param available
	 */
	public Spell(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, Direction.UP);

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

	public IComponent getTarget() {
		return target;
	}

	public void setTarget(IComponent target) {
		this.target = target;
	}

}
