package model;

import java.sql.SQLException;

import model.component.Component;
import model.component.ComponentFactory;
import model.component.Lorann;
import model.dao.DTBReader;

public class Model {
	private Component[][] components;
	private Lorann lorann;

	public Model() {
		components = new Component[12][20];
	}

	public synchronized Component[][] getMap() {
		return components;
	}

	private String getMapFromDTB(int idMap) throws SQLException {
		return DTBReader.ReturnMap(idMap);
	}

	public void generateMap(int idMap) throws SQLException {
		String map = getMapFromDTB(idMap);
		components = ComponentFactory.buildComponentsFromMap(map);
		lorann = ComponentFactory.getLorann();
	}

	public Lorann getLorann() {
		return lorann;
	}
}
