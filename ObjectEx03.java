package object;
//setter & getter -> �ɹ� ���� �ϳ��� �ϳ��� ���� �����ϴ� setter �� 
//�� ���� �����ϴ� getter 

// �ϳ��� �޾��ִ� set�Լ� setName;


class Member {
	
	private String name;
	private int age;
	private double tall;
	
	public void setName (String name) {
		this.name= name ;
	}
	public void setAge (int age) {
		this.age= age ;
	}
	public void setTall (double tall) {
		this.tall= tall ;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	public double getTall() {
		return tall;
		
		
	}
	
}

public class ObjectEx03 {

	public static void main(String[] args) {
          Member ob = new Member();
          ob.setName("��ȣ��");
          ob.setAge(25);
          ob.setTall(178.8);
          System.out.println("�̸�"+ob.getName());
          System.out.println("����"+ob.getAge());
          System.out.println("����"+ob.getTall());
	}

}
