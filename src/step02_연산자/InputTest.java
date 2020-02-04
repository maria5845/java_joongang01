package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
// 콘솔 : 표준 입출력 장치 
import java.util.*;

public class InputTest {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // 속도가 굉장히 좋다는 것
	

		String name;
		char gender;
		int age; 
		float weight;
		double tall;
		
		System.out.println("이름을 입력하세여 : ");
		name = br.readLine(); // 이셉션 : 예외상황
		
		System.out.println("성별을 입력하세여 : ");
		gender = br.readLine().charAt(0); // charAt(0) 한글자 뽑아내기
		
		System.out.println("나이를입력하세여 : ");
		age = Integer.parseInt(br.readLine());
		
		
		System.out.println("체중를입력하세여 : ");
		weight = Float.parseFloat(br.readLine());
		
		System.out.println("신장를입력하세여 : ");
		tall = Double.parseDouble(br.readLine());
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("체중 : " + weight);
		System.out.println("신장 : " + tall);

	}

}
