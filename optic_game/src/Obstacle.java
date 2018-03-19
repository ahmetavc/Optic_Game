import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Obstacle extends Objects {

	private int x;
	private int y;

	public BufferedImage img;
	
	public Obstacle(int x, int y){
		
		this.x = x;
		this.y = y;
		
		try {
			img = ImageIO.read(getClass().getResourceAsStream("/obstacle.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public int getX() {

		return x;
	}

	@Override
	public int getY() {

		return y;
	}

	@Override
	public int getAngle() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	public void draw(int a, int b, Graphics g){
		
		g.drawImage(img, a, b, null);
		
	}

}
