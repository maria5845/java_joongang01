package forEx;
/*
 * 1부터 100까지 7의 배수 출력 
 * continue;
 */
public class ForEx04 {

	public static void main(String[] args) {
		
		for (int a =1; a<=100; a++) {
			if(a%7!=0) {
				continue;				
			}
			System.out.println(a);

			
		}
		
	}

}
