package collection1;

import java.util.*;
import java.util.ArrayList;

public class listEx01 {
// ���ӵ� ��� ���� ���� �ٸ� �ڷ���, �ߺ����, ��������
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
		// System.out.println(list);
		for (Object ob : list) {
			System.out.println(ob);
		}
		Iterator iter = list.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
