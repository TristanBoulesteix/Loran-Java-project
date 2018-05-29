package model;

import java.sql.SQLException;

import model.component.Arrbarr;
import model.component.Cargyv;
import model.component.Component;
import model.component.ComponentFactory;
import model.component.Kyracj;
import model.component.Lorann;
import model.component.Maarcg;
import model.dao.DTBReader;

public class Model {
	Component[][] components;
	Component[][] originalMap; // A map to keep a save of our the original position of the components

	public Model() {
		components = new Component[12][20];
		originalMap = new Component[12][20];
	}

	public Component[][] getMap() {
		return components;
	}

	public Component[][] getOriginalMap() {
		return originalMap;
	}

	private String getMapFromDTB(int idMap) throws SQLException {
		return DTBReader.ReturnMap(idMap);
	}

	public void generateMap(int idMap) throws SQLException {
		String map = getMapFromDTB(idMap);
		components = ComponentFactory.buildComponentsFromMap(map);
		originalMap = generateOriginalMap(components);
	}

	private Component[][] generateOriginalMap(Component[][] components) {
		Component[][] map = new Component[12][20];

		for (int i = 0; i < components.length; i++) {
			for (int j = 0; j < components[i].length; j++) {
				Component element = components[i][j];

				if ((element instanceof Lorann) || (element instanceof Arrbarr) || (element instanceof Cargyv)
						|| (element instanceof Maarcg) || (element instanceof Kyracj)) {
					map[i][j] = null;
				} else {
					map[i][j] = element;
				}
			}
		}

		return map;
	}
}
