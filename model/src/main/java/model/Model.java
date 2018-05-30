package model;

import java.sql.SQLException;

import model.component.Component;
import model.component.ComponentFactory;
import model.dao.DTBReader;

public class Model {
	Component[][] components;

	public Model() {
		components = new Component[12][20];
	}

	public Component[][] getMap() {
		return components;
	}

	private String getMapFromDTB(int idMap) throws SQLException {
		return DTBReader.ReturnMap(idMap);
	}

	public void generateMap(int idMap) throws SQLException {
		String map = getMapFromDTB(idMap);
		components = ComponentFactory.buildComponentsFromMap(map);
	}

	// private Component[][] generateOriginalMap(Component[][] components) {
	// Component[][] map = new Component[12][20];
	//
	// for (int i = 0; i < components.length; i++) {
	// for (int j = 0; j < components[i].length; j++) {
	// Component element = components[i][j];
	//
	// if ((element instanceof Lorann) || (element instanceof Arrbarr) || (element
	// instanceof Cargyv)
	// || (element instanceof Maarcg) || (element instanceof Kyracj)) {
	// map[i][j] = null;
	// } else {
	// map[i][j] = element;
	// }
	// }
	// }
	//
	// return map;
	// }
}
