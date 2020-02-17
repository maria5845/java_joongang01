package collection1;
import java.util.*;

public class listEx03  {

	public static void main(String[] args) {
		
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("oracle", "lee", 200);
		Book bk3 = new Book("html", "park", 300);
	
    List<Book> list = new ArrayList<Book>();
    list.add(bk1);
    list.add(bk2);
    list.add(bk3);
    
    for(Book ob :list) {
    	System.out.println("å�̸� :" +ob.getTitle());
    	System.out.println("å���� :" +ob.getAuthor());
    	System.out.println("������ :" +ob.getPage());
    }
    
	Iterator<Book> iter= list.iterator();
	while (iter.hasNext()) {
	Book ob= iter.next();
	System.out.println("å�̸� :" +ob.getTitle());
	System.out.println("å���� :" +ob.getAuthor());
	System.out.println("������ :" +ob.getPage());
    
}
	System.out.println(list.size());
    System.out.println("å�̸�" +list.get(0).getTitle());
    System.out.println("å����" +list.get(0).getAuthor());
    System.out.println("������" +list.get(0).getPage());
}
}