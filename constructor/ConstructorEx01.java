package constructor;
// 생성자 : 클래스 이름과 동일한 메서드의 형태, 리턴 자료형의 부재 
// 생성자 는 객체생성을 담당 함 
public class ConstructorEx01 {
	public ConstructorEx01() {
		System.out.println("default consturctor");
	}

	public  ConstructorEx01(String str) {
		System.out.println(str + "constructor");
	}

	
	
	
	public static void main(String[] args) {
		new ConstructorEx01();
		new ConstructorEx01("가나다");
	}

}
