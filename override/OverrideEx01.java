package override;
class Test01{
	
	public void view01() {System.out.println("view1 method");}
	public void view03() {System.out.println("view3 method");}
}
class Test02 extends Test01{
	
	@Override
	public void view01() {System.out.println("view11 method");}
	public void view02() {System.out.println("view2 method");}
}
public class OverrideEx01 {

	public static void main(String[] args) {
    Test01 ob = new Test02(); // �θ� Ŭ������ ���������� �ڽ� ��ü ����
    // ���� ���ε� : �θ�Ŭ������ ��ġ�� �ڽ� Ŭ������ �ִٸ� �ڽ� Ŭ������ ���� 
    ob.view01();
    ob.view03();
		
		
		//    Test02 ob =new Test02();
//    ob.view01();
//    ob.view02();
//    ob.view03();
	}

}
