package collection1;

import java.util.*;
import java.util.ArrayList;

public class listEx02 {
// ���ӵ� ��� ���� ���� �ٸ� �ڷ���, �ߺ����, ��������
	@SuppressWarnings(value = "unchecked")

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(5.0f);
		// System.out.println(list);
		list.remove("second");
		Iterator iter = list.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
