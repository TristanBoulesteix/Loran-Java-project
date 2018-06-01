package model.component;

import javax.swing.JOptionPane;

import controller.Order;

public enum Direction {
	UP, UPRIGHT, UPLEFT, RIGHT, LEFT, DOWN, DOWNRIGHT, DOWNLEFT;

	public static Direction getDirectionFromOrder(Order order) {
		switch (order) {
		case DOWN:
			return Direction.DOWN;

		case DOWNLEFT:
			return Direction.DOWNLEFT;

		case DOWNRIGHT:
			return Direction.DOWNRIGHT;

		case LEFT:
			return Direction.LEFT;

		case RIGHT:
			return Direction.RIGHT;

		case UP:
			return Direction.UP;

		case UPLEFT:
			return Direction.UPLEFT;

		case UPRIGHT:
			return Direction.UPRIGHT;

		default:
			if (order.equals(Order.FIRE)) {
				JOptionPane.showMessageDialog(null, "Critical error !\nAn error occured", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			return null;
		}
	}

	public static Direction getOpositeDirection(Direction direction) {
		switch (direction) {
		case DOWN:
			return UP;

		case DOWNLEFT:
			return UPRIGHT;

		case DOWNRIGHT:
			return UPLEFT;

		case LEFT:
			return RIGHT;

		case RIGHT:
			return LEFT;

		case UP:
			return DOWN;

		case UPLEFT:
			return DOWNRIGHT;

		case UPRIGHT:
			return DOWNLEFT;

		default:
			JOptionPane.showMessageDialog(null, "Critical error !\nAn error occured", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
}
