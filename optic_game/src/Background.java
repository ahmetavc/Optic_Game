import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Background extends JPanel implements MouseListener, ActionListener {

	private final static int width = 80;
	private final static int height = 80;
	private int x;
	private int y;
	private static BoxMatris matris;
	private LevelOne level1;
	public  static Source source;
	private static Target target;
	private static Obstacle obs,obs2;
	public static LevelList levelList = new LevelList();
	static BottomOfGame1 bottom;
	public static LightRay ray1;
	public static boolean drawable = true;
	static boolean isHitted;
	static JButton butt;
	
	public Background(){
		
		matris = new BoxMatris();
		bottom = new BottomOfGame1();
		
		creation();
		
		isHitted = false;
		
		setSize(1600,800);
		
		butt = new JButton("OK");
		
		this.addMouseListener(this);
		
	}
	
	public static void creation()
	{
		
		
		source = new Source( LevelList.levels.get(LevelList.levelNum).getSourceX(), LevelList.levels.get(LevelList.levelNum).getSourceY());
		detect(LevelList.levels.get(LevelList.levelNum).getSourceX(), LevelList.levels.get(LevelList.levelNum).getSourceY()).setObj(source);
			
		target = new Target( LevelList.levels.get(LevelList.levelNum).getTargetX(), LevelList.levels.get(LevelList.levelNum).getTargetY());
		detect(LevelList.levels.get(LevelList.levelNum).getTargetX(), LevelList.levels.get(LevelList.levelNum).getTargetY()).setObj(target);
		
		obs = new Obstacle(LevelList.levels.get(LevelList.levelNum).getObsX(), LevelList.levels.get(LevelList.levelNum).getObsY());
		detect(LevelList.levels.get(LevelList.levelNum).getObsX(), LevelList.levels.get(LevelList.levelNum).getObsY()).setObj(obs);
		
		obs2 = new Obstacle(LevelList.levels.get(LevelList.levelNum).getObs2X(), LevelList.levels.get(LevelList.levelNum).getObs2Y());
		detect(LevelList.levels.get(LevelList.levelNum).getObs2X(), LevelList.levels.get(LevelList.levelNum).getObs2Y()).setObj(obs);
		
		Light.clean();
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		
		//drawing boxes 20x10
		for(int i = 0; i < 20  ; i++)
	    {
	      for(int j = 0; j < 10; j++)
	      {
	        g.drawRect(width*i,height*j,width,height);
	       
	      }
	    }
		 setBackground(Color.white);
		 
		source.draw(source.getX(), source.getY(), g);
		target.draw(target.getX(), target.getY(), g);
		obs.draw(obs.getX(), obs.getY(), g);
		obs2.draw(obs2.getX(), obs2.getY(), g);
		
		find(g);
		
		LightDraw(g);
		
		if(isHitted ){
			
			LevelList.levelNum = LevelList.levelNum + 1;
			
			if( LevelList.levelNum < 3 )
			{
				
				TopOfGame.l1.setText("                                                                                                                                                                                  LEVEL " + (LevelList.levelNum + 1) );

				deleteAll();
				
				bottom.x.clearSelection();
				
				bottom.j1.setEnabled(true);
				bottom.j2.setEnabled(true);
				bottom.j3.setEnabled(true);
				bottom.j4.setEnabled(true);
				bottom.j5.setEnabled(true);
				bottom.j6.setEnabled(true);
				bottom.j7.setEnabled(true);
				bottom.j8.setEnabled(true);
				
				creation();
				
			}
			else 
			{
				
				
				TopOfGame.l1.setText("                                                                                                                                                                                  THE GAME IS FINISHED "  );

				
			}	
			isHitted = false;
			
		}
		
		repaint();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
		if(e.getButton() == e.BUTTON1){
			
			x = e.getX();
			y = e.getY();
			setObject(x,y);
			
		}
		
		if(e.getButton() == e.BUTTON3){
			
			x = e.getX();
			y = e.getY();
			
			Objects obj5 = deleteObject(x,y);
			
			if( obj5 instanceof PlaneMirror && obj5.getAngle() == 0){
				
				bottom.j1.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 45){
				
				bottom.j2.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 90){
	
				bottom.j3.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 135){
				
				bottom.j4.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 180){
				
				bottom.j5.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 225){
				
				bottom.j6.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 270){
	
				bottom.j7.setEnabled(true);
				
			}
			else if( obj5 instanceof PlaneMirror && obj5.getAngle() == 315){
				
				bottom.j8.setEnabled(true);
				
			}
			
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	//x is light's angle, y is objects's angle
	
	
	//it will detect which box selected 
	public static Box detect(int firstCoor, int secondCoor){
		
		int boxX = firstCoor / width;
		int boxY = secondCoor / height;
		if( boxX >= 0 && boxX < 20 && boxY >= 0 && boxY < 10){
			
			return matris.boxMatris[boxX][boxY];
			
		}
		else{
			
			return null;
		}
	
	}
	
	public static void deleteAll(){
		
		for(int i = 0; i < 20; i++){
			
			for(int j = 0; j < 10; j++){
				
				
				if(matris.boxMatris[i][j].getStatus()){
					
					if(matris.boxMatris[i][j].getObj() instanceof PlaneMirror){
						
						matris.boxMatris[i][j].deleteObj();
								
					}
					else{
						
						matris.boxMatris[i][j].deleteMain();
						
					}
					
				}
				
				
				
			}
			
		}
		
	}
	
	
     public void setObject(int firstCoor, int secondCoor){
		
		Box box = detect(firstCoor, secondCoor);
		PlaneMirror mir;
		

		Light.clean();
		
		if(!box.getStatus() && bottom.j1.isSelected()){
			
			mir = new PlaneMirror(0);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j1.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j2.isSelected()){
			
			mir = new PlaneMirror(45);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j2.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j3.isSelected()){
			
			mir = new PlaneMirror(90);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j3.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j4.isSelected()){
			
			mir = new PlaneMirror(135);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j4.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j5.isSelected()){
			
			mir = new PlaneMirror(180);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j5.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j6.isSelected()){
			
			mir = new PlaneMirror(225);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j6.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j7.isSelected()){
			
			mir = new PlaneMirror(270);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j7.setEnabled(false);
			
		}
		else if(!box.getStatus() && bottom.j8.isSelected()){
			
			mir = new PlaneMirror(315);
			box.setObj(mir);
			
			bottom.x.clearSelection();
			
			bottom.j8.setEnabled(false);
			
		}
		
	}
	
	//it will return object which is from selected box
	public Objects getObject(int firstCoor, int secondCoor){
		
		Box box;
		
		box = detect(firstCoor, secondCoor);
		
		
		if(box == null){
			
			return null;
		}
		else{
			
			return box.getObj();
			
		}
		
	}
	
	public Objects deleteObject(int firstCoor, int secondCoor){
		
		Light.clean();

		Box box;
		
		box = detect(firstCoor, secondCoor);
		
		return box.deleteObj();
		
	}
	
	//drawing images by controlling  box matris
	public void find(Graphics g){
		
		for(int i = 0; i < 20; i++){
			
			for(int j = 0; j < 10; j++){
				
				if( matris.boxMatris[i][j].getStatus() && !(matris.boxMatris[i][j].getObj() instanceof Source) 
						&& !(matris.boxMatris[i][j].getObj() instanceof Target) && !(matris.boxMatris[i][j].getObj() instanceof Obstacle)){
					
						if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 0){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() -40 , matris.boxMatris[i][j].getY(), g);
						
						}
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 45){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() , matris.boxMatris[i][j].getY(), g);
							
						}
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 90){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() , matris.boxMatris[i][j].getY() -40, g);
							
						}
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 135){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() , matris.boxMatris[i][j].getY(), g);
							
						}
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 180){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() - 40 , matris.boxMatris[i][j].getY(), g);
							
						}
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 225){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() , matris.boxMatris[i][j].getY(), g);
							
						}
 
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 270){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() - 8 , matris.boxMatris[i][j].getY() -40, g);
							
						}	
						else if( matris.boxMatris[i][j].getObj() instanceof PlaneMirror &&  matris.boxMatris[i][j].getObj().getAngle() == 315){

							matris.boxMatris[i][j].getObj().draw(matris.boxMatris[i][j].getX() , matris.boxMatris[i][j].getY(), g);
							
						}
							
					}
					
				}
				
			}
		}
	
	public LightRay reflect(LightRay ray, Box boxx){
		
		LightRay ry = ray;
		int realObj = boxx.getObj().getAngle() + 270;
		int angx = 0;
		
		if(realObj >= 360){
			
			realObj = realObj - 360;
			
		}
		
		if(boxx.getObj() instanceof Source ){
			
			ry.setFirstX(source.getX());
			ry.setSecondY(source.getY());
			return ry;
			
		}
		else if( boxx.getObj() instanceof Obstacle){
			
			ry.setSecondX(obs.getX());
			ry.setSecondY(obs.getY());
			return ry;
			
		}
		else if(boxx.getObj() instanceof Target){
			
			ry.setSecondX(target.getX());
			ry.setSecondY(target.getY());
			return ry;
			
		}
		else{
			
			if( Math.abs( realObj - ray.getAng()) <= 45 ){
				
				drawable = true;
				angx = (2 * boxx.getObj().getAngle() - ry.getAng() );
				ry.setFirstX(boxx.getX());
				ry.setFirstY(boxx.getY());
				if (angx < 0 ){
					
					angx = angx + 360;
					
				}
				else if(angx >= 360){
					
					angx = angx - 360;
					
				}
				
				ry.setAng(angx);
				
				return ry;
				
			}
			else if( boxx.getObj().getAngle() == 45 && ( ray.getAng() == 0 || ray.getAng() == 270 || ray.getAng() == 315 )){
				
			    angx = (2 * boxx.getObj().getAngle() - ry.getAng() );
				ry.setFirstX(boxx.getX());
				ry.setFirstY(boxx.getY());
				if (angx < 0 ){
					
					angx = angx + 360;
					
				}
				else if(angx == 360){
					
					angx = 0;
					
				}
				
				ry.setAng(angx);
				
				return ry;
				
			}
			else if( boxx.getObj().getAngle() == 90 && ( ray.getAng() == 0 || ray.getAng() == 45 || ray.getAng() == 315 )){
				
				angx = (2 * boxx.getObj().getAngle() - ry.getAng() );
				ry.setFirstX(boxx.getX());
				ry.setFirstY(boxx.getY());
				if (angx < 0 ){
					
					angx = angx + 360;
					
				}
				else if(angx == 360){
					
					angx = 0;
					
				}
				
				ry.setAng(angx);
				
				return ry;
				
			}
			
			else{
				
				drawable = false;
				ry.setSecondX(boxx.getX());
				ry.setSecondY(boxx.getY());
				return ry;
				
			}
			
		}
		
	}
	
	public void LightDraw(Graphics g)
	{
		
		if(drawable){
			
			 if( !check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng()).getStatus() ){
					
				 Box b1 = check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
					
					if( ray1.getAng() == 0){
						
						ray1.setSecondX(b1.getX());
						ray1.setSecondY(1600);
						
					}
					else if( ray1.getAng() == 45){
						
						ray1.setSecondX(b1.getX());
						ray1.setSecondY(b1.getY());
						
					}
					else if( ray1.getAng() == 90){
						
						ray1.setSecondX(b1.getX());
						ray1.setSecondY(0);
						
					}
					else if( ray1.getAng() == 135){
						
						ray1.setSecondX(b1.getX());
						ray1.setSecondY(b1.getY());
						
					}
					else if( ray1.getAng() == 180){
						
						ray1.setSecondX(0);
						ray1.setSecondY(b1.getY());
						
					}
					else if( ray1.getAng() == 225){
						
						ray1.setSecondX(b1.getX());
						ray1.setSecondY(b1.getY());
						
					}
					else if( ray1.getAng() == 270){
						
						ray1.setSecondX(b1.getY());
						ray1.setSecondY(1600);
						
					}
					else if( ray1.getAng() == 315){
						
						ray1.setSecondX(b1.getX());
						ray1.setSecondY(b1.getY());
						
					}	
					
					LightRay r2 = new LightRay(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
					r2.setSecondX(b1.getX());
					r2.setSecondY(b1.getY());
					
					Light.lights.add(r2);
					drawable = false;
					
			}
			else if( check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng()).getObj() instanceof PlaneMirror){
				
				Box b1 = check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				
				
				ray1.setSecondX(b1.getX());
				ray1.setSecondY(b1.getY());
				
				
				LightRay r4 = new LightRay(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				r4.setSecondX(b1.getX());
				r4.setSecondY(b1.getY());
				
				Light.lights.add(r4);

				ray1 = reflect(ray1, b1);
			
			}
			
			else if( check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng()).getObj() instanceof Obstacle){
				
				Box b1 = check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				
				ray1.setSecondX(b1.getX());
				ray1.setSecondY(b1.getY());
				
				System.out.println("vurum");
				LightRay r5 = new LightRay(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				r5.setSecondX(b1.getX());
				r5.setSecondY(b1.getY());
				
				Light.lights.add(r5);
				drawable = false;
				
			}
			else if( check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng()).getObj() instanceof Target){

				Box b1 = check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
			
				ray1.setSecondX(b1.getX());
				ray1.setSecondY(b1.getY());
				
				LightRay r6 = new LightRay(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				r6.setSecondX(b1.getX());
				r6.setSecondY(b1.getY());
				
				Light.lights.add(r6);
				drawable = false;

				isHitted = true;
				
			
			}
			else if( check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng()).getObj() instanceof Source){
				
				Box b1 = check(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				
				ray1.setSecondX(b1.getX());
				ray1.setSecondY(b1.getY());
				
				LightRay r7 = new LightRay(ray1.getFirstX(), ray1.getFirstY() , ray1.getAng());
				r7.setSecondX(b1.getX());
				r7.setSecondY(b1.getY());
				
				Light.lights.add(r7);
				drawable = false;
	
			}
			 
		}
		
		Light.iterateDraw(g);
		
	}
	
	public Box check(int x, int y, int ang){
		
		Box bx = null;
		int i = 0;
		
		if(ang == 0){
			
			for(i = x + 41; i < 1600; i = i + 80){
				
				if( detect(i,y).getStatus()){
					
					return detect(i,y);
					
				}
				
				bx = detect(i, y);
				
			}
			
			if(bx == null){
				
				return new Box( 1600, y);
				
			}
		
			return new Box( bx.getX() + 40, bx.getY());
			
		}
		else if(ang == 45){
			
			int a = x + 42;
			int b = y - 42;
			
			while( a < 1600 && b > 0){
				
				
				if( detect(a,b).getStatus()){
					
					return detect(a,b);
					
				}
				bx = detect( a , b);
				a = a + 80;
				b = b - 80;
				
			}
			if(bx == null){
				
				return new Box( x + 40, y + 40);
				
			}
		
			return new Box(bx.getX() + 40, bx.getY() - 40);
			
		}
		else if(ang == 90){
			
			for(i = y - 41; i > 0; i = i - 80){
				
				if( detect(x,i).getStatus()){
					
					return detect(x,i);
					
				}
				
				bx = detect(x,i);
				
			}
			if(bx == null){
				
				return new Box( x, 800);
				
			}
			return new Box( bx.getX(), bx.getY() - 40);
			
		}
		else if(ang == 135){
			
			int a = x - 42;
			int b = y - 42;
			
			while( a > 0 && b > 0){
				
				
				if( detect(a,b).getStatus()){
					
					return detect(a,b);
					
				}
				bx = detect( a , b);
				a = a - 80;
				b = b - 80;
				
			}
			if(bx == null){
				
				return new Box( x - 40, y - 40);
				
			}
		
			return new Box(bx.getX() - 40, bx.getY() - 40);
			
		}
		else if(ang == 180){
			
			for(i = x - 41; i > 0 ; i = i - 80){
				
				if( detect(i,y).getStatus()){
					
					return detect(i,y);
					
				}
				
				bx = detect(i, y);
				
			}
			
			if(bx == null){
				
				return new Box( 0, y);
				
			}
		
			return new Box( bx.getX() - 40, bx.getY());
		}
		else if(ang == 225){
			
			int a = x - 42;
			int b = y + 42;
			
			while( a > 0 && b < 800){
				
				
				if( detect(a,b).getStatus()){
					
					return detect(a,b);
					
				}
				bx = detect( a , b);
				a = a - 80;
				b = b + 80;
				
			}
			if(bx == null){
				
				return new Box( x - 40, y + 40);
				
			}
		
			return new Box(bx.getX() - 40, bx.getY() + 40);
			
		}
		
		else if(ang == 270){
			
			for(i = y + 41; i < 800; i = i + 80){
				
				if( detect(x,i).getStatus()){
					
					return detect(x,i);
					
				}
				
				bx = detect(x,i);
				
			}
			if(bx == null){
				
				return new Box( x, 800);
				
			}
			
			return new Box( bx.getX(), bx.getY() + 40);
			
		}
		else if(ang == 315){
			
			int a = x + 42;
			int b = y + 42;
			
			while( a < 1600 && b < 800){
				
				
				if( detect(a,b).getStatus()){
					
					return detect(a,b);
					
				}
				bx = detect( a , b);
				a = a + 80;
				b = b + 80;
				
			}
			if(bx == null){
				
				return new Box( x + 40, y + 40);
				
			}
		
			return new Box(bx.getX() + 40, bx.getY() + 40 );
			
		}
		
		return null;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		
	}
	
}