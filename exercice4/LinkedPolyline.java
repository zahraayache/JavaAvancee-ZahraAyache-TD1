package exercice4;

import java.util.LinkedList;

public class LinkedPolyline {
	
		private LinkedList<Point> line ;
		private final int singlePolyline = 1;
	
		
		//1 - constructors
		public LinkedPolyline() {
			this.line = new LinkedList<Point>();
		}
		
		
		public void add(Point point) throws IndexOutOfBoundsException{
			
			this.line.add(point);
			
		}
		
		public String pointCapacity() {
			return "No maximum capacity"; // it has no maximum capacity
		}
		
		public int nbPoints() {
			return this.line.size();
		}
		
		public boolean contains(Point point) {
			if (point == null) {
		        throw new NullPointerException();
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
