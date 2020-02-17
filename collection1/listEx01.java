package collection1;

import java.util.*;
import java.util.ArrayList;

public class listEx01 {
// 연속된 기억 공간 서로 다른 자료형, 중복허용, 순서유지
	@SuppressWarnings(value = "unchecked")

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(new Integer(4));
		list.add("겨울");
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
