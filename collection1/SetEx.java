package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set : �ߺ���� x, ���� ���� x 
public class SetEx {
	@SuppressWarnings(value = "unchecked") // type�� Ȯ������ ����
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one"); // add(Object)
		set.add(2); // int ---> new Integer(2) : �⺻�� ---> ��ü�� Boxing
		set.add(new Float(3.0f));
		set.add(4.00);
	    set.add(2);
	    set.add(new Integer(2));
	    set.add(new Double(4.00));
	    set.add(Integer.valueOf(2));
	    
	    Iterator iter = set.iterator();
	    while(iter.hasNext())
	    	System.out.println(iter.next());
	}

}
