package switchEx;

public class switchEx01 {

	public static void main(String[] args) {
//		
//		int score = 95;
//		char grade;
//		
//		switch (score / 10) {// 조건식은 정수값
//
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//
//		default:
//			grade = 'F';
//
//		}
//		System.out.println("점수는 "+score+"학점은"+grade);
//		char sw = 'g';
//		if (sw == 'E' || sw == 'e') {
//			System.out.println("excellent");
//		} else if (sw == 'g' || sw == 'G') {
//			System.out.println("good");
//
//		} else
//
//		{
//			System.out.println("fail");
//		}

		char sw = 'g';

		switch (sw) {
		case 'E':
		case 'e':
			System.out.println("Excellent");
			break;
		case 'G':
		case 'g':
			System.out.println("Good");
			break;
		default:
			System.out.println("fail");

		}
	}
}
