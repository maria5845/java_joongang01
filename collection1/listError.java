package collection1;
import java.util.*;

public class listError  {
	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(new Integer(4));
		list.add("�ܿ�");
		list.add(5.0f);
		list.add(4.0);
		
		for (int i= 0; i<list.size(); i ++) {
			Object season=list.get(i);
			System.out.println(season);
		}
}
}