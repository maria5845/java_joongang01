package constructor;
// ������ : Ŭ���� �̸��� ������ �޼����� ����, ���� �ڷ����� ���� 
// ������ �� ��ü������ ��� �� 
public class ConstructorEx01 {
	public ConstructorEx01() {
		System.out.println("default consturctor");
	}

	public  ConstructorEx01(String str) {
		System.out.println(str + "constructor");
	}

	
	
	
	public static void main(String[] args) {
		new ConstructorEx01();
		new ConstructorEx01("������");
	}

}
