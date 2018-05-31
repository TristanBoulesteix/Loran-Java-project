package model;

import java.sql.SQLException;
import java.util.List;

import model.component.Component;
import model.component.ComponentFactory;
import model.component.Gate;
import model.component.Lorann;
import model.dao.DTBReader;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	public Model();

	public synchronized Component[][] getMap();

	private String getMapFromDTB(int idMap) throws SQLException;

	public void generateMap(int idMap) throws SQLException;

	public Lorann getLorann();

	public Gate getGate();
}
