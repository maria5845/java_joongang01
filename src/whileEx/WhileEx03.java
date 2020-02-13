package whileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1.사각형,2.삼각형,3.원,4.종료
 */
public class WhileEx03 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n;
		

		while (true) {

			System.out.print("1.사각형 2.삼각형 3.원 4.종료\n 선택하세요 : ");
			n = Integer.parseInt(br.readLine());
			switch (n) {
			case 1:
				System.out.println("사각형이 선택되었습니다.");
				break;
			case 2:
				System.out.println("삼각형이 선택되었습니다.");
				break;
			case 3:
				System.out.println("원이 선택되었습니다.");
				break;
			case 4:
				System.out.println("*****종료합니다*****");
				System.exit(0);
			}
		}
	}

}
