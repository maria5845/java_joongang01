package object;

import java.util.*;

class MemeberPhone {
	private String name;
	private String phone;

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		phone=sc.nextLine();
		sc.close();
		
	}
	public void output() {
		System.out.println(name+" ������ ��ȭ��ȣ��" +phone+"�Դϴ�.");
	}
}

public class ObjectEx06 {

	public static void main(String[] args) {
		MemeberPhone mp = new MemeberPhone();
		mp.input();
		mp.output();

	}

}
