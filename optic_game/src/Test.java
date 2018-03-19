import java.awt.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
public class Test extends JFrame {

	static boolean run = true;
	public Test(){
	 
		super();
		
		setLayout(new BorderLayout());
		
	}
	
	public static void main(String[] args) {
		 
		 
		JFrame frame = new Test();
		JPanel panel = new PlayPanel();
		
		frame.setSize(1607,992);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(panel);
		
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
	
	}

}