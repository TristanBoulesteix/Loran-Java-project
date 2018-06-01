package model.component;
/**
 * Coordinates use by component
 * 
 * @author BOULSTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 *
 */
public class Coordinate implements ICoordinate {
	private int x;
	private int y;
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 * @param coordinate
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
