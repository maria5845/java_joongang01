package step05_�迭;
// call by reference : ������ ���� ����, ���� �ּ� ���� 

// ��ü �ڷ���, Ŭ���� ,�������̽� , �迭 , ������ 

public class MethodEx07 {

	public static void view1(String str) {// ���������Ϳ� ������ ����
		System.out.println("view1�� ������ str :" + str);
		str = "������";
		System.out.println("view1�� ������ str :" + str);
		// ���������� �� �������� ���ϴ� ���̽�
	}

	public static void view2(int[] num) {// ���������Ϳ� ������ ����
		for (int n : num) {
			System.out.print("view2�� num:" + n);

		}
		System.out.println();
		num[2] = 300;
		for (int n : num) {
			System.out.println("������ view2�� num:" + n);
		}
	}
	// C��� �迭���� �����ͷ�, �����Ϳ��� �迭�� ����
	// char test [] ---> �迭 ������

	public static void main(String[] args) {
		String str = "happy";
		System.out.println("ȣ���� stf : " + str);
		view1(str);// �Լ� ȣ��
		System.out.println("ȣ���� stf : " + str);

		int[] num = { 10, 20, 30, 40, 50 };
		for (int i : num)
			System.out.println("ȣ���� ������ num : " + num);
		view2(num);
		for (int i : num)
			System.out.println("ȣ���� ������ num : " + num);

	}

}
