package object;
/*
 * Ŭ���� �� person 
 * +name  :String // public ���� 
 * +age : int
 * +score : float 
 * +setPerson(n : String , a : int , s : float) :void
 * +viewPerson () : void
 */
//
//class person {
//	public String name; // ���� ����: �ɹ������� �ʵ��� ��
//	public int age;
//	public float score;
//
//	public void setPerson(String n, int a, float s) {
//		// �ɹ� �Լ�����, method
//
//		name = n;
//		age = a;
//		score = s;
//
//	}
//
//}

class Person{
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String n, int a, float s ) {
		this.name = n;
		this.age =a;
		this.score=s;
		 	} // 
	public void viewPerson() {
		
		System.out.println("�̸�"+name+"����"+age+"����"+score);
	}
	
}

public class ObjectEx01 {

	public static void main(String[] args) {
	Person ps = new Person(); // new person �� ������ �޸𸮸� �Ҵ��ϴ� �ν��Ͻ� 
	ps.setPerson("������",23,73.5f); // ps ��ü(�ʵ�� �޼����� ����) 
	ps.viewPerson();
   // hash ���� �ּҸ� �θ� 
    ps = new Person(); 
	ps.setPerson("�ε鷹",23,73.5f);
	ps.viewPerson();
	
	}

}
