

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


public class PlayLevelPanel extends JPanel
{

	JPanel panel1 = new TopOfGame();
	JPanel panel2 = new Background();
	JPanel panel3 = new BottomOfGame1();

	public PlayLevelPanel()
	{
		
		try {
		      for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		          if ("Nimbus".equals(info.getName())) {
		              UIManager.setLookAndFeel(info.getClassName());
		              break;
		          }
		      }
		  } catch (Exception e) {
		    
		  }

		setLayout( new BorderLayout());

		setVisible( true);

		add( panel1, BorderLayout.PAGE_START);
		add( panel2, BorderLayout.CENTER);
		add( panel3, BorderLayout.PAGE_END);

	}

	public JButton getLevelMenuButt()
	{
		return ((TopOfGame) panel1).getButtonB();
		}
}
