package temp;

import java.util.Random;

public class RandomEx {
//���� : ��ǻ�Ͱ� ������ ���� �߻� ,�ǻ� ����, pseudo random  
	public static void main(String[] args) {
// Math Ŭ������ Random Ŭ���� 

		System.out.println(Math.random());// 0~1�̸��� �Ǽ� ǥ�� /����� ����
		System.out.println((int) (Math.random() * 10 + 1));// 1���� 11�̸�
		System.out.println((int) (Math.random() * 31 + 50));// 50���� 81�̸�
		System.out.println((int) (Math.random() * 30 + 51));// 51���� 80�̸�

		Random rd = new Random();

		int n1 = rd.nextInt(101)+0;// 0���� 101�̸�
		int n2 = rd.nextInt(31)+50;// 50�̻� 81 �̸�
		int n3 = rd.nextInt(41)+30;// 50�̻� 81 �̸�
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
