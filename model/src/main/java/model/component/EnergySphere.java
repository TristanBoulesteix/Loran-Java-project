package model.component;
/**
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class EnergySphere extends Touch {
	private final static String PATH = "Pictures/energySphere";
/**
 * Constructor of energy sphere.
 * 
 * @param lorannPermeability
 * The Lorann Permeability.
 * @param demonPermeability
 * The Demon Permeability.
 * @param coordinate
 * The coordinate.
 * @param available
 * The availability.
 */
	public EnergySphere(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate,
			boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, Direction.UP);
	}

	@Override
	public void actionWhenContactHappend() {
		super.actionWhenContactHappend();

	}

}
