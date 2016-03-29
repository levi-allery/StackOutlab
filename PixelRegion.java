
public class PixelRegion {

	int h, w;
	boolean visited;
	
	PixelRegion(int h, int w){
		this.h= h;
		this.w = w;
		visited = false;
	}
	
	
	public int getW(){
		return w;
	}
	
	public int getH(){
		return h;
	}
	public void setVisited(){
		visited = true;
	}
}
