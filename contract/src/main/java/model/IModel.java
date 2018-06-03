package model;

import java.sql.SQLException;

import model.component.Direction;
import model.component.IComponent;
import model.component.ICoordinate;
import model.component.IGate;
import model.component.ILorann;
import model.component.ISpell;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {
	/**
	 * 
	 * @return IComponent
	 */
	public IComponent[][] getMap();

	/**
	 * Generate the map which is an array of two dimensions of <b>Component</b>.
	 * 
	 * @param idMap
	 *            the id of the level
	 * @throws SQLException
	 */
	public void generateMap(int idMap) throws SQLException;

	/**
	 * 
	 * @return ILorann
	 */
	public ILorann getLorann();

	/**
	 * 
	 * @return IGate
	 */
	public IGate getGate();

	/**
	 * 
	 * 
	 * @param coordinate
	 *            of the spell
	 * @param direction
	 *            the current direction of the spell
	 * 
	 * @return ISpell the spell
	 */
	public ISpell getSpell(ICoordinate coordinate, Direction direction);

	/**
	 * Reinitialize the spell to null value
	 */
	public void setSpellToNull();
}
