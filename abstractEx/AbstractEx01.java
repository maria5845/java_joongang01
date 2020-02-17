package abstractEx;

//abstract  미완성이라는 뜻 
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
	// aa 클래스의 view1() 재정의 강제성이 있음
	// abstract를 쓰면 강제성이 사라짐 
}

public class AbstractEx01 {

	public static void main(String[] args) {
	
		aa ob2 = new bb();// 부모에 참조변수를 만들어 자식 객체 생성
		ob2.view1();
		ob2.view2();

	}
//
//
//// abstract  미완성이라는 뜻 
//class aa{
//	public void view1() {System.out.println("view1 ");}
//	public void view2() {System.out.println("view2 ");}
//}
//
//class bb extends aa {
//	@Override
//	public void view1()  {System.out.println("view11 ");}
//	// aa 클래스의 view1() 재정의 강제성이 있음 
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
//    aa ob2 = new bb();//부모에 참조변수를 만들어 자식 객체 생성 
//    ob2.view1();
//    ob2.view2();
//    
//	}

}
