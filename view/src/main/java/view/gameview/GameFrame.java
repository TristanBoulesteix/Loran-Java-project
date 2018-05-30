package view.gameview;

import java.awt.Color;

import javax.swing.JFrame;

import model.Model;
import model.component.Component;

public class GameFrame extends JFrame{

	private GamePanel panel;
	private Model model;
	
public GameFrame(Model model) {
	
	panel=new GamePanel(model);
	this.setTitle("Lorann");
	this.setSize(1000, 800);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	this.setContentPane(panel);
    this.setVisible(true);
    this.setResizable(false);
}
	
public void initializeMapComponent(Component[][] components) {
	panel.updateMap(components);
}

public GamePanel getPanel() {
	return panel;
}

	
}


