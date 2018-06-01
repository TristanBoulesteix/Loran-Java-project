package model.component;

public class Treasure extends Touch {
	private final static String PATH = "Pictures/treasure";
	private final static int VALUE = 10;

	public Treasure(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available);
	}

	public int getValue() {
		return VALUE;
	}

}
