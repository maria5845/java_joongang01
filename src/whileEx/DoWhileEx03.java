package whileEx;

/*
 * 난수를 활용하여  65~90사이 난수 생성  10개 
 * 결과는 대충 78 66 ... 88  
 * 
 */
import java.util.*;

public class DoWhileEx03 {

	public static void main(String[] args) {
		int n;
		int num = 10;

		do {
			n = (int) (Math.random() * 26 + 65);
			System.out.print("난수 " + num + " " + n +" "+"/" +" ");
			num--;
			
		} while (num <=10 && num>0);

	}
}

