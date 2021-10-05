package Exercice2;

public class TestPoint {
	private int x, y ;
	
	
	
	public TestPoint() {
		this.x = 2;
		this.y = 3;
		
	}
	
	
	//2-	In the class TestPoint we cannot call the private variable of the class Point by writing them like this : p.x+" "+p.y ; we have two options : we can change visibility of the variables to public ( which is very discouraged ) , or we do getters and setters for the variables. In this case we need a getter because we only want to read it’s value
	//3-	It is always better to set all fields to private because making a variable private "protects" its value when the code runs. At this level, we are not concerned with protecting it from other programmers changing the code itself. The point is to keep internal data hidden from other classes which use the class. And if a variable is only used once in a class what’s it’s the point to declare it public, this will only give the access to other classes to change your variables and maybe cause big damage. 
	public void showPoint() {
		Point p=new Point();
		System.out.println(p.getX()+" "+p.getY());
	}
	
	public static void main(String[] args) {
		TestPoint p = new TestPoint();
		p.showPoint();
		
	}
}

