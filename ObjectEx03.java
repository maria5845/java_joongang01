package object;
//setter & getter -> 맴버 변수 하나당 하나씩 값을 대입하는 setter 와 
//그 값을 리턴하는 getter 

// 하나씩 받아주는 set함수 setName;


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
          ob.setName("강호동");
          ob.setAge(25);
          ob.setTall(178.8);
          System.out.println("이름"+ob.getName());
          System.out.println("나이"+ob.getAge());
          System.out.println("신장"+ob.getTall());
	}

}
