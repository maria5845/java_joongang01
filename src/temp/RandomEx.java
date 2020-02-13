package temp;

import java.util.Random;

public class RandomEx {
//난수 : 컴퓨터가 임의의 수를 발생 ,의사 난수, pseudo random  
	public static void main(String[] args) {
// Math 클래스와 Random 클래스 

		System.out.println(Math.random());// 0~1미만의 실수 표현 /양수를 만듬
		System.out.println((int) (Math.random() * 10 + 1));// 1부터 11미만
		System.out.println((int) (Math.random() * 31 + 50));// 50부터 81미만
		System.out.println((int) (Math.random() * 30 + 51));// 51부터 80미만

		Random rd = new Random();

		int n1 = rd.nextInt(101)+0;// 0부터 101미만
		int n2 = rd.nextInt(31)+50;// 50이상 81 미만
		int n3 = rd.nextInt(41)+30;// 50이상 81 미만
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
