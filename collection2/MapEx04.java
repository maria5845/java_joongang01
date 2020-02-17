package collection2;
import java.util.*;

public class MapEx04 {

	public static void main(String[] args) {
		Book2 bk1 = new Book2("java", "kim", 100);
		Book2 bk2 = new Book2("oracle", "lee", 200);
		Book2 bk3 = new Book2("html", "park", 300);
		Map<String, Book2> map = new HashMap<String, Book2>();
	    map.put(bk1.getTitle(),bk1);                                                               
	    map.put(bk2.getTitle(),bk2);                                                               
	    map.put(bk3.getTitle(),bk3);  
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("찾을 책이름을 입력하세용 : ");
	    String title = sc.next();
	    
	    if(map.get(title)==null) {
	    	System.out.println("찾는 도서가 없어요...");
	    }else {
	    	System.out.println(map.get(title).getTitle());
	    	System.out.println(map.get(title).getAuthor());
	    	System.out.println(map.get(title).getPage());
	    }
	}

}
