package model.component;

public class Spell extends Touch implements Kill {
	private final static String PATH = "Pictures/spell";

	public Spell(boolean permeability, Coordinate coordinate, boolean available) {
		super(PATH, permeability, coordinate, available);
	}

	@Override
	public void kill(Component target) {
		if (target instanceof Demon) {
			Demon character = (Demon) target;
		}
	}

}
