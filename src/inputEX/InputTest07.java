package inputEX;

public class InputTest07 {

	public static void main(String[] args) {
		int eno = Integer.parseInt(args[0]);
		String ename = args[1];
		char dept = args[2].charAt(0);
		double score = Double.parseDouble(args[3]);
		
		
		System.out.printf(" �����ȣ : %d\n ����̸� : %s\n �μ��̸� : %c\n �Ի缺�� : %.1f\n" ,eno,ename,dept,score);
	}

}
