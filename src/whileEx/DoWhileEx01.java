package whileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx01 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int num;
		
		do {
			System.out.println("������ �Է��Ͻÿ� ");
			num=Integer.parseInt(br.readLine());
			
		}while(num<0 || num>100);
		System.out.println("������ " + num +"���Դϴ�.");
	}

}
