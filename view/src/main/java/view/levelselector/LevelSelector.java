package view.levelselector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LevelSelector {

	private int level;
	private static String[] LEVEL_LIST;
	


public LevelSelector() {

	
}

public int getLevel() {
	  String[] LEVEL_LIST = {"Map 1", "Map 2", "Map 3", "Map 4"};
	    String nom = (String)JOptionPane.showInputDialog(null, "Choose a Map!", "Lorann-MapSelector",JOptionPane.OK_CANCEL_OPTION);
		
	    if (nom.equals(null)) {
	    	System.exit(0);
		}
	    switch (nom) {
		case "Map 1":
			return 1;
			
		case "Map 2":
			return 2;
			
		case "Map 3":
			return 3;
			
		case "Map 4":
			return 4;
			
		case "Map 5":
			return 5;
			

		default:
			
			final JPanel panel = new JPanel();
			 JOptionPane.showMessageDialog(panel, "Invalid choice !", "Error", JOptionPane.ERROR_MESSAGE);
			 return 1;
		}
}

}
