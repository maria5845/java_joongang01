package inputEX;

public class InputTest07 {

	public static void main(String[] args) {
		int eno = Integer.parseInt(args[0]);
		String ename = args[1];
		char dept = args[2].charAt(0);
		double score = Double.parseDouble(args[3]);
		
		
		System.out.printf(" 사원번호 : %d\n 사원이름 : %s\n 부서이름 : %c\n 입사성적 : %.1f\n" ,eno,ename,dept,score);
	}

}
