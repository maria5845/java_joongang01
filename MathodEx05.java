package step05_�迭;

public class MathodEx05 {
	public static void show1() {
		System.out.println("�ȳ��ϼ���");
		return;
	}

	public static void show2(char c, int i) {
		System.out.println("Ÿ�� " + c);
		System.out.println("�ڵ� " + i);
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
        System.out.printf("���ϰ� %.2f" ,k);
	}

}
