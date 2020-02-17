package shape;
/*

 * /*
 * Triangle();
 * Triangle(x:int, y:int)
 * getSize():double 
 */

public class Rectangle extends Shape  {

	public Rectangle() {
		super();
		
	}

	public Rectangle(int x, int y) {
		super(x, y);
	
	}
	public double getSize() {
		return getX() * getY();
	}

}
