package step02_������;

public class OperatorEx {

	public static void main(String[] args) {

		System.out.println(5 / 3); // ��
		System.out.println(5 % 3); // ������

		int a = 5;
		String str = "korea";
		System.out.println(a == 5);
		System.out.println(a >= 5);
		System.out.println(a != 5);

		System.out.println(str == "korea" || str == "KOREA");
		// �տ� ���� ���̸� �ڿ� ���� �ڵ� �����Ѵ�

		int score = 57;

		System.out.println(score == 70 && score == 90);
		// �տ� ���� �����̸� �ڿ� ���� �ڵ� �����Ѵ�
		// �������� �κ��� �����ϴ� ���� && , �������� ||

		int c = 57;
		boolean sw = (c >= 70 && c < 90);
		System.out.println(sw);

		int k = 5;

		System.out.println(k++); // 5�� �������� �޸𸮿��� 6�� ����� ����������
		// for �������� ���� �����ڸ� �����
		System.out.println(++k);// 7�� ������ ������ �޸𸮵� 7
		System.out.println(k);
		System.out.println(--k); // 6���� ������ ������ �޸𸮵� 6
		System.out.println(k--); // 6���� ������ ������ �޸𸮿��� 5�� �����

		int p = 3;
		p += 2;
		p *= 3;
		p -= 2;
		p %= 3;
		System.out.println(p);

		char code = '��';
		String gender;

		gender = (code == 'M' || code == '��') ? "man" : "woman";
		// �º��� �ڷ����� ������
		System.out.println(gender);

		boolean ck = true;
		System.out.println(!ck);

		// ������ �ʱ�ȭ

		String o = null; // �ΰ��� �� default String o = "";
		int u = 0;
		// int�� ���� 0���� default
		float t = 0.0f;
		char e = '\0';// \0 �ι��ڶ����.

		System.out.println(o + u + t + e);

	}

}
