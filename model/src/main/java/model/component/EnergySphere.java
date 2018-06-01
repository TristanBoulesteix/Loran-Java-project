package model.component;

public class EnergySphere extends Touch {
	private final static String PATH = "Pictures/energySphere";

	public EnergySphere(boolean lorannPermeability, boolean demonPermeability, Coordinate coordinate,
			boolean available) {
		super(PATH, lorannPermeability, demonPermeability, coordinate, available, Direction.UP);
	}

	@Override
	public void actionWhenContactHappend() {
		super.actionWhenContactHappend();

	}

}
