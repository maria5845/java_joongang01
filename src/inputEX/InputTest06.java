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

		System.out.print("�����ȣ�� �Է��ϼ��� : ");
		eno = Integer.parseInt(br.readLine());
		System.out.print("����̸��� �Է��ϼ��� : ");
		ename= (br.readLine());
		System.out.print("�μ��ڵ带 �Է��ϼ��� : ");
		dept = br.readLine().charAt(0);
		System.out.print("�Ի缺���� �Է��ϼ��� : ");
		score = Double.parseDouble(br.readLine());
		
		System.out.println("�����ȣ : "+ eno);
		System.out.println("����̸� : "+ ename);
		System.out.println("�μ��ڵ� : "+ dept);
		System.out.printf("�Ի缺�� : %.2f��\n", score);

	}

}
