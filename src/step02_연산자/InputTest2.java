package step02_연산자;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class InputTest2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // 속도가 굉장히 좋다는 것
	
	int a;
	int b;
	
	System.out.println("A값을 입력해주세여:");
	a =Integer.parseInt(br.readLine()); 
	
	System.out.println("b값을 입력해주세여:");
	b =Integer.parseInt(br.readLine()); 
	
	System.out.printf("%d+%d=%d",a,b,(a+b));
	}

}
