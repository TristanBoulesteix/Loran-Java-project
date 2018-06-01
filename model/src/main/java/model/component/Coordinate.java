package model.component;

public class Coordinate implements ICoordinate {
	private int x;
	private int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Coordinate(ICoordinate coordinate) {
		this.x = coordinate.getX();
		this.y = coordinate.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

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
