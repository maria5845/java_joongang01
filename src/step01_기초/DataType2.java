package step01_기초;

public class DataType2 {
/*
 * %s : 문자열 
 * %c  
 * %f : double, float 
 * %d : int byte char 
 */
	public static void main(String[] args) {
		String name = "홍길동";
		char gender = '남';
		double score =85.3;
		int age = 25;
		double tall = 175.5;
		
		System.out.printf("이름 : %s\n ", name);
		System.out.printf("성별 : %c\n ", gender);
		System.out.printf("점수 : %.1f\n ", score);
		System.out.printf("나이 : %d\n ", age);
		System.out.printf("신장 : %.1f\n ", tall);
	}

}
