package inheritance;

class parentEx {
	public parentEx() {
		System.out.println("parent class ");
	}

}

class childEx extends parentEx {
	public childEx() {
		System.out.println("child clas");
	}
}

public class InheritanceEx02 {

	public static void main(String[] args) {
		new childEx();

	}
	
	/*
	 * this.����
	 * this()
	 * this(����,����...)---�ڱ��ڽ��� ������ �M�� 
	 * 
	 * super.����
	 * super.�޼���() 
	 * super() 
	 * super(����,����...) => �θ� ������ ȣ�� 
	 */

}
