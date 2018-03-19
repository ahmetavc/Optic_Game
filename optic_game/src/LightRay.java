import java.awt.*;

public class LightRay {

	// there are 8 type of light according to its direction
	private int angle;
	private int firstX;
	private int firstY;
	private int secondX;
	private int secondY;
	
	
	public LightRay(int x, int y, int angle){
		
		firstX = x;
		firstY = y;
		this.angle = angle ;
	}
	
	public void draw(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(6));
	  	g2.setColor(Color.GREEN);
	  	g2.drawLine(firstX, firstY, secondX, secondY);
	}
	
	public int getAng(){
		
		return angle;
		
	}
	
	public void setAng(int x){
		
		angle = x;
		
	}
	
	public int getFirstX(){
		
		return firstX;
		
	}
	
	public int getFirstY(){
		
		return firstY;
		
	}

	public int getSecondX(){
	
		return secondX;
	
	}

	public int getSecondY(){
	
		return secondY;
	
	}
	
	public void setFirstX(int k){
		
		firstX = k;
		
	}
	public void setFirstY(int k){
		
		firstY = k;
		
	}

	public void setSecondX(int k){
	
		secondX = k;
	
	}

	public void setSecondY(int k){
	
		secondY = k;
	
	}
	
}















