package step05_�迭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx05 {

	public static void main(String[] args) throws IOException {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
       
       int [] ar = new int[5];
	   int max = ar[0];
	   int min = ar[0];
	   
       for(int i = 0; i<ar.length; i++) {
    	   
    	   System.out.println("�迭��" +(i+1)+"° ���� �Է��Ͻÿ�" );
    	   ar[i] = Integer.parseInt(br.readLine());
    	   if (ar[i] > max)
				max = ar[i];
			if (ar[i] < min)
				min = ar[i];
    	   
    	  
    	   
       }
	   System.out.println("�ִ밪 :" +max);
	   System.out.println("�ּҰ� :" +min);
	   
	   for(int data :ar) {
		   System.out.print( data + " ");
	   }
		
	}

}
