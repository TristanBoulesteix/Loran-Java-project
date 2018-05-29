package model;

import java.sql.SQLException;

import model.component.Component;
import model.dao.DTBReader;

public class Model {
	Component[][] components;

	public Model() {
		components = new Component[12][20];
	}

	public Component[][] getMap() {
		return components;
	}

	private String readMap(int idMap) throws SQLException {
		return DTBReader.ReturnMap(idMap);
	}

	public void generateMap() {

	}
}
