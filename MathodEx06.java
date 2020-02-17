package step05_배열;

public class MathodEx06 {

	public static int total(int toeic, int it) {
		
		toeic=800;
		return toeic + it;

	}

	public static String rs(int total) {
		if (total >= 800) {
			return "합격";
		} else {
			return "불합격";
		}
	}

	public static void main(String[] args) {
		int toeic = 750, it = 65;
		System.out.println("입사총점 :" + total(toeic, it) + "점");
		System.out.println("입사결과 : " + rs(total(toeic, it)) + "입니다");
		System.out.println(toeic);
	}

}
