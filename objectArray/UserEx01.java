package objectArray;

public class UserEx01 {

	public static void main(String[] args) {
     User ob1= new User("±è","010-5555-6666");
     User ob2= new User("¹Ú","010-6666-7777");
     User ob3= new User("ÀÌ","010-7777-8888");
     System.out.println(ob1.getName()+"\t"+ob1.getPhone());
     System.out.println(ob2.getName()+"\t"+ob2.getPhone());
     System.out.println(ob3.getName()+"\t"+ob3.getPhone());
	}

}
