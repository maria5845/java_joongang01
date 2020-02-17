package object;
/*
 * 클래스 명 person 
 * +name  :String // public 먼저 
 * +age : int
 * +score : float 
 * +setPerson(n : String , a : int , s : float) :void
 * +viewPerson () : void
 */
//
//class person {
//	public String name; // 변수 선언: 맴버번수임 필드라는 말
//	public int age;
//	public float score;
//
//	public void setPerson(String n, int a, float s) {
//		// 맴버 함수정의, method
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
		
		System.out.println("이름"+name+"나이"+age+"점수"+score);
	}
	
}

public class ObjectEx01 {

	public static void main(String[] args) {
	Person ps = new Person(); // new person 힙 영역에 메모리를 할당하는 인스턴스 
	ps.setPerson("개나리",23,73.5f); // ps 객체(필드와 메서드의 조합) 
	ps.viewPerson();
   // hash 참조 주소를 부름 
    ps = new Person(); 
	ps.setPerson("민들레",23,73.5f);
	ps.viewPerson();
	
	}

}
