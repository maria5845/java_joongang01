package step03_���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.imageio.IIOException;

public class IfEX03 {

	public static void main(String[] args) throws IOException {
		// Q1. answer
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr); // �ӵ��� ������ ���ٴ� ��
		System.out.println("a���� �Է��Ͻÿ� :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a >= 50)
			System.out.println("50���� ũ��");
		if (a < 50)
			System.out.println("50���� �۴�");

		if (a % 2 != 0) {
			System.out.println("55�� Ȧ����");
		} else {
			System.out.println("46�� ¦���� ");
		}
		if (a > 0) {
			System.out.println("�Է��� ���� ����Դϴ�.");
		} else if (a < 0) {
			System.out.println("�Է��� ���� �����Դϴ�.");
		} else {
			System.out.println("�Է��� ���� 0 �Դϴ�.");
		}

	}
}
