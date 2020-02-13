package inputEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest06 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int eno;
		String ename ;
		char dept; 
		double score; 

		System.out.print("사원번호를 입력하세요 : ");
		eno = Integer.parseInt(br.readLine());
		System.out.print("사원이름을 입력하세요 : ");
		ename= (br.readLine());
		System.out.print("부서코드를 입력하세요 : ");
		dept = br.readLine().charAt(0);
		System.out.print("입사성적을 입력하세요 : ");
		score = Double.parseDouble(br.readLine());
		
		System.out.println("사원번호 : "+ eno);
		System.out.println("사원이름 : "+ ename);
		System.out.println("부서코드 : "+ dept);
		System.out.printf("입사성적 : %.2f점\n", score);

	}

}
