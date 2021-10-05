package exercice3;

import java.util.ArrayList;

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
	
	
	public void showPoint() {
		
		Point p=new Point();
		System.out.println("Number of Points : " + keepTrack);
		System.out.println(p.getX()+" "+p.getY());
	}
	
	// 2 - this method is only comparing the coordinates and not the references.
	public boolean isSameAs( Point p) {
		if( this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		 Point p1=new Point(1,2);
		 Point p2=p1;
		 Point p3=new Point(1,2);
		 
		 System.out.println("----------partie 1---------");
		 
		 System.out.println(p1==p2);
		 System.out.println(p1==p3);
		 
		 //1 - The code will return true then false. Explanations:
		 // the first sysout will return true because we are comparing the reference of the two variables, and p2 has the same reference as p1 then it will return true. Because when we do p2 = p1 we are giving to p2 the values and the reference of p1.
		 // the second sysout will return false because when we are comparing the two variables it's true that they have the same values but not the same refrences so it will return false.
		 
		 
		 System.out.println("----------partie 2---------");
		 
		 System.out.println(p1.isSameAs(p3));
	
		 ArrayList<Point> list = new ArrayList<>();
		 list.add(p1);
		 System.out.println("----------partie 3---------");
		 
		 System.out.println(list.indexOf(p2));
		 System.out.println(list.indexOf(p3));
		 
		 //3- the problem with this code is that it's adding the reference to the list not the object ( the point) itself ! 
		 // the first sysout return 0 Which should have returned -1 bcs we added p1 not p2 but because it is returning the reference and p2 and p1 have the same one so their index in the list is the same.
		 // the second sysout is returning -1 which is true bcs we didn't add p3.
		 
		 // To fix the problem we can do like this : 
		 p2=new Point(p1); // copy p1 coordonee but not it's refrence
		 
		 
		 System.out.println("----------partie 3---------");
		 list = new ArrayList<>();
		 list.add(p1);
		 System.out.println(list.indexOf(p2));
		 System.out.println(list.indexOf(p3));
		 
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
