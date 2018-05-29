package model.component;

public class Spell extends Touch implements Kill {
	private final static String PATH = "";

	public Spell(boolean permeability, Coordinate coordinate, boolean available) {
		super(PATH, permeability, coordinate, available);
	}

	@Override
	public void actionWhenContactHappend() {

	}

	@Override
	public void kill() {

	}

}
