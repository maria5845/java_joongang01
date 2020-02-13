package forEx;

public class ForEx03 {

	public static void main(String[] args) {

		//동일한 자료형의 연속된 기억 공간 -> 배열 
		int [] num = {101,102,103,104,105};
//		.length 
		for (int i =0; i<num.length; i++) {
			
			System.out.println(num[i]);
			
		}
		for(int n : num) { //많이 사용함 ,일부분에서는 사용하기 어려움 
			System.out.println(n);
		}
		String [] color = {"red","green","blue"};
		 for(int i = 0; i<color.length;i++) {
			 System.out.println(color[i]);
		 }
		
		 for (String u : color ) {
			 System.out.println(u);
			
		}	
		 
		 for(int a =1; a<=10; a++ ) {
			if(a==5) {
				continue; // 현재하던 일을 멈추고 반복문의 맨처음으로 돌아감 / 조건이 만족할때 어떤 동작을하고 , 만족하지 않으면 다시 반복수행 
			    //break; 상위 for문이 종료
			}
			 System.out.println(a);
		 }
			
			
			
			
		}
	}


