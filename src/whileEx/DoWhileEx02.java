package whileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 다시한번 실행할까요(y/y)y
 * 다시한번 실행할까요(y/y)y
 * 다시한번 실행할까요(y/y)y
 */
public class DoWhileEx02 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	    
		char word;
		
		do {
			System.out.print("다시한번 실행할까요(y/Y)?");
			word=(br.readLine().charAt(0));
		}while(word=='y'|| word=='Y');
			System.out.println("수고용");
			
		}
}


