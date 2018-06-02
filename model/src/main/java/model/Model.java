package model;

import java.sql.SQLException;

import model.component.Component;
import model.component.ComponentFactory;
import model.component.Coordinate;
import model.component.Direction;
import model.component.Gate;
import model.component.IComponent;
import model.component.ICoordinate;
import model.component.Lorann;
import model.component.Spell;
import model.dao.DTBReader;

public class Model implements IModel {
	private IComponent[][] components;
	private Lorann lorann;
	private Gate gate;
	private Spell spell;

	public Model() {
		components = new Component[12][20];//
	}

	public synchronized IComponent[][] getMap() {
		return components;// Creation of a Map
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
		return lorann;// Creation of an Lorann
	}

	public Gate getGate() {
		return gate;// Creation of a Gate
	}

	@Override
	public ISpell getSpell(ICoordinate coordinate, Direction direction) {
		if (spell == null) {
			spell = ComponentFactory.createSpell((Coordinate) coordinate, direction);
			return spell;
		} else {
			return spell;
		}
	}

	@Override
	public void setSpellToNull() {
		spell = null;
	}
}
