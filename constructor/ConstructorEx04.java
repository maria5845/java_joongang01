package constructor;

import java.util.Scanner;

/*
 * ConstructorEx04() 스캐너 사용 
 * clac() : int 
 * display(): void 
 * 가로를 입력 : 
 * 세로를 입력 : 
 * 
 * 사각형의 넓이 : 
 */
public class ConstructorEx04 {
	int x; // 접근 지정자 가 없어서 생성
	int y;

	public ConstructorEx04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 길이 : ");
		x = sc.nextInt();
		System.out.println("세로의 길이  : ");
		y = sc.nextInt();
		sc.close();
	}

	public int calc() {

		return x * y;

	}

	public void display() {
		System.out.println("사각형의 넓이는 : " + calc());

	}

	public static void main(String[] args) {
		new ConstructorEx04().display();
	}

}
