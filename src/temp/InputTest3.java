package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �̸� : ��ȣ��
 * ���� : 23
 * ���� :�� 
 * 
 * 
 * 
 */
public class InputTest3 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name;
		char gender;
		int age;

		System.out.println("�̸� : ");
		name = br.readLine();

		System.out.println("����: ");
		age = Integer.parseInt(br.readLine());

		System.out.println("���� : ");
		gender = br.readLine().charAt(0);

		System.out.println("�̸���" + name + "�Դϴ�.");
		System.out.println("���̴�" + age + "�Դϴ�.");
		System.out.println("������" + gender + "�Դϴ�.");

	}

}
