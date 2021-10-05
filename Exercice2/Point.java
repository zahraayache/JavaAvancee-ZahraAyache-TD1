package Exercice2;

public class Point {

	private int x, y ;
	static int keepTrack;
	
	
	public Point() {
		this.setX(2);
		this.setY(3);
		keepTrack++;
	}

	
	//5 - there is no problem to name the parameters px & py bcs when initiating if we put x =px the variables are not named the same, so x will be initialized properly it's value px. Same goes for py.
	//6- There is a problem because when writing x= x The assignment to variable x has no effect, we should putthis.x = x so the compiler know that our private variable x is taking the value of the parameter x. Without this, it's like saying variable = itself so "this" is very important in that case.
	public Point(int x, int y) {
		this.x =x ;
		keepTrack++;
	}
	
	//8 - the compiler knows which constructor to call by it's parameters. When creating a new point if we don't put anything as parameters it calls the constructor with no parameters, but if we put a point as a param it will call this constructor.
	public Point ( Point p2) {
		this.x = p2.getX();
		this.y = p2.getY();
	}
	
	//1-	This code works because we instantiate the class at the beginning of the method, and we are calling two variables that are private to the class.
	//public void showPoint() {
		//Point p=new Point();
		//System.out.println(p.x+" "+p.y);
	//}
	public void showPoint() {
		
		Point p=new Point();
		//7- keep track of the number of Points by using a static variable and increment it when creating a new point that means in its constructor.
		System.out.println("Number of Points : " + keepTrack);
		System.out.println(p.getX()+" "+p.getY());
	}
	
	public static void main(String[] args) {
		Point p = new Point();
		p.showPoint();
		System.out.println(p);
	}
	
	//9- to get a return statement when we call an instence of a class in sysout, we have to put it in to String
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	//4-	In Java, accessor methods or Getters() return the value of a private variable. This gives other classes access to that value stored in that variable. without having direct access to the variable itself. Accessor methods take no parameters and have a return type that matches the type of the variable they are accessing. Yes, we have to do it here, to keep confidentiality of our variable and not make their access public to all the classes, we make a getter to the variables x & y, that way, TestPoint will see it’s value without having the access to modify it’s value.
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
