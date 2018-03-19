

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class OptionPanel extends JPanel
{
	private JButton homeButton = new JButton(" Main Menu");

	public OptionPanel()
	{
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setPreferredSize( new Dimension(500,75));
		setBackground( new Color(255, 255, 153));
		setLayout(null);
		
		homeButton.setBounds(22, 24, 82, 20);
		add(homeButton);
	}
	public JButton getOptionButton()
	{
		return homeButton;
	}

}
