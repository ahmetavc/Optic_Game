
public class BoxMatris {

	public Box[][] boxMatris;
	public Box box;
	private int x;
	private int y;
	
	
	public BoxMatris(){
		
		boxMatris = new Box[20][10];
		
		create();
	
	}
	public void create(){
		
		int x = 40;
		int y = 40;
		
		for(int i = 0; i < 20 ; i++){
			
			if( i != 0){
				
				x = x + 80;
				
			}
			
			y = 40;
			
			for(int j = 0; j < 10; j++){
				
				if(j != 0){
					
					y = y + 80;
					
				}
				
				box = new Box (x,y);
				boxMatris[i][j] = box;
				
			}
			
		}
		
	}
	
}
