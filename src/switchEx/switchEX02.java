package switchEx;

/*
 * ���ڸ� �Է��ϼ��� : 5 
 * 5�� Ȧ�� �Դϴ� 
 */
import java.util.Scanner;

public class switchEX02 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��Ͻÿ� : " );
		Scanner sc = new Scanner(System.in);

		int a;
		a = sc.nextInt();
		
		switch(a%2) {
		case 0 :
			System.out.println(a+"�� ¦���Դϴ�.");
		break;
		case 1 :
			System.out.println(a+"�� Ȧ���Դϴ�.");
			break;
		default :
			System.out.println(a+"�� Ȧ���Դϴ�");
		}

	}

}
