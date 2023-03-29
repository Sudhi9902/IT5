package Basic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add("Hi");
		h1.add("hello");
		h1.add(10);
		System.out.println(h1);
		Iterator i1=h1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
