package objectArray;

public class UserEx02 {

	public static void main(String[] args) {
		User[] ob = new User[3];
		ob[0] = new User("��", "010-5555-6666");
		ob[1] = new User("��", "010-6666-7777");
		ob[2] = new User("��", "010-7777-8888");
		
		for(int i = 0; i<ob.length;i++) {
			
		System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());	
			
		}

	}

}
