package step05_배열;
// call by reference : 참조에 의한 전달, 참조 주소 전달 

// 객체 자료형, 클래스 ,인터페이스 , 배열 , 열거형 

public class MethodEx07 {

	public static void view1(String str) {// 원본데이터에 엑세스 가능
		System.out.println("view1의 변경전 str :" + str);
		str = "가나다";
		System.out.println("view1의 변경후 str :" + str);
		// 원본데이터 에 접근하지 못하는 케이스
	}

	public static void view2(int[] num) {// 원본데이터에 엑세스 가능
		for (int n : num) {
			System.out.print("view2의 num:" + n);

		}
		System.out.println();
		num[2] = 300;
		for (int n : num) {
			System.out.println("변경후 view2의 num:" + n);
		}
	}
	// C언어 배열에서 포인터로, 포인터에서 배열로 받음
	// char test [] ---> 배열 포인터

	public static void main(String[] args) {
		String str = "happy";
		System.out.println("호출전 stf : " + str);
		view1(str);// 함수 호출
		System.out.println("호출후 stf : " + str);

		int[] num = { 10, 20, 30, 40, 50 };
		for (int i : num)
			System.out.println("호출전 메인의 num : " + num);
		view2(num);
		for (int i : num)
			System.out.println("호출전 메인의 num : " + num);

	}

}
