package exercice6;

//1- we should use inheritance because Ring has the same variables as circle and one more. He could use also the same methods
public class Ring extends Circle{
	private int innerRadius;
	
	public Ring() {
		super();
		this.innerRadius=1;
	}
	public Ring(Point center,int radius,int innerRadius) {
		super(center, radius);
		//2-the inner radius must be smaller then the outer one
		if(this.innerRadius< radius) {
			this.innerRadius=innerRadius;
		}else {
			System.out.println("the inner radius must alway be smaller then the outer one!!");
		}
		
	}
	
	//3- equals
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ring ring = (Ring) obj;
		if (super.getCenter() != ring.getCenter() && super.getRadius() != ring.getRadius() && innerRadius != ring.innerRadius)
			return false;
		return true;
	}
	
	//4- If we do Sysout without supplementary code, the compiler will show me the address of the instance of ring variable.
	//so to show the sentence and the ring details we should do the function to string
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "C'est un anneau avec un centre de : " + this.getCenter() + ", un rayon de: " + this.getRadius() + ", et un rayon interne de: " + this.innerRadius;
	}
	
	//5-
	public boolean contains(Point point) {
		return super.contains(point);
		
	}
	//6-
	public String contains(Point point , Ring[] rings) {
		return super.contains(point,rings);
		
	}
}
