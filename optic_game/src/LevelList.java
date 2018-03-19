import java.util.ArrayList;

public class LevelList {

	public static ArrayList<Level> levels = new ArrayList<Level>();
	public static int levelNum;
	
	public LevelList(){
		
		setList();
		
	}
	
	public static void setList(){
		
		Level lvl = new LevelOne();
		Level lvl2 = new LevelTwo();
		Level lvl3 = new LevelThree();
		
		levels.add(lvl);
		levels.add(lvl2);
		levels.add(lvl3);
		
		
	}
	

}
