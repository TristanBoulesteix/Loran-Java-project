package model;

import java.sql.SQLException;

import model.component.Component;
import model.component.ComponentFactory;
import model.component.Gate;
import model.component.IComponent;
import model.component.Lorann;
import model.dao.DTBReader;

public class Model implements IModel {
	private IComponent[][] components;
	private Lorann lorann;
	private Gate gate;

	public Model() {
		components = new Component[12][20];
	}

	public synchronized IComponent[][] getMap() {
		return components;
	}

	private String getMapFromDTB(int idMap) throws SQLException {
		return DTBReader.ReturnMap(idMap);
	}

	public void generateMap(int idMap) throws SQLException {
		String map = getMapFromDTB(idMap);
		components = ComponentFactory.buildComponentsFromMap(map);
		lorann = ComponentFactory.getLorann();
		gate = ComponentFactory.getGate();
	}

	public Lorann getLorann() {
		return lorann;
	}

	public Gate getGate() {
		return gate;
	}
}
