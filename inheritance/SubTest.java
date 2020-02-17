package inheritance;

public class SubTest extends SuperTest {
	private int age;
	private double score;

	public SubTest() {
	 super();

	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
	}
    public String toString() {
    	return super.toString()+ "����"+age+"����"+score;
    	
    	
    	
    }


	public static void main(String[] args) {
    SubTest ob = new SubTest("ũ��", "����", 25, 83.5);
     System.out.println(ob.toString());
	}
}
