package model.component;

import java.util.concurrent.CopyOnWriteArrayList;

public abstract class ComponentFactory {
	private static Lorann lorann;
	private static Gate gate;
	private static CopyOnWriteArrayList<Demon> demons;

	/**
	 * 
	 * @param map
	 * @return Component[][]
	 */
	public static Component[][] buildComponentsFromMap(String map) {
		Component[][] components = new Component[12][20];
		demons = new CopyOnWriteArrayList<Demon>();

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
					demons.add((Demon) components[x][y]);

					break;

				case '2':
					components[x][y] = createArrbarr(new Coordinate(x, y));
					demons.add((Demon) components[x][y]);
					break;

				case '3':
					components[x][y] = createKyacj(new Coordinate(x, y));
					demons.add((Demon) components[x][y]);
					break;

				case '4':
					components[x][y] = createMarrcg(new Coordinate(x, y));
					demons.add((Demon) components[x][y]);
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

	/**
	 * Build new Lorann
	 * 
	 * @param coordinate
	 * @return Lorann
	 */
	private static Lorann createLorann(Coordinate coordinate) {
		return new Lorann(true, true, coordinate, Direction.UP);
	}

	/**
	 * Build new Spell
	 * 
	 * @param coordinate
	 * @return Spell
	 */
	public static Spell createSpell(Coordinate coordinate) {
		return new Spell(true, true, coordinate, false);
	}

	/**
	 * Build new Kyracj
	 * 
	 * @param coordinate
	 * @return Kyracj
	 */
	private static Kyracj createKyacj(Coordinate coordinate) {
		return new Kyracj(true, false, coordinate, Direction.UP);
	}

	/**
	 * Build new Maarcg
	 * 
	 * @param coordinate
	 * @return Maarcg
	 */
	private static Maarcg createMarrcg(Coordinate coordinate) {
		return new Maarcg(true, false, coordinate, Direction.UP);
	}

	/**
	 * Build new Arrbarr
	 * 
	 * @param coordinate
	 * @return Arrbarr
	 */
	private static Arrbarr createArrbarr(Coordinate coordinate) {
		return new Arrbarr(true, false, coordinate, Direction.UP);
	}

	/**
	 * Build new Cargyv
	 * 
	 * @param coordinate
	 * @return Cargyv
	 */
	private static Cargyv createCargyv(Coordinate coordinate) {
		return new Cargyv(true, false, coordinate, Direction.UP);
	}

	/**
	 * Build new Treasure
	 * 
	 * @param coordinate
	 * @return Treasure
	 */
	private static Treasure createTreasure(Coordinate coordinate) {
		return new Treasure(true, false, coordinate, true);
	}

	/**
	 * Build new EnergySphere
	 * 
	 * @param coordinate
	 * @return EnergySphere
	 */
	private static EnergySphere createEnergySphere(Coordinate coordinate) {
		return new EnergySphere(true, false, coordinate, true);
	}

	/**
	 * Build new Gate
	 * 
	 * @param coordinate
	 * @return Gate
	 */
	private static Gate createGate(Coordinate coordinate) {
		return new Gate(true, false, coordinate, false);
	}

	/**
	 * Build new CornerSet
	 * 
	 * @param coordinate
	 * @return CornerSet
	 */
	private static CornerSet createCornerSet(Coordinate coordinate) {
		return new CornerSet(coordinate);
	}

	/**
	 * Build new HorizontalSet
	 * 
	 * @param coordinate
	 * @return HorizontalSet
	 */
	private static HorizontalSet createHorizontalSet(Coordinate coordinate) {
		return new HorizontalSet(coordinate);
	}

	/**
	 * Build new VerticalSet
	 * 
	 * @param coordinate
	 * @return VerticalSet
	 */
	private static VerticalSet createVerticalSet(Coordinate coordinate) {
		return new VerticalSet(coordinate);
	}

	/**
	 * Build new Empty
	 * 
	 * @param coordinate
	 * @return Empty
	 */
	private static Empty createEmpty(Coordinate coordinate) {
		return new Empty(coordinate);
	}

	/**
	 * Get Lorann
	 * 
	 * @return Lorann
	 */
	public static Lorann getLorann() {
		return lorann;
	}

	/**
	 * Get Gate
	 * 
	 * @return gate
	 */
	public static Gate getGate() {
		return gate;
	}

	/**
	 * Get Demons
	 * 
	 * @return demons
	 */
	public static CopyOnWriteArrayList<Demon> getDemons() {
		return demons;
	}

	/**
	 * Set Demons
	 * 
	 * @param demons
	 */
	public static void setDemons(CopyOnWriteArrayList<Demon> demons) {
		ComponentFactory.demons = demons;
	}
}
