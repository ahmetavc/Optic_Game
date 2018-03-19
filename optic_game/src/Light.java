import java.awt.Graphics;
import java.util.ArrayList;

public class Light {

	public static ArrayList<LightRay> lights = new ArrayList<LightRay>();
	
	public static void clean(){
		
		Background.ray1 = new LightRay( Background.levelList.levels.get(LevelList.levelNum).getSourceX() + 40
				, Background.levelList.levels.get(LevelList.levelNum).getSourceY() + 40
				, LevelList.levels.get(LevelList.levelNum).getAngle());
		
		
		lights.clear();
		
		Background.drawable = true;
		
	}
	
	public static void add(LightRay ray){
		
		lights.add(ray);
		
	}
	
	public static void iterateDraw(Graphics g){
		
		for(int i = 0; i < lights.size(); i++){
			
			lights.get(i).draw(g);
			
		}
		
	}
	
}
