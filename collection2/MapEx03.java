package collection2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class MapEx03 {

	public static void main(String[] args) { 
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(3,"파이리");
		map.put(1,"꼬부기");
		map.put(4,"피카츄");
		map.put(2,"잠만보");
	   System.out.println(map);
	   
//	   Set<Integer> keys =map.keySet();
//	   for(Integer n : keys ){
//		   System.out.println(map.get(n));
	   Set<Integer> keys =map.keySet(); // 번호 지정을 위한 키를 설정함 
	   List<Integer> list = new ArrayList<Integer>(keys); // 리스트 공간을 생성해주고 
//	    System.out.println(list);
		  Collections.sort(list); // 정렬해주는 자바 유틸 
		  for (Integer n :list) // 정렬 된 리스트를 향상된 포문으로 출력한다 
			  System.out.println(map.get(n));
	   }
	}


