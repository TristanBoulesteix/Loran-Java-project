package main;

import controller.Controller;
import model.Model;

/**
 * <h1>The Class Main.</h1>
 *
 * @author BOULESTEIX Tristan, MAITRE Maxime, AZZOUZI Zacharia, KARDOUS Jean Pierre
 * 
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {
		//Instantiate new model
		final Model model = new Model();
		//Instantiate new controller
		final Controller controller = new Controller(model);
		//Run the game
		controller.play();
	}

}
