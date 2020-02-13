package step03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class IfEx04 {

	public static void main(String[] args) throws IOException {
// 내답 
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("국어 점수를 입력해주세요");
//		int score1 = sc.nextInt();
//	
//		System.out.println("수학점수를 입력해주세요");
//		int score2 = sc.nextInt();
//
//		System.out.println("영어점수를 입력해주세요");
//		int score3 = sc.nextInt();
//		double avg = (score1 + score2 + score3) / 3;
//
//		if (score1 >= 40 && score2 >= 40 && score3 >= 40) {
//			if (avg > 60) {
//				System.out.println("평균점수"+avg+"이며"+" 합격입니다");
//			} else {
//				System.out.println("평균점수"+avg+"이며"+" 불합격 입니다");
//			}
//		} else {
//			System.out.println("과락으로 불합격");
//		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
     	BufferedReader br = new BufferedReader(isr); // 속도가 굉장히 좋다는 것
		
		
		int k, e , m ;
		int tot;
		double avg;
		
		System.out.println("국어점수을 입력해주세여:");
		k=Integer.parseInt(br.readLine()); 
		
		System.out.println("영어점수를 입력해주세여:");
		e=Integer.parseInt(br.readLine()); 
		
		System.out.println("수학점수를 입력해주세여:");
		m=Integer.parseInt(br.readLine()); 
		
		tot=k+e+m;
		avg=tot/3;
		
		
		if(avg>=60) {
			if(k<40 || e<40 || m<40) {
				System.out.println("과락으로 불합격");
			}else {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격 ");
		}
		
		
		
		
		

	}

}
