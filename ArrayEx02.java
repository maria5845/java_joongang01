package step05_배열;

public class ArrayEx02 {

	public static void main(String[] args) {
		String[] car = { "쏘나타", "코란도 ", "포르쉐", "티코", "모닝" };
		car[3]="마티즈";
		for (String st : car) {
			System.out.println(st);
		}
	}

}
