package temp;

public class ArgsEx {
	/*
	 * java ArgsEx 10 20 30 세수의 함 : 60
	 */
	public static void main(String[] args) {
//		System.out.println(args);

		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);

		System.out.println("세수의합: " + (a + b + c));
//
	}

}
