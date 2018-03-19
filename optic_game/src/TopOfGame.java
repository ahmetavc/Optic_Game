import java.awt.*;

import javax.swing.*;


public class TopOfGame extends JPanel {

	JButton b1 = new JButton();
	static JLabel l1;
	
	public TopOfGame(){
		
		super();
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		b1.setText("Back to Level Menu");
		
		b1.setPreferredSize(new Dimension(200, 20));
		add(b1);
		
		l1 = new JLabel("                                                                                                                                                                                  LEVEL 1" );
		add(l1);
		 setBackground(Color.GREEN);
		
	}
	public JButton getButtonB()
	{
		return b1;
	}
}
