package forEx;

public class ForEx03 {

	public static void main(String[] args) {

		//������ �ڷ����� ���ӵ� ��� ���� -> �迭 
		int [] num = {101,102,103,104,105};
//		.length 
		for (int i =0; i<num.length; i++) {
			
			System.out.println(num[i]);
			
		}
		for(int n : num) { //���� ����� ,�Ϻκп����� ����ϱ� ����� 
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
				continue; // �����ϴ� ���� ���߰� �ݺ����� ��ó������ ���ư� / ������ �����Ҷ� � �������ϰ� , �������� ������ �ٽ� �ݺ����� 
			    //break; ���� for���� ����
			}
			 System.out.println(a);
		 }
			
			
			
			
		}
	}


