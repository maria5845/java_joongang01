package switchEx;

/*
 * 숫자를 입력하세요 : 5 
 * 5는 홀수 입니다 
 */
import java.util.Scanner;

public class switchEX02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오 : " );
		Scanner sc = new Scanner(System.in);

		int a;
		a = sc.nextInt();
		
		switch(a%2) {
		case 0 :
			System.out.println(a+"는 짝수입니다.");
		break;
		case 1 :
			System.out.println(a+"는 홀수입니다.");
			break;
		default :
			System.out.println(a+"는 홀수입니다");
		}

	}

}
