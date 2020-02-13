package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 이름 : 강호동
 * 나이 : 23
 * 성별 :남 
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

		System.out.println("이름 : ");
		name = br.readLine();

		System.out.println("나이: ");
		age = Integer.parseInt(br.readLine());

		System.out.println("성별 : ");
		gender = br.readLine().charAt(0);

		System.out.println("이름은" + name + "입니다.");
		System.out.println("나이는" + age + "입니다.");
		System.out.println("성별은" + gender + "입니다.");

	}

}
