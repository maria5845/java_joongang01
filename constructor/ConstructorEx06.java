package constructor;

import java.util.*;
/*
 * �����ڿ� �μ��� �Է¹޾� ū�� �������� ����ϼ��� 
 * show()�޼��忡�� , Maxvalue(), minValue();
 * 
 * Ŭ���� : Max 
 * -a int 
 * -b int 
 * +max()
 * +maxValue():int
 * +minValue():int
 * +show() void
 * ------------
 * input a : 5
 * input b : 3 
 * 
 * ū�� : 5
 * ���� �� : 3 
 */

class Max {
	private int a;
	private int b;

	public Max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input a :");
		a = sc.nextInt();
		System.out.print("input b :");
		b = sc.nextInt();
		sc.close();
	}

	public int maxValue() {
		return (a > b) ? a : b;

	}

	public int minValue() {
		return (a < b) ? a : b;
	}

	public void show() {
		System.out.println("ū�� : " + maxValue());
		System.out.println("������ : " + minValue());
	}
}

public class ConstructorEx06 {

	public static void main(String[] args) {
		Max mx = new Max();
		mx.show();

	}
}
