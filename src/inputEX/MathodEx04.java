package inputEX;

/*
 * ������ 253��
 * ����� 84.33��
 * ������ b
 * ����� �հ� 
 * 
 * ���� : switch 
 * ��� : if else f�� ���հ� �ƴϸ� �հ� return
 *
 * 
 * 
 * 
 */
public class MathodEx04 {

	public static int total(int k, int e, int n) {
		// �������� �����Ѵ�.

		int tot = (k + e + n);
		return tot; // ������ ���� void �϶� ����

	}

	public static double avg(int total) {
		double av = total / 3.0;
		return av;

	}

	public static char grade(double avg) {
		char gd; // �����ϰ��� �ϴ� �����ϳ��� �������ֱ�! 
		switch ((int) (avg / 10)) {
		          // int������ ĳ�����ϴ� ���� �߿� ! 
		case 10:
		case 9:
			gd = 'A';
			break;
		case 8:
			gd = 'B';
			break;
		case 7:
			gd = 'C';
			break;

		case 6:
			gd = 'D';
			break;
		default:
			gd = 'E';
			break;

		}
		return gd;
		// switch �� ���

	}

	// �� �����ϰ� ����
//	switch((int)(avg/10))
//
//	{
//	   case 10 :
//	   case 9 :
//		   return 'A';
//	   case 8 :
//		   return 'B';
//	   case 7 :
//		   return 'C';
//	   case 6 :
//		   return 'D';
//		   default : 
//			   return 'F';
//	   
//	   }

	public static String result(char grade) {
		String rs;
		if (grade == 'F') {

			rs = "���հ�";

		} else {
			rs = "�հ�";
		}
		return rs;
		// �պ� �����ϱ�

	}

	public static void main(String[] args) {
		// ���α׷��� ������ ���ο��� �Ѵ� .
		// �Լ������� �и����Ѽ� �϶�.
		int k = 95, e = 85, n = 73;
		System.out.println("���� :" + total(k, e, n));
		System.out.printf( "��� : %.2f\n " , avg(total(k, e, n)));
		System.out.println("���� :" + grade(avg(total(k, e, n))));
		System.out.println("��� :" + result(grade(avg(total(k, e, n)))));

	}

}
