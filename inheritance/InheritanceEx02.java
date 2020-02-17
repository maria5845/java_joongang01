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
	 * this.변수
	 * this()
	 * this(인자,인자...)---자기자신의 생성자 홏출 
	 * 
	 * super.변수
	 * super.메서드() 
	 * super() 
	 * super(인자,인자...) => 부모 생성자 호출 
	 */

}
