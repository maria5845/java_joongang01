package whileEx;

/*
 * ������ Ȱ���Ͽ�  65~90���� ���� ����  10�� 
 * ����� ���� 78 66 ... 88  
 * 
 */
import java.util.*;

public class DoWhileEx03 {

	public static void main(String[] args) {
		int n;
		int num = 10;

		do {
			n = (int) (Math.random() * 26 + 65);
			System.out.print("���� " + num + " " + n +" "+"/" +" ");
			num--;
			
		} while (num <=10 && num>0);

	}
}

