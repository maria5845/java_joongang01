package constructor;

import java.util.Scanner;

/*
 * ConstructorEx04() ��ĳ�� ��� 
 * clac() : int 
 * display(): void 
 * ���θ� �Է� : 
 * ���θ� �Է� : 
 * 
 * �簢���� ���� : 
 */
public class ConstructorEx04 {
	int x; // ���� ������ �� ��� ����
	int y;

	public ConstructorEx04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� : ");
		x = sc.nextInt();
		System.out.println("������ ����  : ");
		y = sc.nextInt();
		sc.close();
	}

	public int calc() {

		return x * y;

	}

	public void display() {
		System.out.println("�簢���� ���̴� : " + calc());

	}

	public static void main(String[] args) {
		new ConstructorEx04().display();
	}

}
