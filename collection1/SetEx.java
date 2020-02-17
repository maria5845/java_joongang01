package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set : 중복허용 x, 순서 유지 x 
public class SetEx {
	@SuppressWarnings(value = "unchecked") // type을 확인하지 않음
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one"); // add(Object)
		set.add(2); // int ---> new Integer(2) : 기본형 ---> 객체형 Boxing
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
