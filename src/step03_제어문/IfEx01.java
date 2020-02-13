package step03_제어문;

public class IfEx01 {

	public static void main(String[] args) {
		int score = 90;
		char grade;

//		if (score >= 90)
//			grade = 'A';
//		else if (score >= 80)
//			grade = 'B';
//		else if (score >= 70)
//			grade = 'C';
//		else if (score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
//
//		System.out.println("점수는"+score+"이며\n"+"등급은"+grade+"입니다");
		if (score >= 90 && score < 100)
			grade = 'A';
		else if (score >= 80 && score < 90)
			grade = 'B';
		else if (score >= 70 && score < 80)
			grade = 'C';
		else if (score >= 60 && score < 70)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("점수는" + score + "이며\n" + "등급은" + grade + "입니다");

	}

}
