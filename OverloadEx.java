package object;

/*
 * overload method(�ߺ��Լ�) : ���� �̸��� �Լ� ������ ����
 * 1. �ݵ�� �Լ� �̸��� ���� 
 * 2. �Ű� ���� Ÿ�� �� �ٸ��ų� ������ �޶���� 
 */
public class OverloadEx {
	int x = 17;
	int y = 15;

	public int max() {

		return (x > y) ? x : y;

	}

	public int max(int x, int y) {

		return (x > y) ? x : y;

	}

	public float max(float x, float y) {

		return (x > y) ? x : y;

	}

	public static void main(String[] args) {
		OverloadEx ov = new OverloadEx();
		System.out.println("ū��:" + ov.max());
		System.out.println("ū�� :" + ov.max(75, 100));
		System.out.println("ū�� :" + ov.max(75.5f, 100.4f));
	}

}
