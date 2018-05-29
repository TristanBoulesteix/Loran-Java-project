package model.component;

public class Treasure extends Touch {
	private final static String PATH = "";
	private final static int VALUE = 1;

	public Treasure(boolean permeability, Coordinate coordinate, boolean available) {
		super(PATH, permeability, coordinate, available);
	}

	@Override
	public void actionWhenContactHappend() {

	}

	public static int getValue() {
		return VALUE;
	}

}
