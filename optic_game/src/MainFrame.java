

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener
{
	JPanel panel = new JPanel();

	MainMenu menu = new MainMenu();
	LevelPanel levelPan = new LevelPanel();
	TutorialPanel tutorialPan = new TutorialPanel();

	PlayLevelPanel playPan = new PlayLevelPanel();
	

	CardLayout layout = new CardLayout();

	public MainFrame()
	{
		panel.setLayout( layout);

		setPanel();

		setSize( 1616,1000);
		// setResizable( false);
		setLocationRelativeTo( null);
		setVisible( true);
		setTitle( "My Menu");
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		requestFocus();
	}

	public void setPanel()
	{

		playPan.getLevelMenuButt().addActionListener( this);

		tutorialPan.getHomeMenuButt2().addActionListener( this);
		menu.getPlayButton().addActionListener( this);
		menu.getTutorialButton().addActionListener( this);
		menu.getQuitButton().addActionListener( this);

		panel.add( playPan, "Play Panel");

		panel.add( tutorialPan, "tutorial");
		levelPan.getHomeMenuButt().addActionListener( this);
		levelPan.getButtonLevel1().addActionListener( this);
		levelPan.getButtonLevel2().addActionListener( this);
		levelPan.getButtonLevel3().addActionListener( this);
		
		panel.add( levelPan, "Level Panel");
		panel.add( menu, "Menu");

		getContentPane().add( panel);
		layout.show( panel, "Menu");
	}

	@Override
	public void actionPerformed( ActionEvent e)
	{
		Object source = e.getSource();

		if( source == menu.getQuitButton())
		{
			System.exit( 0);
		}
		else if( source == menu.getPlayButton())
		{
			layout.show( panel, "Level Panel");
		}
		else if( source == menu.getTutorialButton())
		{
			layout.show( panel, "tutorial");
		}
		else if( source == tutorialPan.getHomeMenuButt2())
		{
			layout.show( panel, "Menu");
		}
		else if( source == levelPan.getHomeMenuButt())
		{
			layout.show( panel, "Menu");
		}
		else if( source == levelPan.getButtonLevel1())
		{
			Background.deleteAll();
			LevelList.levelNum = 0;
			TopOfGame.l1.setText("                                                                                                                                                                                  LEVEL " + (LevelList.levelNum + 1) );

			
			Background.creation();
			
			Background.bottom.x.clearSelection();
			
			Background.bottom.j1.setEnabled(true);
			Background.bottom.j2.setEnabled(true);
			Background.bottom.j3.setEnabled(true);
			Background.bottom.j4.setEnabled(true);
			Background.bottom.j5.setEnabled(true);
			Background.bottom.j6.setEnabled(true);
			Background.bottom.j7.setEnabled(true);
			Background.bottom.j8.setEnabled(true);
			
			
			layout.show( panel, "Play Panel");
		}
		else if( source == levelPan.getButtonLevel2())
		{
			Background.deleteAll();
			LevelList.levelNum = 1;
			TopOfGame.l1.setText("                                                                                                                                                                                  LEVEL " + (LevelList.levelNum + 1) );

			
			Background.creation();
			
			Background.bottom.x.clearSelection();
			
			Background.bottom.j1.setEnabled(true);
			Background.bottom.j2.setEnabled(true);
			Background.bottom.j3.setEnabled(true);
			Background.bottom.j4.setEnabled(true);
			Background.bottom.j5.setEnabled(true);
			Background.bottom.j6.setEnabled(true);
			Background.bottom.j7.setEnabled(true);
			Background.bottom.j8.setEnabled(true);
			
			layout.show( panel, "Play Panel");
		}
		else if( source == levelPan.getButtonLevel3())
		{
			Background.deleteAll();
			LevelList.levelNum = 2;
			TopOfGame.l1.setText("                                                                                                                                                                                  LEVEL " + (LevelList.levelNum + 1) );

			
			Background.creation();
			
			Background.bottom.x.clearSelection();
			
			Background.bottom.j1.setEnabled(true);
			Background.bottom.j2.setEnabled(true);
			Background.bottom.j3.setEnabled(true);
			Background.bottom.j4.setEnabled(true);
			Background.bottom.j5.setEnabled(true);
			Background.bottom.j6.setEnabled(true);
			Background.bottom.j7.setEnabled(true);
			Background.bottom.j8.setEnabled(true);
			
			layout.show( panel, "Play Panel");

		}
	
		else if( source == playPan.getLevelMenuButt())
		{
			
			layout.show(panel, "Level Panel");
			
		}
		
	}

	public static void main( String[] args)
	{
		new MainFrame();

	}

}
