package view.levelselector;
import javax.swing.JOptionPane;

public class LevelSelector {

	private int level;
	private static String[] LEVEL_LIST;
	


public LevelSelector() {

	
}

public int getLevel() {
	  String[] LEVEL_LIST = {"Map 1", "Map 2", "Map 3", "Map 4"};
	    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane(), jop3 = new JOptionPane(), jop4 = new JOptionPane();
	    String nom = (String)jop.showInputDialog(null, 
	      "Choose a Map !",
	      "Loran-MapSelector",
	      JOptionPane.QUESTION_MESSAGE, null,LEVEL_LIST,Map[2], LEVEL_LIST[3], LEVEL_LIST[4]);
}

}
