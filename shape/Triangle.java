package shape;

/*
 * Triangle();
 * Triangle(x:int, y:int)
 * getSize():double 
 */
public class Triangle extends Shape {

	public Triangle() {
		super();
	
	}

	public Triangle(int x, int y) {
		super(x, y);
	
	}
	public double getSize() {
		
		return (getX() * getY())/2.0;
	}

	

}
