package object;

import java.util.*;

class MemeberPhone {
	private String name;
	private String phone;

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("번호를 입력하세요 : ");
		phone=sc.nextLine();
		sc.close();
		
	}
	public void output() {
		System.out.println(name+" 고객님의 전화번호는" +phone+"입니다.");
	}
}

public class ObjectEx06 {

	public static void main(String[] args) {
		MemeberPhone mp = new MemeberPhone();
		mp.input();
		mp.output();

	}

}
