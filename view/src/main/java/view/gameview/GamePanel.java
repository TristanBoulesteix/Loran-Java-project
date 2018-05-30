package view.gameview;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Model;
import model.component.Component;
import model.component.Direction;


public class GamePanel extends JPanel{
	private JLabel[][] labels;
	private Model model;

	
public GamePanel(Model model) {
	setLayout(new GridBagLayout());
}
	
void gameview() {
	
}
	
public void updateMap(Component[][] components) {
	
	for(int x = 0; x < components.length; x++)

	{	
	for(int y = 0; y < components[x].length; y++)

	{
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = x;
		constraints.gridx = y;
		JLabel label = new JLabel(new ImageIcon(components[x][y].getImage(Direction.DOWN)));
		this.add(label, constraints);
	}
	}
}

private void addListener() {
	
}

}