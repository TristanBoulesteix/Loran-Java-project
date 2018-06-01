package model;

import java.sql.SQLException;

import model.component.IComponent;
import model.component.IGate;
import model.component.ILorann;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {
	public IComponent[][] getMap();

	public void generateMap(int idMap) throws SQLException;

	public ILorann getLorann();

	public IGate getGate();
}
