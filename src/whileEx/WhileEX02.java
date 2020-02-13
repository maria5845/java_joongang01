package whileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEX02 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int a;
		int b =1;
		System.out.println("출력할 단을 입력하시오:");
		a=Integer.parseInt(br.readLine());
		
		while(b<10) {
			System.out.println(a+"X"+b+"="+(a*b));
			b++;
		}
		
		
		
	}

}
