package whileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1.�簢��,2.�ﰢ��,3.��,4.����
 */
public class WhileEx03 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n;
		

		while (true) {

			System.out.print("1.�簢�� 2.�ﰢ�� 3.�� 4.����\n �����ϼ��� : ");
			n = Integer.parseInt(br.readLine());
			switch (n) {
			case 1:
				System.out.println("�簢���� ���õǾ����ϴ�.");
				break;
			case 2:
				System.out.println("�ﰢ���� ���õǾ����ϴ�.");
				break;
			case 3:
				System.out.println("���� ���õǾ����ϴ�.");
				break;
			case 4:
				System.out.println("*****�����մϴ�*****");
				System.exit(0);
			}
		}
	}

}
