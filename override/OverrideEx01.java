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
    Test01 ob = new Test02(); // 부모 클래스의 참조변수로 자식 객체 생성
    // 동적 바인딩 : 부모클래스를 거치고 자식 클래스가 있다면 자식 클래스로 접근 
    ob.view01();
    ob.view03();
		
		
		//    Test02 ob =new Test02();
//    ob.view01();
//    ob.view02();
//    ob.view03();
	}

}
