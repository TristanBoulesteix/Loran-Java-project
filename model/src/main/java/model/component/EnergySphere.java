package model.component;

public class EnergySphere extends Touch {
	private final static String PATH = "/src/main/ressources/Pictures/energySphere";

	public EnergySphere(boolean permeability, Coordinate coordinate, boolean available) {
		super(PATH, permeability, coordinate, available);
	}

	@Override
	public void actionWhenContactHappend() {
		super.actionWhenContactHappend();

	}

}
