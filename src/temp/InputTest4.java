package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {
/*
 * �������� �Է��ϼ��� : 5 
 * ���� ���� : 78.5 (������ ���ϱ� ������ *3.14)
 * ���� �ѷ� : 31.4 (2*3.14*������) 
 */
	public static void main(String[] args) throws  IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("�������� ���̴� : ");
		int rad;
		double size;
		double rnd;
		
		rad = Integer.parseInt(br.readLine());
		size=3.14*rad*rad;
		rnd=2*3.14*rad;
		System.out.printf("���� ���� : %.1f\n" ,size);
		System.out.printf("���� �ѷ� : %.1f", rnd);
		
	
	}

}
