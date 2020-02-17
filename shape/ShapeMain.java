package shape;

public class ShapeMain {

	public static void main(String[] args) {
//	---- 정적-------
		
//    Rectangle ob1 = new Rectangle(4,5);
//    
//    System.out.println("사각형의 넓이 : "+ob1.getSize());
//    
//    Triangle ob2 = new Triangle(3,7);
//    System.out.println("삼각형의 넓이 : "+ob2.getSize());
    
	Shape sp = null;
	sp= new Rectangle(4,5);
	
	System.out.println("사각형의 넓이 : "+sp.getSize());
	
	sp= new Triangle(3,7);
	
	System.out.println("사각형의 넓이 : "+sp.getSize());
    
	}

}
