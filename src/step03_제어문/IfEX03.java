package step03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.imageio.IIOException;

public class IfEX03 {

	public static void main(String[] args) throws IOException {
		// Q1. answer
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr); // 속도가 굉장히 좋다는 것
		System.out.println("a값을 입력하시오 :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a >= 50)
			System.out.println("50보다 크다");
		if (a < 50)
			System.out.println("50보다 작다");

		if (a % 2 != 0) {
			System.out.println("55는 홀수다");
		} else {
			System.out.println("46은 짝수다 ");
		}
		if (a > 0) {
			System.out.println("입력한 값은 양수입니다.");
		} else if (a < 0) {
			System.out.println("입력한 값은 음수입니다.");
		} else {
			System.out.println("입력한 값은 0 입니다.");
		}

	}
}
