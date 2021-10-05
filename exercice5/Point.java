package exercice5;

public class Point {

	private int x, y ;
	static int keepTrack;
	
	
	public Point() {
		this.setX(2);
		this.setY(3);
		keepTrack++;
	}

	
	
	public Point(int x, int y) {
		this.x =x ;
		this.y =y;
		keepTrack++;
	}
	
	public Point ( Point p2) {
		this.x = p2.getX();
		this.y = p2.getY();
	}
	
	//1- method translate
	public void translate(int dx,  int dy) {
		setX(this.x + dx);
		setY(this.y + dy);
	}
	
	
	public void showPoint() {
		
		Point p=new Point();
		System.out.println("Number of Points : " + keepTrack);
		System.out.println(p.getX()+" "+p.getY());
	}
	
	public boolean isSameAs( Point p) {
		if( this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}

