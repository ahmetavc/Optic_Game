import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class PlayPanel extends JPanel {
	
	JPanel panel;
	JPanel panel2;
	JPanel panel3;

	public PlayPanel(){
		
		this.setLayout(new BorderLayout());

		try {
		      for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		          if ("Nimbus".equals(info.getName())) {
		              UIManager.setLookAndFeel(info.getClassName());
		              break;
		          }
		      }
		  } catch (Exception e) {
		    
		  }
		
		JPanel panel = new Background();
		JPanel panel2 = new TopOfGame();
		JPanel panel3 = new BottomOfGame1();
		
		this.setVisible(true);
		
		this.add(panel,BorderLayout.CENTER);
		this.add(panel2,BorderLayout.PAGE_START);
		this.add(panel3,BorderLayout.PAGE_END);
		
	}
	
}
