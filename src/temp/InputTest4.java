package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {
/*
 * 반지름을 입력하세요 : 5 
 * 원의 넓이 : 78.5 (반지름 곱하기 반지름 *3.14)
 * 원의 둘레 : 31.4 (2*3.14*반지름) 
 */
	public static void main(String[] args) throws  IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("반지름의 길이는 : ");
		int rad;
		double size;
		double rnd;
		
		rad = Integer.parseInt(br.readLine());
		size=3.14*rad*rad;
		rnd=2*3.14*rad;
		System.out.printf("원의 넓이 : %.1f\n" ,size);
		System.out.printf("원의 둘레 : %.1f", rnd);
		
	
	}

}
