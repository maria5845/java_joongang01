package step05_�迭;

public class MethodEx08 {

	
	public static void view1() {
		
		System.out.println("static mathod");
		//static ���� 
	}
	
	public void view2() {
		//static ������ 
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
         
		view1();//�⺻ ȣ�Ⱑ�� -> �ڱ��ڽ��� �޼��忡 �����Ҷ��� Ŭ���� �̸� ������ ���� 
		
		
		//Ŭ������ ������Ʈ�� �ν��Ͻ� 
		
		MethodEx08 ob = new MethodEx08();
		ob.view2();//�⺻ ȣ���� �Ұ��� / �ν��Ͻ� �޼��� 
		//�ν��Ͻ� �޼���� �ݵ�� ��ü�� �����ϰ� �ż��带 ȣ�� 
		
		
	}

}
