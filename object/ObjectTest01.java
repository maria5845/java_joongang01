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
	   System.out.println(name+"��"+dept+"����"+sal+"�� �޿��� �ް�"
	   	         +"�ٹ����̴�"	   );
   }
	
	
}
public class ObjectTest01 {

	public static void main(String[] args) {
     Emp ep =new Emp();
     ep.setEmp("ȫ�浿", "���ߺ�", 1520000);
     ep.printEmp();
	}

}
