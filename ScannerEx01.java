package object;

import java.util.*;

public class ScannerEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� :");
		char c = sc.next().charAt(0);
		
		System.out.println("���ڿ�: ");
		String str = sc.nextLine();
		
		System.out.println("���� : ");
		int a = sc.nextInt();
		
		System.out.println("�Ǽ� : ");
		double b = sc.nextDouble();
		
		
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
		
	}

}
