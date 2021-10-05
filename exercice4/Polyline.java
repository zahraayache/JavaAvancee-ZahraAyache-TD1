package exercice4;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
	private Point[] line ;
	private final int singlePolyline = 1;
	private int max;
	private int i;
	
	//1 - constructors
	public Polyline() {
		this.max = this.singlePolyline;
		this.line = new Point[this.max];
	}
	
	public Polyline(int max) {
		this.max = max;
		this.line = new Point[this.max];
		this.i = 0;
		
	}
	
	//2- if we add more points than the max then the compilor will generate an error index out of bound exception
	// to avoid that we should add this if clause.
	public void add(Point point) throws IndexOutOfBoundsException{
		if(point == null) {
			System.out.println("You cannot add a null value!");
		}else {
			if(this.i == this.max) {
				// we can no more add or else it will generate an exception
				System.out.println("Oups you reached the limit !!");
			}else {
				this.line[i] = point;
				this.i ++;
				System.out.println("You've added the point : " + point);
			}
		}
		
	}
	
	//3- return the maximum capacity of the polyline
	public int pointCapacity() {
		return this.max;
	}
	
	//3- return the number points currently in the polyline
	public int nbPoints() {
		return this.i;
	}
	
	//4- return true if a given point is in the polyline
	//5- If null is given as an actual Point object it will throw an exception thats why we should prevent it by adding this if statement : 
	public boolean contains(Point point) {
		if (point == null) {
	        //throw new NullPointerException();
			System.out.println("You cannot check a null value");
		}else {
			for ( Point p : this.line) {
				if (p.isSameAs(point)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Polyline p = new Polyline(3);
		Point point = new Point(1,2);
		Point point1 = new Point(2,2);
		Point point2 = new Point(3,2);
		p.add(point);
		p.add(null);
		p.add(point1);
		p.add(point2);
		p.add(point);
		
		System.out.println(" List capacity : " + p.pointCapacity());
		System.out.println(" List nbPoints : " + p.nbPoints());
		
		//check if the list contains a point that is in the list
		System.out.println(p.contains(point));
		
		//check if the list contains a point that is not in the list
		Point notAvailableInList = new Point(4,4);
		System.out.println(p.contains(notAvailableInList));
		
		//check if the list contains a point that is null
		System.out.println(p.contains(null));
	}
}
