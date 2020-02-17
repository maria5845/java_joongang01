package step05_배열;

public class MathodEx05 {
	public static void show1() {
		System.out.println("안녕하세여");
		return;
	}

	public static void show2(char c, int i) {
		System.out.println("타입 " + c);
		System.out.println("코드 " + i);
	}
	public static String show3() {
		return "hello";
	}
	public static float  show4(int a,int b, int c ) {
	    float sum = a+b+c;
	    float avg = sum/3.0f;
	    return avg;
		
		
		
	}

	public static void main(String[] args) {
		show1();
		show2('a', 25);
        String s = show3();
        System.out.println(s);
        float k =show4(15,45,73);
        System.out.printf("리턴값 %.2f" ,k);
	}

}
