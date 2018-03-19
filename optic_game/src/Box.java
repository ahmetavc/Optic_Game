
public class Box {

	private int x;
	private int y;
	private final int width;
	private final int height;
	private Objects obj;
	private boolean status;
    
	public Box(int x, int y){
		
		this.x = x;
		this.y = y;
		width = 80;
		height = 80;
		
		obj = null;
		status = false;
		
	}
	
	public Objects getObj(){
		
		return obj;
	}
	
	public void setObj(Objects obj){
		
		if(!status){
			
			this.obj = obj;
			status = true;
		}
		
	}
	
	public Objects deleteObj(){
		
		
		
		if( obj instanceof PlaneMirror ){
			
			Objects obj2 = obj;
			obj = null;
			status = false;
			return obj2;
			
		}
		else{
			
			return null;
		}
		
		
	}
	
	public void deleteMain(){
		
		if( obj instanceof Source || obj instanceof Obstacle || obj instanceof Target ){
			
			Objects obj2 = obj;
			obj = null;
			status = false;
			
		}
		
	}
	
	public boolean getStatus(){
		
		return status;
	}
	
	public int getX(){
		
		return x;
	}
	
	public int getY(){
		
		return y;
	}
	
	
}
