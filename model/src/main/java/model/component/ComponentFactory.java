package model.component;

public abstract class ComponentFactory {
	public static Component[][] buildComponentsFromMap(String map) {
		Component[][] components = new Component[12][20];
		int index = 0;

		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 12; y++) {
				switch (map.charAt(index)) {
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
					components[x][y] = null;
					break;

				case 'P':
					components[x][y] = createLorann(new Coordinate(x, y));
					break;

				case 'O':
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
					components[x][y] = createGate(new Coordinate(x, y));
					break;

				default:
					components[x][y] = null;
					break;
				}
			}
		}

		return components;
	}

	private static Lorann createLorann(Coordinate coordinate) {
		return new Lorann(false, coordinate);
	}

	private static Spell createSpell(Coordinate coordinate) {
		return new Spell(false, coordinate, false);
	}

	private static Kyracj createKyacj(Coordinate coordinate) {
		return new Kyracj(false, coordinate);
	}

	private static Maarcg createMarrcg(Coordinate coordinate) {
		return new Maarcg(false, coordinate);
	}

	private static Arrbarr createArrbarr(Coordinate coordinate) {
		return new Arrbarr(false, coordinate);
	}

	private static Cargyv createCargyv(Coordinate coordinate) {
		return new Cargyv(false, coordinate);
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
}
