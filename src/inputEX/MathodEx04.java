package inputEX;

/*
 * 총점은 253점
 * 평균은 84.33점
 * 학점은 b
 * 결과는 합격 
 * 
 * 학점 : switch 
 * 결과 : if else f면 불합격 아니면 합격 return
 *
 * 
 * 
 * 
 */
public class MathodEx04 {

	public static int total(int k, int e, int n) {
		// 정수값을 리턴한다.

		int tot = (k + e + n);
		return tot; // 생략이 가능 void 일때 가능

	}

	public static double avg(int total) {
		double av = total / 3.0;
		return av;

	}

	public static char grade(double avg) {
		char gd; // 리턴하고자 하는 변수하나를 선언해주기! 
		switch ((int) (avg / 10)) {
		          // int형으로 캐스팅하는 것이 중요 ! 
		case 10:
		case 9:
			gd = 'A';
			break;
		case 8:
			gd = 'B';
			break;
		case 7:
			gd = 'C';
			break;

		case 6:
			gd = 'D';
			break;
		default:
			gd = 'E';
			break;

		}
		return gd;
		// switch 문 사용

	}

	// 더 심플하게 쓰기
//	switch((int)(avg/10))
//
//	{
//	   case 10 :
//	   case 9 :
//		   return 'A';
//	   case 8 :
//		   return 'B';
//	   case 7 :
//		   return 'C';
//	   case 6 :
//		   return 'D';
//		   default : 
//			   return 'F';
//	   
//	   }

	public static String result(char grade) {
		String rs;
		if (grade == 'F') {

			rs = "불합격";

		} else {
			rs = "합격";
		}
		return rs;
		// 합불 리턴하기

	}

	public static void main(String[] args) {
		// 프로그램의 시작은 메인에서 한다 .
		// 함수단위로 분리시켜서 하라.
		int k = 95, e = 85, n = 73;
		System.out.println("총점 :" + total(k, e, n));
		System.out.printf( "평균 : %.2f\n " , avg(total(k, e, n)));
		System.out.println("학점 :" + grade(avg(total(k, e, n))));
		System.out.println("결과 :" + result(grade(avg(total(k, e, n)))));

	}

}
