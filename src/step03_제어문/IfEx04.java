package step03_���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class IfEx04 {

	public static void main(String[] args) throws IOException {
// ���� 
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� ������ �Է����ּ���");
//		int score1 = sc.nextInt();
//	
//		System.out.println("���������� �Է����ּ���");
//		int score2 = sc.nextInt();
//
//		System.out.println("���������� �Է����ּ���");
//		int score3 = sc.nextInt();
//		double avg = (score1 + score2 + score3) / 3;
//
//		if (score1 >= 40 && score2 >= 40 && score3 >= 40) {
//			if (avg > 60) {
//				System.out.println("�������"+avg+"�̸�"+" �հ��Դϴ�");
//			} else {
//				System.out.println("�������"+avg+"�̸�"+" ���հ� �Դϴ�");
//			}
//		} else {
//			System.out.println("�������� ���հ�");
//		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
     	BufferedReader br = new BufferedReader(isr); // �ӵ��� ������ ���ٴ� ��
		
		
		int k, e , m ;
		int tot;
		double avg;
		
		System.out.println("���������� �Է����ּ���:");
		k=Integer.parseInt(br.readLine()); 
		
		System.out.println("���������� �Է����ּ���:");
		e=Integer.parseInt(br.readLine()); 
		
		System.out.println("���������� �Է����ּ���:");
		m=Integer.parseInt(br.readLine()); 
		
		tot=k+e+m;
		avg=tot/3;
		
		
		if(avg>=60) {
			if(k<40 || e<40 || m<40) {
				System.out.println("�������� ���հ�");
			}else {
				System.out.println("�հ�");
			}
		}else {
			System.out.println("���հ� ");
		}
		
		
		
		
		

	}

}
