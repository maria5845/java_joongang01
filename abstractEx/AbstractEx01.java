package abstractEx;

//abstract  �̿ϼ��̶�� �� 
abstract class aa {
	public void view1() {};

	public void view2() {
		System.out.println("view2 ");
	}
}

class bb extends aa {
	@Override
	public void view1() {
		System.out.println("view11 ");
	}
	// aa Ŭ������ view1() ������ �������� ����
	// abstract�� ���� �������� ����� 
}

public class AbstractEx01 {

	public static void main(String[] args) {
	
		aa ob2 = new bb();// �θ� ���������� ����� �ڽ� ��ü ����
		ob2.view1();
		ob2.view2();

	}
//
//
//// abstract  �̿ϼ��̶�� �� 
//class aa{
//	public void view1() {System.out.println("view1 ");}
//	public void view2() {System.out.println("view2 ");}
//}
//
//class bb extends aa {
//	@Override
//	public void view1()  {System.out.println("view11 ");}
//	// aa Ŭ������ view1() ������ �������� ���� 
//}
//
//
//
//
//
//public class AbstractEx01 {
//
//	public static void main(String[] args) {
//    aa ob = new aa();
//    ob.view1();
//    ob.view2();
//    
//    aa ob2 = new bb();//�θ� ���������� ����� �ڽ� ��ü ���� 
//    ob2.view1();
//    ob2.view2();
//    
//	}

}
