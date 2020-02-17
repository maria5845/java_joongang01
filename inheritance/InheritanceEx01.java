package inheritance;


class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}


	
	
}
class SubEx extends SuperEx{
	public void show() {
		super.show();
		System.out.println("show2 method");}
	
	
	
}
public class InheritanceEx01 {

	public static void main(String[] args) {
    SubEx ob = new SubEx();
    ob.show();
   

    
    
	}

}
