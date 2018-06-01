package model.component;

import javax.swing.JOptionPane;

import controller.Order;

public enum Direction {
	UP, UPRIGHT, UPLEFT, RIGHT, LEFT, DOWN, DOWNRIGHT, DOWNLEFT;
/**
 * 
 * @param order
 * @return
 */
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
}
