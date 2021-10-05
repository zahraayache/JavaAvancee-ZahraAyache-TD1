package exercice6;

import java.text.DecimalFormat;

public class Circle {
	private Point center;
	private int radius;
	
	//2- Class and constructors
	public Circle() {
		this.center = new Point();
		this.radius = 2;
	}
	
	public Circle(Point center,int radius) {
		this.center = center;
		this.radius =  radius;
	}
	
	//3- method to string
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a circle with a center of : " + this.center + ", and a radius of : " + this.radius + ", with an area of " + this.area();
	}
	
	//4-method translate
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public static void main(String[] args) {
		//own testing of the methods
		Circle circle = new Circle();
		System.out.println(circle);
		circle.translate(4, 5);
		System.out.println(circle.getCenter());
	
		System.out.println("--------------------------");
		//There is a problem with this code because after executing this code the translate method has translate the center of c1 along with the center of c2 because they have the same coordinates.
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);
		
		//6- get center can call translate of the class point.
		//and that is not what we want we want to use method translate only by calling it from the circle
		c=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c);
		
		//8-testing
		System.out.println(c.contains(new Point(7,9)));
		Circle[] cs = new Circle[3];
		cs[0] = c;
		cs[1] = c2;
		cs[2] = c2;
		System.out.println(c.contains(new Point(1,2), cs));
	}
	
	//7- area function
	public String area() {
		double area = Math.PI * this.radius * this.radius;
		return new DecimalFormat("##.##").format(area);
	}
	
	//8- contains
	public boolean contains(Point p) {
		if ((p.getX() - this.center.getX()) * (p.getX() - this.center.getX()) +
		        (p.getY() - this.center.getY()) * (p.getY() - this.center.getY()) <= this.radius * this.radius)
		        return true;
		else
		        return false;
	}
	
	//9- The method declaration should be a string that showcast how many times the point is inside circles, because he can be in more then one circle, and if we leave it as boolean the function will end to the first circle where the point is inside it.
	
	public String contains(Point p, Circle[] circles) {
		int count = 0;
		if(circles.length >0) {
			for (Circle c : circles) {
				if ((p.getX() - c.center.getX()) * (p.getX() - c.center.getX()) +
				        (p.getY() - c.center.getY()) * (p.getY() - c.center.getY()) <= this.radius * this.radius)
				        count++;
				
			}
		}
	if (count == 0)
		return "The point is not inside any of these circles";
	else
		return "The point is inside " + count+ " circles";
	}
	
	//getter and setter
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
}
