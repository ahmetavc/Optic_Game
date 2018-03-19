

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class TutorialPanel extends JPanel
{
	private TopOfGame topPanel2 = new TopOfGame();

	public TutorialPanel()
	{
		setLayout( new BorderLayout());

		topPanel2.setBorder( new MatteBorder( 0, 1, 1, 1, (Color) new Color( 0, 0, 0)));

		add( topPanel2, BorderLayout.NORTH);

	}

	public JButton getHomeMenuButt2()
	{
		return topPanel2.b1;
	}

}
