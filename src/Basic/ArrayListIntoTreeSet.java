package Basic;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListIntoTreeSet {

	public static void main(String[] args) {
		ArrayList h1 = new ArrayList();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(20);
		h1.add(10);
		TreeSet t1=new TreeSet(h1);
		System.out.println(t1);
	}

}
