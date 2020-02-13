package inputEX;
// call by name : 이름 만 호출한다는 뜻 
public class MethodEX01 {
//맴버메써드 
	public static void view() {
		// void 값에 대한 리턴 타입 존재가 없음
		System.out.println("hello");

	}
	
	public static void star() {
		
		System.out.println("***************");
		
	}

	public static void main(String[] args) {
		view();
		star();
	
		
	}

}
