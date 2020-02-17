package step05_배열;
// 1차원 배열 
// String name = "홍길동";
// 배열 : 동일한 자료형의 연속된 기억공간 
public class ArrayEx01 {

	public static void main(String[] args) {
		int [] num = new int[5]; // new 연산자 : 객체생성 -- 참조자료형 '
		num[0] = 10 ;
		num[1] = 20 ;
		num[2] = 30 ;
		num[3] = 40 ;
		num[4] = 50 ;
		
//		for(int i =num.length-1; i>=10; i--) {
//			System.out.println(num[i]);
		// 역순으로 출려됩니다.  
		// 할당 초기화 변수선언 같은말이다. 
//		}
		
	
		for (int i : num) {
			// 향상된 포문 
			System.out.println(i);
		}
		
	}

}
