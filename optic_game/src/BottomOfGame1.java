import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class BottomOfGame1 extends JPanel {

	public static JButton b1;
	public static JLabel l1,l2,l3, l4, l5, l6, l7, l8,l9;
	public static JRadioButton j1, j2, j3, j4, j5, j6, j7, j8;
	public static ButtonGroup x;
	public static ImageIcon image1, image2, image3, image4, image5, image6, image7, image8, image9;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public BottomOfGame1(){
		
		super();
		
		setLayout(new GridBagLayout());
		
		x = new ButtonGroup();
		setBackground(Color.white);
		b1 = new JButton("Tutorial");	
		b1.setPreferredSize(new Dimension(100, 80));
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(b1,gbc);
		
		create();
		
	}
	
	public void create(){
		
		b1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 

				  ImageIcon icon = new ImageIcon("tutorial.png");
				  
				  if(LevelList.levelNum == 0){
					  
					  UIManager.put("OptionPane.messageFont", new FontUIResource(
							  new Font("Verdana", Font.BOLD, 20) ) );
					  
					  
					  UIManager.put("OptionPane.minimumSize",new Dimension(470,500)); 
					  
				      JOptionPane.showMessageDialog(null,"A plane mirror is a mirror with a flat (planar) reflective surface." + "\n " +
				    		  	" For light rays striking a plane mirror, the angle of reflection equals " + "\n " 
				    		  	+ "the angle of incidence.The angle of incidence is the angle between the" + "\n " 
				    		  	+ " incident ray and the surface normal (an imaginary line perpendicular to the surface)." + "\n " 
				    		  	+ " Therefore the angle of reflection is the angle between the reflected ray and the normal " + "\n " 
				    		  	+ "and a collima ted beam of light does not spread out after reflection from a plane " + "\n " 
				    		  	+ "mirror, except for diffraction effects.",
				      		"TUTORIAL", JOptionPane.INFORMATION_MESSAGE, icon);
					  
					  
				  }
				  else if(LevelList.levelNum == 1){
					  
					  UIManager.put("OptionPane.messageFont", new FontUIResource(
							  new Font("Verdana", Font.BOLD, 20) ) );
					  
					  
					  UIManager.put("OptionPane.minimumSize",new Dimension(470,500)); 
					  
				      JOptionPane.showMessageDialog(null, "In the case of plane mirrors, the image is said to be a virtual image.\n"
				      		+ " Virtual images are images that are formed in locations where light\n "
				      		+ "does not actually reach. Light does not actually pass through the \n"
				      		+ "location on the other side of the mirror; it only appears to an observer\n"
				      		+ " as though the light is coming from this location. Whenever a mirror \n"
				      		+ "(whether a plane mirror or otherwise) creates an image that is virtual,\n"
				      		+ " it will be located behind the mirror where light does not really come from.\n"
				      		+ " Later in this unit, we will study instances in which real images are formed \n"
				      		+ "by curved mirrors. Such images are formed on the same side of the mirror as the\n"
				      		+ " object and light passes through the actual image location.", "About", JOptionPane.INFORMATION_MESSAGE, icon);
					  
				  }
				  else if(LevelList.levelNum == 2){
					  
				      JOptionPane.showMessageDialog(null, "Blah blah blah 2", "About", JOptionPane.INFORMATION_MESSAGE, icon);
					  
				  }
				  
				  
			  } 
			  
			} );
		
		
		j1 = new JRadioButton("PlaneMirror 0°");

		gbc.gridx = 4;
		gbc.gridy = 2;
		add(j1,gbc);
		
		j2 = new JRadioButton("PlaneMirror 45°");
		
		gbc.gridx = 5;
		gbc.gridy = 2;
		add(j2,gbc);
		
		j3 = new JRadioButton("PlaneMirror 90°");
		
		gbc.gridx = 6;
		gbc.gridy = 2;
		add(j3,gbc);
		
		j4 = new JRadioButton("PlaneMirror 135°");
		
		gbc.gridx = 7;
		gbc.gridy = 2;
		add(j4,gbc);
		
		x.add(j1);
		x.add(j2);
		x.add(j3);
		x.add(j4);
		
		j5 = new JRadioButton("PlaneMirror 180°");

		gbc.gridx = 8;
		gbc.gridy = 2;
		add(j5,gbc);
		
		j6 = new JRadioButton("PlaneMirror 225°");
		
		gbc.gridx = 9;
		gbc.gridy = 2;
		add(j6,gbc);
		
		j7 = new JRadioButton("PlaneMirror 270°");
		
		gbc.gridx = 10;
		gbc.gridy = 2;
		add(j7,gbc);
		
		j8 = new JRadioButton("PlaneMirror 315°");
		
		gbc.gridx = 11;
		gbc.gridy = 2;
		add(j8,gbc);
		
		x.add(j1);
		x.add(j2);
		x.add(j3);
		x.add(j4);
		x.add(j5);
		x.add(j6);
		x.add(j7);
		x.add(j8);
		
		image1 = new ImageIcon(getClass().getResource("0derecep.png"));
		l1 = new JLabel(image1);
		
		gbc.gridx = 4;
		gbc.gridy = 0;
		add(l1,gbc);
		
		image2 = new ImageIcon(getClass().getResource("45derece.png"));
		l2 = new JLabel(image2);
		
		gbc.gridx = 5;
		gbc.gridy = 0;
		add(l2,gbc);
		
		image3 = new ImageIcon(getClass().getResource("90derecep.png"));
		l3 = new JLabel(image3);
		
		gbc.gridx = 6;
		gbc.gridy = 0;
		add(l3,gbc);
		
		image4 = new ImageIcon(getClass().getResource("135derece.png"));
		l4 = new JLabel(image4);
		
		gbc.gridx = 7;
		gbc.gridy = 0;
		add(l4,gbc);
		
		image5 = new ImageIcon(getClass().getResource("180derecep.png"));
		l5 = new JLabel(image5);
		
		gbc.gridx = 8;
		gbc.gridy = 0;
		add(l5,gbc);
		
		image6 = new ImageIcon(getClass().getResource("225derece.png"));
		l6 = new JLabel(image6);
		
		gbc.gridx = 9;
		gbc.gridy = 0;
		add(l6,gbc);
		
		image7 = new ImageIcon(getClass().getResource("270derecep.png"));
		l7 = new JLabel(image7);
		
		gbc.gridx = 10;
		gbc.gridy = 0;
		add(l7,gbc);
		
		image8 = new ImageIcon(getClass().getResource("315derece.png"));
		l8 = new JLabel(image8);
		
		gbc.gridx = 11;
		gbc.gridy = 0;
		add(l8,gbc);
		
		image9 = new ImageIcon(getClass().getResource("og.png"));
		  l9 = new JLabel(image9);
		  
		  gbc.gridx = 12;
		  gbc.gridy = 0;
		  add(l9,gbc);
		  
		  
		
		repaint();
		
		
	}
}
