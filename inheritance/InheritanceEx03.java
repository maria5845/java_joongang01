package inheritance;
// 접근 및 출력 순서 
class Branch {
	public Branch() {
		System.out.println("Branch default constructor");//5
	}

	public Branch(String str) {
		this();//4
		System.out.println(str + "Branch constructor");//6
	}

}

class Leaf extends Branch {
	public Leaf() {
		super("hi~");//3
		System.out.println("Leaf default constructor");//7
	}

	public Leaf(String str, int n) {
		this();//2
		System.out.println(str + " " + n + "Leaf constructor");
//8
	}
}

public class InheritanceEx03 {

	public static void main(String[] args) {
		new Leaf("가나다", 10); //1
		System.out.println("ooo");//9
	}

}
