package constructor;
/* 클래스명 UserInfo
 * -name : String 
 * -addr : String
 * +UserInfo()
 * +UserInfo(name:Stirng, addr:string)
 * +getter
 * 
 */

class UserInfo {
	private String name;
	private String addr;

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public UserInfo() {
		System.out.println("*******주소록******");

	}

	public UserInfo(String name, String addr) {
		this();
		this.name=name;
		this.addr=addr;
		
	}

}

public class ConstructorEx03 {

	public static void main(String[] args) {
		UserInfo ob = new UserInfo("도라에몽", "서울시 강남구");
		System.out.println("이름 " + ob.getName());
		System.out.println("주소 " + ob.getAddr());
	}

}
