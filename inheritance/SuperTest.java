package inheritance;

public class SuperTest {
   private String name;
   private String addr;
   public SuperTest() {
	   super();
	   
   }
   public SuperTest(String name, String addr) {
	   super();
	   this.name=name;
	   this.addr=addr;
	   
   }
   public String toString() {
	   return "이름" + name + "주소" + addr ;
	   
   }
}
