package Basic;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		TreeMap t1=new TreeMap();
		t1.put(11, "Ameen");
//based on the first key value it is going
		t1.put(2, "Bru");
		t1.put(3,"Chan");
		t1.put(41, "Saagya");
		t1.put(5, "zebra");
		t1.put(61, "sony");
		t1.put(7, "Raksh");
		System.out.println(t1);
		Set s1=t1.keySet();
		for(Object o1:s1) {
			System.out.println(o1);
		}
		System.out.println("=================");
		 Collection val = t1.values();
		 System.out.println(val);
		 for(Object o2:val) {
			 System.out.println(o2);
		 }
		 System.out.println("=================");
	}

}
