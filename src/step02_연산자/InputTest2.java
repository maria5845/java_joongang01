package step02_������;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class InputTest2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // �ӵ��� ������ ���ٴ� ��
	
	int a;
	int b;
	
	System.out.println("A���� �Է����ּ���:");
	a =Integer.parseInt(br.readLine()); 
	
	System.out.println("b���� �Է����ּ���:");
	b =Integer.parseInt(br.readLine()); 
	
	System.out.printf("%d+%d=%d",a,b,(a+b));
	}

}
