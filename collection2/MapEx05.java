package collection2;
import java.util.*;

public class MapEx05 {

	public static void main(String[] args) {
		Map< String, String> map =  new HashMap <String,String>();
		map.put("�Ѹ�","����1");
		map.put("��ġ","����2");
		map.put("������","����3");
		map.put("��浿","����4");
		map.put("�����","����5");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸��� �Է��ϼ��� (����1~3) : ");
	    String room = sc.next();
	    Set<String> keys =map.keySet(); 
	    
	    for(String key : keys) {
	    	String rom = (String)map.get(key);
	    	if(rom.equals(room)) {
	    		System.out.println(room+"�� �ִ� ����ڴ� "+key+"�Դϴ�.");
	    	}
	    }
	}

}
