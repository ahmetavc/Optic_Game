
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;


public class LevelPanel extends JPanel
{

	private TopOfGame topPanel1 = new TopOfGame();
	private OptionPanel optPan = new OptionPanel();
	private LevelMenu levelPanel = new LevelMenu();

	public LevelPanel()
	{
		setLayout( new BorderLayout());

		topPanel1.setBorder( new MatteBorder( 0, 1, 1, 1, (Color) new Color( 0, 0, 0)));
		optPan.getOptionButton().setBounds( 24, 11, 145, 40);
		optPan.setBackground( new Color( 0, 255, 127));

		add( optPan, BorderLayout.NORTH);
		levelPanel.getLevelButton1().setLocation( 673, 128);
		levelPanel.getLevelButton2().setLocation( 673, 365);
		levelPanel.getLevelButton3().addActionListener( new LevelPanelLevelButton3ActionListener());
		levelPanel.getLevelButton3().setLocation( 673, 612);
		levelPanel.getLevelButton1().setSize( 261, 125);
		levelPanel.getLevelButton2().setSize( 261, 125);
		levelPanel.getLevelButton3().setSize( 261, 125);
		levelPanel.getLevelButton1().setForeground( new Color( 0, 0, 0));
		levelPanel.getLevelButton3().setBackground( new Color( 0, 255, 127));
		levelPanel.getLevelButton2().setBackground( new Color( 0, 255, 127));
		levelPanel.getLevelButton1().setBackground( new Color( 0, 255, 127));
		add( levelPanel, BorderLayout.EAST);

	}

	public JButton getHomeMenuButt()
	{
		return optPan.getOptionButton();
	}

	public JButton getButtonLevel1()
	{
		return levelPanel.getLevelButton1();
	}

	public JButton getButtonLevel2()
	{
		return levelPanel.getLevelButton2();
	}
	public JButton getButtonLevel3()
	{
		return levelPanel.getLevelButton3();
	}

	private class LevelPanelLevelButton3ActionListener implements ActionListener
	{
		public void actionPerformed( ActionEvent e)
		{
		}
	}
}
