package model.component;

public class ComponentFactory {
	public static Lorann createLorann(Coordinate coordinate) {
		return new Lorann(false, coordinate);
	}

	public static Spell createSpell(Coordinate coordinate) {
		return new Spell(false, coordinate, false);
	}

	public static Kyracj createKyacj(Coordinate coordinate) {
		return new Kyracj(false, coordinate);
	}

	public static Maarcg createMarrcg(Coordinate coordinate) {
		return new Maarcg(false, coordinate);
	}

	public static Arrbarr createArrbarr(Coordinate coordinate) {
		return new Arrbarr(false, coordinate);
	}

	public static Cargyv createCargyv(Coordinate coordinate) {
		return new Cargyv(false, coordinate);
	}

	public static Treasure createTreasure(Coordinate coordinate) {
		return new Treasure(true, coordinate, true);
	}

	public static EnergySphere createEnergySphere(Coordinate coordinate) {
		return new EnergySphere(true, coordinate, true);
	}

	public static Gate createGate(Coordinate coordinate) {
		return new Gate(true, coordinate, false);
	}

	public static CornerSet createCornerSet(Coordinate coordinate) {
		return new CornerSet(coordinate);
	}

	public static HorizontalSet createHorizontalSet(Coordinate coordinate) {
		return new HorizontalSet(coordinate);
	}

	public static VerticalSet createVerticalSet(Coordinate coordinate) {
		return new VerticalSet(coordinate);
	}
}
