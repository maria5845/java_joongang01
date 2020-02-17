package constructor;

public class ConstructorEx02 {
	public ConstructorEx02() {
		System.out.println("default constructor"); // 4

	}

	public ConstructorEx02(String str) {
		this(str, 10); // 2
		System.out.println(str + " constructor"); // 6
	}

	public ConstructorEx02(String str, int n) {
		this(); // 3
		System.out.println(str + n + " contstuctor"); // 5
	}

	public static void main(String[] args) {
		new ConstructorEx02(); //1 
		System.out.println("ooo"); // 7
	}

}
//----------------------------
//public class ConstructorEx02 {
//
//	public ConstructorEx02() {
//		this("������", 10);//2 
//		System.out.println("default constructor"); // 2�� ¥���� ����ϰ� 
//
//	}
//    public ConstructorEx02(String str ) {
//    	System.out.println(str+" constructor"); // 4 �Ű����� �ϳ�¥���� ã���� �� 
//    }
//    public ConstructorEx02(String str, int n) {
//    	this(str);//3 �Ű����� 2��¥���� ã���� �� 
//    	System.out.println(str+n+" contstuctor"); // 1��¥���� ȣ���Ϸ� �� 5 
//    }	
//
//	public static void main(String[] args) {
//		new ConstructorEx02(); //1 // ���� ���� ����
//		System.out.println("ooo"); // 7 ������ ����Ʈ ���� ��� 
//	}
//
//}
