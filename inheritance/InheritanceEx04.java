package inheritance;

class NumberEx01 {
	int a, b;

	public NumberEx01(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public void view1() {
		System.out.println(a + " " + b);
	}
}

class NumberEx02 extends NumberEx01 {
	int c;

	public NumberEx02(int a, int b, int c) {
		super(a, b);
		this.c = c;

	}

	public void view2() {
		super.view1();
		System.out.println(c);
	}
}

public class InheritanceEx04 {

	public static void main(String[] args) {
		new NumberEx01(100, 200).view1();
		new NumberEx02(10,20,30).view2();
	}

}
