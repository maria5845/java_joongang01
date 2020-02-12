package step01_기초;

public class Test2 {
/* arr1[2]);
	System.out.println("총점 :" 
 * 변수는 4개(이름,국어,영어,수학)을 만들고 
 * 대입후 결과와 같이 완성하시오 
 * --결과
 * 이름 : 강호동
 * 국어 : 85
 * 영어 : 73
 * 수학 : 68
 * 총점 : 226점 
 */
	public static void main(String[] args) {
	String name = "강호동";
	int [] arr1 = {85,73,68};
	System.out.println("이름 :" + name);
	System.out.println("국어 :" + arr1[0]);
	System.out.println("영어 :" + arr1[1]);
	System.out.println("수학 :" + (arr1[0]+arr1[1]+arr1[2])+"점");

	}

}
