package inputEX;

public class MathodEx03 {

	public static void show1(int a, char b, double c, float d) {
		System.out.println(a + b + c + d);
	}

	public static int show2(int a, int b, int c) {
		return a + b + c;
	}

	public static double show3(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

	public static String show4(int a, int b, int c) {
	  double avg=(a+b+c)/3.0;
	  String rs;
	  if (avg>=60) {
		  rs="합격";
	  }else {
		  rs="불합격";
	  }
	  return rs;
	 
	}
	// 참조 자료형 : 객체 자료형 ex br, isr, []

	public static void main(String[] args) {
	
		show1(10, 'a', 100.4, 50.3f);
		int sum = show2(95, 85, 73);
		System.out.println(sum);
		double avg = show3(95, 85, 73);
		System.out.println(avg);
		String result = show4(60, 60, 90);
		System.out.println("결과 " + result);
	}

}
