package shape;

public class ShapeMain {

	public static void main(String[] args) {
//	---- ����-------
		
//    Rectangle ob1 = new Rectangle(4,5);
//    
//    System.out.println("�簢���� ���� : "+ob1.getSize());
//    
//    Triangle ob2 = new Triangle(3,7);
//    System.out.println("�ﰢ���� ���� : "+ob2.getSize());
    
	Shape sp = null;
	sp= new Rectangle(4,5);
	
	System.out.println("�簢���� ���� : "+sp.getSize());
	
	sp= new Triangle(3,7);
	
	System.out.println("�簢���� ���� : "+sp.getSize());
    
	}

}
