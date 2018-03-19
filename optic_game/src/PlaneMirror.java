import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PlaneMirror extends Objects {

	private int angle;
	private BufferedImage img0;
	private BufferedImage img90;
	private BufferedImage img180;
	private BufferedImage img270;
	private BufferedImage img45;
	
	
	
	public PlaneMirror(int angle){
		
		this.angle = angle;
		
		try {
			img0 = ImageIO.read(getClass().getResourceAsStream("/0derece.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			img90 = ImageIO.read(getClass().getResourceAsStream("/90derece.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			img180 = ImageIO.read(getClass().getResourceAsStream("/180derece.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			img270 = ImageIO.read(getClass().getResourceAsStream("/270derece.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public int getAngle(){
		
		return angle;
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void draw( int x, int y ,Graphics g){
		
		if(angle == 0){
			
			g.drawImage(img0, x, y, null);
		}
		else if(angle == 90){
			
			g.drawImage(img90, x, y, null);
		}
		else if(angle == 180){
			
			g.drawImage(img180, x, y, null);
		}
		else if(angle == 270){
	
			g.drawImage(img270, x, y, null);
		}
		else if( angle == 45){
			

            // create the transform, note that the transformations happen
            // in reversed order (so check them backwards)
            AffineTransform at = new AffineTransform();

            // 4. translate it to the center of the component
            at.translate(x, y);

            // 3. do the actual rotation
            at.rotate( 7 * Math.PI / 4 );

            // 2. just a scale because this image is big
            at.scale(1, 1);

            // 1. translate the object so that you rotate it around the 
            //    center (easier :))
            at.translate(-img0.getWidth()/2, -img0.getHeight()/2);

            // draw the image
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(img0, at, null);

			
		}
		else if( angle == 135){
			

            // create the transform, note that the transformations happen
            // in reversed order (so check them backwards)
            AffineTransform at = new AffineTransform();

            // 4. translate it to the center of the component
            at.translate(x, y);

            // 3. do the actual rotation
            at.rotate( 5 * Math.PI / 4 );

            // 2. just a scale because this image is big
            at.scale(1, 1);

            // 1. translate the object so that you rotate it around the 
            //    center (easier :))
            at.translate(-img0.getWidth()/2, -img0.getHeight()/2);

            // draw the image
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(img0, at, null);

			
		}
		else if( angle == 225){
			

            // create the transform, note that the transformations happen
            // in reversed order (so check them backwards)
            AffineTransform at = new AffineTransform();

            // 4. translate it to the center of the component
            at.translate(x, y);

            // 3. do the actual rotation
            at.rotate( 3 * Math.PI / 4 );

            // 2. just a scale because this image is big
            at.scale(1, 1);

            // 1. translate the object so that you rotate it around the 
            //    center (easier :))
            at.translate(-img0.getWidth()/2, -img0.getHeight()/2);

            // draw the image
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(img0, at, null);

			
		}
		else if( angle == 315){
			

            // create the transform, note that the transformations happen
            // in reversed order (so check them backwards)
            AffineTransform at = new AffineTransform();

            // 4. translate it to the center of the component
            at.translate(x, y);

            // 3. do the actual rotation
            at.rotate( Math.PI / 4 );

            // 2. just a scale because this image is big
            at.scale(1, 1);

            // 1. translate the object so that you rotate it around the 
            //    center (easier :))
            at.translate(-img0.getWidth()/2, -img0.getHeight()/2);

            // draw the image
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(img0, at, null);

			
		}
		
	}

}
