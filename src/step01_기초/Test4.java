package step01_����;

public class Test4 {
	/*
	 * ���� ������ �����Ͽ� ����ϼ��� �̸� : �̼��� ���� : 25�� �μ� : ���ߺ� ���� : 87.4��
	 */
	public static void main(String[] args) {
		String name = "�̼���";
		int age = 25;
		String part = "���ߺ�";
		float score = 87.5f;

		System.out.println("�̸� :" + name);
		System.out.print("���� :" + age + "��\n");
		System.out.printf("�μ� :%s\n" + "���� :%.1f�� ", part, score);

	}

}
