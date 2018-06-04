package model.component;
/**
 * 
 * <h1>The Coordinate class.</h1>
 * Coordinates use by component
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Coordinate implements ICoordinate {
	private int x;
	private int y;
	/**
	 * Constructor of Coordinate.
	 * @param x
	 * The X.
	 * @param y
	 * The Y.
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Second constructor of Coordinate.
	 * @param coordinate
	 * The coordinate.
	 */
	public Coordinate(ICoordinate coordinate) {
		this.x = coordinate.getX();
		this.y = coordinate.getY();
	}
	/**
	 * @return x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param int x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param int y
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		String toReturn;

		toReturn = "x = " + x;
		toReturn = toReturn + " y = " + y;
		return toReturn;
	}

}
