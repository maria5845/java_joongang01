package object;

import java.util.*;

public class ScannerEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 :");
		char c = sc.next().charAt(0);
		
		System.out.println("문자열: ");
		String str = sc.nextLine();
		
		System.out.println("정수 : ");
		int a = sc.nextInt();
		
		System.out.println("실수 : ");
		double b = sc.nextDouble();
		
		
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
		
	}

}
