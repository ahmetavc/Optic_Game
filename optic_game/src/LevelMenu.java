
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.FontUIResource;

public class LevelMenu extends JPanel
{

	private JButton level1 = new JButton( "level1");
	private JButton level2 = new JButton( "level2");
	private JButton level3 = new JButton( "level3");

	public LevelMenu()
	{
		setBorder( new MatteBorder( 1, 1, 1, 1, (Color) new Color( 0, 0, 0)));
		setPreferredSize( new Dimension(1607, 992));
		setBackground( Color.WHITE);
		setLayout( null);

		level1.setBounds( 714, 143, 201, 75);
		add( level1);

		level2.setBounds( 714, 323, 201, 75);
		add( level2);

		level3.setBounds( 714, 508, 201, 94);
		add( level3);
		
		level1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 

				  LevelList.levelNum = 0;
				  
				  
				  
			  } 
			  
			} );

	}

	public JButton getLevelButton1()
	{
		return level1;
	}

	public JButton getLevelButton2()
	{
		return level2;
	}

	public JButton getLevelButton3()
	{
		return level3;
	}
}

