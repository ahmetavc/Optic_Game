import java.util.ArrayList;

public class LevelThree implements Level{

	private final int sourceX;
	private final int sourceY;
	private final int targetX;
	private final int targetY;
	private final int obsX, obs2X;
	private final int obsY, obs2Y;
	private final int angle;
	private Objects mirror;
	private ArrayList<Objects> objList;
	
	
	public LevelThree(){
		
		sourceX = 481;
	 	sourceY = 481;
	 	targetX = 401;
	 	targetY = 81;
	 	obsX = 401;
	 	obsY = 401;
	 	obs2X = 881;
	 	obs2Y = 401;
	 	angle = 225;
	 	
	 	objList = new ArrayList<Objects>();
	 	
	 	mirror = new PlaneMirror(0);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(45);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(90);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(135);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(180);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(225);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(270);
	 	objList.add(mirror);
	 	
	 	mirror = new PlaneMirror(315);
	 	objList.add(mirror);
		
	}
	
	
	public ArrayList<Objects> getList(){
		
		return objList;
		
	}
	
	public int getAngle(){
		
		return angle;
		
	}
	
	public int getSourceX(){
		
		return sourceX;
	}
	
	public int getSourceY(){
		
		return sourceY;
	}
	
	public int getTargetX(){
		
		return targetX;
	}
	
	public int getTargetY(){
		
		return targetY;
	}
	
	public int getObsX(){
		
		return obsX;
	}

	public int getObsY(){
		
		return obsY;
	}	
	
	public int getObs2X(){
		
		return obs2X;
	}

	public int getObs2Y(){
		
		return obs2Y;
	}	
	
}

