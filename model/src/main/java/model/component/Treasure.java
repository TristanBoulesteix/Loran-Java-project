package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Treasure extends Touch {
	private final static String PATH = "Pictures/treasure";
	private final static int VALUE = 10;
/**
 * 
 * @param lorannPermeability
 * @param demonPermeability
 * @param coordinate
 * @param available
 */
	public Treasure(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate, boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, Direction.UP);
	}
/**
 * 
 * @return Value
 */
	public int getValue() {
		return VALUE;
	}

}
