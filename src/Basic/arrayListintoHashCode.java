package Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class arrayListintoHashCode {

	public static void main(String[] args) {
		ArrayList h1 = new ArrayList();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(20);
		h1.add(10);
		System.out.println("Array List accept duplicate" + h1);
		h1.remove(new Integer(10));//remove arryvalue
		System.out.println(h1);
		HashSet a1 = new HashSet(h1);
		System.out.println("Duplicate are removed" + a1);
		for (Object o1 : a1) {
			System.out.println(o1);
		}
		TreeSet t1=new TreeSet<>(h1);//
		System.out.println(t1);
		
	}
}
