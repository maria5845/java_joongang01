package forEx;

//for(�ʱⰪ;���ǽ�;������){}
public class ForEx01 {

	public static void main(String[] args) {
		//Ȧ�� ���� ��� 
		
		int sum = 0, odd=0;
		
		
		for (int i = 1; i <= 10; i++) {
        // {}���� �ݺ��� ������ i�� 1���� 
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
