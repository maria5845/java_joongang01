package collection2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class MapEx03 {

	public static void main(String[] args) { 
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(3,"���̸�");
		map.put(1,"���α�");
		map.put(4,"��ī��");
		map.put(2,"�Ḹ��");
	   System.out.println(map);
	   
//	   Set<Integer> keys =map.keySet();
//	   for(Integer n : keys ){
//		   System.out.println(map.get(n));
	   Set<Integer> keys =map.keySet(); // ��ȣ ������ ���� Ű�� ������ 
	   List<Integer> list = new ArrayList<Integer>(keys); // ����Ʈ ������ �������ְ� 
//	    System.out.println(list);
		  Collections.sort(list); // �������ִ� �ڹ� ��ƿ 
		  for (Integer n :list) // ���� �� ����Ʈ�� ���� �������� ����Ѵ� 
			  System.out.println(map.get(n));
	   }
	}


