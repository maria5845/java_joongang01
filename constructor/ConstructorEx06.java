package constructor;

import java.util.*;
/*
 * 생성자에 두수를 입력받아 큰수 작은수를 출력하세요 
 * show()메서드에서 , Maxvalue(), minValue();
 * 
 * 클래스 : Max 
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
 * 큰수 : 5
 * 작은 수 : 3 
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
		System.out.println("큰수 : " + maxValue());
		System.out.println("작은수 : " + minValue());
	}
}

public class ConstructorEx06 {

	public static void main(String[] args) {
		Max mx = new Max();
		mx.show();

	}
}
