package model.component;

public abstract class ComponentFactory {
	private static Lorann lorann;
	private static Gate gate;

	public static Component[][] buildComponentsFromMap(String map) {
		Component[][] components = new Component[12][20];

		char[] charArray = map.toCharArray();

		int index = 0;

		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 20; y++, index++) {

				switch (charArray[index]) {
				case 'C':
					components[x][y] = createCornerSet(new Coordinate(x, y));
					break;

				case 'H':
					components[x][y] = createHorizontalSet(new Coordinate(x, y));
					break;

				case 'V':
					components[x][y] = createVerticalSet(new Coordinate(x, y));
					break;

				case ' ':
					components[x][y] = createEmpty(new Coordinate(x, y));
					break;

				case 'P':
					lorann = createLorann(new Coordinate(x, y));
					components[x][y] = getLorann();
					break;

				case 'L':
					components[x][y] = createEnergySphere(new Coordinate(x, y));
					break;

				case 'T':
					components[x][y] = createTreasure(new Coordinate(x, y));
					break;

				case '1':
					components[x][y] = createCargyv(new Coordinate(x, y));
					break;

				case '2':
					components[x][y] = createArrbarr(new Coordinate(x, y));
					break;

				case '3':
					components[x][y] = createKyacj(new Coordinate(x, y));
					break;

				case '4':
					components[x][y] = createMarrcg(new Coordinate(x, y));
					break;

				case 'G':
					gate = createGate(new Coordinate(x, y));
					components[x][y] = gate;
					break;

				default:
					components[x][y] = components[x][y] = createEmpty(new Coordinate(x, y));
					break;
				}
			}
		}

		return components;
	}

	private static Lorann createLorann(Coordinate coordinate) {
		return new Lorann(true, coordinate);
	}

	public static Spell createSpell(Coordinate coordinate) {
		return new Spell(true, coordinate, false);
	}

	private static Kyracj createKyacj(Coordinate coordinate) {
		return new Kyracj(true, coordinate);
	}

	private static Maarcg createMarrcg(Coordinate coordinate) {
		return new Maarcg(true, coordinate);
	}

	private static Arrbarr createArrbarr(Coordinate coordinate) {
		return new Arrbarr(true, coordinate);
	}

	private static Cargyv createCargyv(Coordinate coordinate) {
		return new Cargyv(true, coordinate);
	}

	private static Treasure createTreasure(Coordinate coordinate) {
		return new Treasure(true, coordinate, true);
	}

	private static EnergySphere createEnergySphere(Coordinate coordinate) {
		return new EnergySphere(true, coordinate, true);
	}

	private static Gate createGate(Coordinate coordinate) {
		return new Gate(true, coordinate, false);
	}

	private static CornerSet createCornerSet(Coordinate coordinate) {
		return new CornerSet(coordinate);
	}

	private static HorizontalSet createHorizontalSet(Coordinate coordinate) {
		return new HorizontalSet(coordinate);
	}

	private static VerticalSet createVerticalSet(Coordinate coordinate) {
		return new VerticalSet(coordinate);
	}

	private static Empty createEmpty(Coordinate coordinate) {
		return new Empty(true, coordinate);
	}

	public static Lorann getLorann() {
		return lorann;
	}

	public static Gate getGate() {
		return gate;
	}
}
