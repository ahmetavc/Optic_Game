

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class MainMenu extends JPanel
{

	private JPanel playMenu;

	private JButton playButton = new JButton( " Play ");
	private JButton tutorial = new JButton( " Tutorial ");
	// private JButton helpButton = new JButton( " Help ");
	private JButton quitButton = new JButton( " Quit ");
	private JLabel txtWelcomeToOptic = new JLabel();
	private JButton btnHelp;
	private ImageIcon image1, image2;
	private JLabel l1, l2;

	public MainMenu()
	{
		// setBounds(0, 140, 93, -140);
		setBorder( new LineBorder( new Color( 0, 0, 0)));
		setBackground( Color.WHITE);
		setPreferredSize( new Dimension(1607, 992));

		// playButton = new JButton(" Play ");

		playButton.setForeground( new Color( 0, 0, 0));
		playButton.setFont( new Font( "Tw Cen MT", Font.BOLD, 31));
		playButton.setBackground( new Color( 0, 255, 127));
		playButton.setBounds( 708, 290, 182, 67);

		// tutorial = new JButton(" Tutorial ");
		// tutorial.setAction(action);
		tutorial.setForeground( new Color( 0, 0, 0));
		tutorial.setBackground( new Color( 0, 255, 127));
		tutorial.setFont( new Font( "Tw Cen MT", Font.BOLD, 31));
		tutorial.setBounds( 708, 437, 182, 67);

		// quitButton = new JButton(" Quit ");
		quitButton.setFont( new Font( "Tw Cen MT", Font.BOLD, 31));
		quitButton.setBackground( new Color( 0, 255, 127));
		quitButton.setForeground( new Color( 0, 0, 0));
		quitButton.setBounds( 708, 733, 182, 67);

		setLayout( null);

		image1 = new ImageIcon(getClass().getResource("og1.png"));
		l1 = new JLabel(image1);
		l1.setSize(600, 600);
		l1.setLocation(940, 170);
		add(l1);
		
		image2 = new ImageIcon(getClass().getResource("og1.png"));
		l2 = new JLabel(image1);
		l2.setSize(600, 600);
		l2.setLocation(70, 170);
		add(l2);
		
		add( playButton);
		add( tutorial);
		add( quitButton);
		txtWelcomeToOptic.setBackground( new Color( 0, 255, 127));
		txtWelcomeToOptic.setFont( new Font( "Yu Gothic UI Semibold", Font.BOLD, 31));

		txtWelcomeToOptic.setText( "   \r\n           OPTIC GAME");
		Font font = new Font("Verdana", Font.PLAIN,70);
		txtWelcomeToOptic.setFont(font);
		txtWelcomeToOptic.setBounds( 242, 38, 951, 121);
		add( txtWelcomeToOptic);
		

		btnHelp = new JButton( "Help");
		btnHelp.addActionListener( new BtnHelpActionListener());
		btnHelp.setForeground( Color.BLACK);
		btnHelp.setFont( new Font( "Tw Cen MT", Font.BOLD, 31));
		btnHelp.setBackground( new Color( 0, 255, 127));
		btnHelp.setBounds( 708, 588, 182, 67);
		add( btnHelp);

	}

	public JButton getPlayButton()
	{
		return playButton;
	}

	public JButton getTutorialButton()
	{
		return tutorial;
	}

	public JButton getQuitButton()
	{
		return quitButton;
	}

	public void removePanel()
	{
		removeAll();
	}

	private class BtnHelpActionListener implements ActionListener
	{
		public void actionPerformed( ActionEvent e)
		{
		}
	}
}
