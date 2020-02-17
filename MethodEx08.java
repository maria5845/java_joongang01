package step05_배열;

public class MethodEx08 {

	
	public static void view1() {
		
		System.out.println("static mathod");
		//static 포함 
	}
	
	public void view2() {
		//static 미포함 
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
         
		view1();//기본 호출가능 -> 자기자신의 메서드에 접근할때는 클래스 이름 생략이 가능 
		
		
		//클래스의 오브젝트는 인스턴스 
		
		MethodEx08 ob = new MethodEx08();
		ob.view2();//기본 호출이 불가능 / 인스턴스 메서드 
		//인스턴스 메서드는 반드시 객체를 생성하고 매서드를 호출 
		
		
	}

}
