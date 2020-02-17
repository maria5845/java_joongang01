package object;

/*
 * -(private) + (public) + (protect)
 * +name : String 
 * +k : int
 * +e : int
 * +n : int 
 * 
 * +setUser(name:String, k :int , e:int , m:int) :void 
 * +getTotal() :int
 * +getUser():String 
 */
public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	public int tot;

	public void setUser(String n, int k, int e, int m) {
		this.name = n;
		this.k = k;
		this.e = e;
		this.m = m;

	}

	public int getTotal() {
	
		return k+e+m;

	}

	public String getUser() {
		return "이름은 "+name+"이고\n"+"총점은"+getTotal()+"입니다";

	}

}
