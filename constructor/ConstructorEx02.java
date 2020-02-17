package constructor;

public class ConstructorEx02 {
	public ConstructorEx02() {
		System.out.println("default constructor"); // 4

	}

	public ConstructorEx02(String str) {
		this(str, 10); // 2
		System.out.println(str + " constructor"); // 6
	}

	public ConstructorEx02(String str, int n) {
		this(); // 3
		System.out.println(str + n + " contstuctor"); // 5
	}

	public static void main(String[] args) {
		new ConstructorEx02(); //1 
		System.out.println("ooo"); // 7
	}

}
//----------------------------
//public class ConstructorEx02 {
//
//	public ConstructorEx02() {
//		this("가나다", 10);//2 
//		System.out.println("default constructor"); // 2개 짜리를 출력하고서 
//
//	}
//    public ConstructorEx02(String str ) {
//    	System.out.println(str+" constructor"); // 4 매개변수 하나짜리를 찾으러 옴 
//    }
//    public ConstructorEx02(String str, int n) {
//    	this(str);//3 매개변수 2개짜리를 찾으러 옴 
//    	System.out.println(str+n+" contstuctor"); // 1개짜리를 호출하러 옴 5 
//    }	
//
//	public static void main(String[] args) {
//		new ConstructorEx02(); //1 // 제일 먼저 실행
//		System.out.println("ooo"); // 7 마지막 디폴트 값을 출력 
//	}
//
//}
