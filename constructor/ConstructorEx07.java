package constructor;
 class Memeber{
	private String name;
	private int age;
	public Memeber(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public void view() {
		System.out.println("�̸� : " + name);
		System.out.println("���� :"  + age);
	}
}

public class ConstructorEx07 {

	public static void main(String[] args) {
		Memeber ob1 = new Memeber("������", 22);
		ob1.view();

	}

}
