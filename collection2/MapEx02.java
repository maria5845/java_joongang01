package collection2;
import java.util.HashMap;
import java.util.Map;

public class MapEx02 {

	public static void main(String[] args) {
		@SuppressWarnings(value = "unchecked")
		Map<String,Integer> map =  new HashMap<String,Integer>();
		
		map.put("�ظ�����", Integer.valueOf(95));
		map.put("��", Integer.valueOf(75));
		map.put("�츣�̿´�", Integer.valueOf(85));
		map.put("������", Integer.valueOf(88));
		map.put("����", Integer.valueOf(93));
		map.put("�׺��չ���", Integer.valueOf(66));
		map.put("�ظ�����", Integer.valueOf(85)); // �ߺ���� ����
		map.put(null, Integer.valueOf(95)); // Ű�� �� ��� ����
		map.put("�����Ʈ", null);// ���� �� ��� ���� 
		System.out.println(map);
		
		Integer num = map.get("������");
		System.out.println("������ ������ " + num);
		
//		int n = num.intValue();// ��ڽ��̶���� 
     	int n = new Integer(num);// �����ڽ� 
		System.out.println(n);
	}

}
