package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
// �ܼ� : ǥ�� ����� ��ġ 
import java.util.*;

public class InputTest {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // �ӵ��� ������ ���ٴ� ��
	

		String name;
		char gender;
		int age; 
		float weight;
		double tall;
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = br.readLine(); // �̼��� : ���ܻ�Ȳ
		
		System.out.println("������ �Է��ϼ��� : ");
		gender = br.readLine().charAt(0); // charAt(0) �ѱ��� �̾Ƴ���
		
		System.out.println("���̸��Է��ϼ��� : ");
		age = Integer.parseInt(br.readLine());
		
		
		System.out.println("ü�߸��Է��ϼ��� : ");
		weight = Float.parseFloat(br.readLine());
		
		System.out.println("���带�Է��ϼ��� : ");
		tall = Double.parseDouble(br.readLine());
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("ü�� : " + weight);
		System.out.println("���� : " + tall);

	}

}
