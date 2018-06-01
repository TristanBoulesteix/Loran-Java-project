package model.component;

public class Spell extends Touch implements Kill {
	private final static String PATH = "Pictures/spell";

	public Spell(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, Direction.UP);
	}

	@Override
	public void kill(Component target) {
		if (target instanceof Demon) {
			Demon character = (Demon) target;
			character.kill();
		}
	}

}
