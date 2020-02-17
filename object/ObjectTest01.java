package object;

class Emp {
	private String name;
	private String dept;
	private int sal;

	public void setEmp(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.sal = sal;

	}
   public void printEmp() {
	   System.out.println(name+"은"+dept+"에서"+sal+"의 급여를 받고"
	   	         +"근무중이다"	   );
   }
	
	
}
public class ObjectTest01 {

	public static void main(String[] args) {
     Emp ep =new Emp();
     ep.setEmp("홍길동", "개발부", 1520000);
     ep.printEmp();
	}

}
