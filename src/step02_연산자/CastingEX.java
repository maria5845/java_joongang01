package step02_������;

//2020.02.05
public class CastingEX {

	public static void main(String[] args) {
		int pay = 857650;
//		double tax = 0.033;
		int tax =(int) 0.033;
		//�º��� �캯�� ũ�Ⱑ ��ġ�ϵ��� �Ѵ�. 
		int rpay = pay - (int) (pay * tax);

		System.out.println("�Ǽ��ɾ� : " + rpay);

//		int k = 87, e = 88, m = 75;
//		int tot = k + e + m;
//      double avg = tot/3;
//		double avg = tot / 3.0;
//
//		System.out.println("���� : " + tot);
//		System.out.printf("��� : %.2f " ,avg);
	}

}
