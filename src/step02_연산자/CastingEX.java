package step02_연산자;

//2020.02.05
public class CastingEX {

	public static void main(String[] args) {
		int pay = 857650;
//		double tax = 0.033;
		int tax =(int) 0.033;
		//좌변과 우변의 크기가 일치하도록 한다. 
		int rpay = pay - (int) (pay * tax);

		System.out.println("실수령액 : " + rpay);

//		int k = 87, e = 88, m = 75;
//		int tot = k + e + m;
//      double avg = tot/3;
//		double avg = tot / 3.0;
//
//		System.out.println("총점 : " + tot);
//		System.out.printf("평균 : %.2f " ,avg);
	}

}
