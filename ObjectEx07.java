package object;

import java.util.Scanner;

public class ObjectEx07 {
	/*
	 * ***** 사다리 꼴의 넓이 구하기 ***** 밑변을 입력하시오 : 5 윗변을 입력하시오 : 4 높이를 입력하시오 : 3
	 * 
	 * 넓이 : 13.5 do while 문
	 * 
	 * 한번더 계산 할까요?(Y/Y)n *********수고 하셨습니다 **********
	 * 
	 */
	public static void main(String[] args) {
		Trapzoid tp = new Trapzoid();
		char ans;
		Scanner sc = new Scanner(System.in);
		do {

			// 입력처리
			// 계산처리
			// 재수행처리
			// 조건검사
			System.out.println("밑변을 입력하시오:");
			int base = sc.nextInt();
			System.out.println("윗변을 입력하시오:");
			int top = sc.nextInt();
			System.out.println("높이를 입력하시오:");
			int height = sc.nextInt();
			tp.setTrapzoid(base, top, height);// setTrapzoid 메서드를 호출하여
			// 스캐너로 입력된 값을 삽입한다.

			// 입력처리

			System.out.println(tp.toString());
			// 계산처리

			System.out.println("한번 더 계산할까요?(y/Y)");
			ans = sc.next().charAt(0);

//			if (ans == 'y' || ans == 'Y') {
//				continue;
//
//			} else if (ans == 'n') {
//				System.out.println("***수고하셨습니다****");
//				break;
//			} 필요없는 코드 
			// 재수행처리

		} while (ans == 'y' || ans == 'Y');
       //조건 검사 
		sc.close();
	}

	
/*
 * ---------------정답---------------
 * 
 * 
 * int base, top, height 
 * char yn;
 * Scanner sc = new Scanner(System.in);
 * 
 *  do {
 *     System.out.println("**사다리꼴의 넓이 구하기***"  )
 *     System.out.println("밑변을 입력하시오"  )
 *     base=sc.nextInt();
 *     System.out.println("윗변을 입력하시오"  )
 *     top=sc.nextInt();
 *     System.out.println("높이를  입력하시오"  )
 *     height=sc.nextInt();
 * 
 *     tz.setTrapzoid(base, top, height);
 *     System.out.println(tz.toStiring()) => toString 결과 
 * 
 * 
 *    System.out.println("한번더 계산할까요(y/Y)");
 *    yn=sc.next()charAt(0);
 *    } while(yn =='Y' || yn== 'y');
 *    
 *    System.out.println("******수고하셨습니다*****");
 * 
 * 
 * 
 */
}
