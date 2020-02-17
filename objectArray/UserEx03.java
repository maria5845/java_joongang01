package objectArray;
// 오브젝트 배열-2
public class UserEx03 {

	public static void main(String[] args) {
		User[] ob = new User[]{
			new User("김", "010-5555-6666"),
			new User("박", "010-6666-7777"),
			new User("이", "010-7777-8888")
			
		};
	
		for(User i : ob) {
			System.out.println(i.getName()+"\t"+i.getPhone());
			
		}
		
		
		}

	}

