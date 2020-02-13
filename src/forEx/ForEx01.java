package forEx;

//for(초기값;조건식;증감식){}
public class ForEx01 {

	public static void main(String[] args) {
		//홀수 값을 출력 
		
		int sum = 0, odd=0;
		
		
		for (int i = 1; i <= 10; i++) {
        // {}안의 반복이 끝나면 i에 1증가 
			sum+=i;
		  switch(i%2) {
		  case 1 :
			  odd+=i;
			  break;
		  }
			
		}
		System.out.println(sum);
		System.out.println(odd);
	}

}
