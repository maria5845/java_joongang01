package step05_�迭;

public class MathodEx06 {

	public static int total(int toeic, int it) {
		
		toeic=800;
		return toeic + it;

	}

	public static String rs(int total) {
		if (total >= 800) {
			return "�հ�";
		} else {
			return "���հ�";
		}
	}

	public static void main(String[] args) {
		int toeic = 750, it = 65;
		System.out.println("�Ի����� :" + total(toeic, it) + "��");
		System.out.println("�Ի��� : " + rs(total(toeic, it)) + "�Դϴ�");
		System.out.println(toeic);
	}

}
