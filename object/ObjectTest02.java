package object;

class Emp2 {
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
public class ObjectTest02 {

	public static void main(String[] args) {
     Emp2 ep =new Emp2();
     ep.setEmp("ȫ�浿", "���ߺ�", 1520000);
     ep.printEmp();
	}

}
