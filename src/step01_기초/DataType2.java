package step01_����;

public class DataType2 {
/*
 * %s : ���ڿ� 
 * %c  
 * %f : double, float 
 * %d : int byte char 
 */
	public static void main(String[] args) {
		String name = "ȫ�浿";
		char gender = '��';
		double score =85.3;
		int age = 25;
		double tall = 175.5;
		
		System.out.printf("�̸� : %s\n ", name);
		System.out.printf("���� : %c\n ", gender);
		System.out.printf("���� : %.1f\n ", score);
		System.out.printf("���� : %d\n ", age);
		System.out.printf("���� : %.1f\n ", tall);
	}

}
