package Basic;

import java.util.HashSet;

public class ToRemoveDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,1,34,2,5};
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add("Hi");
		h1.add("hello");
		h1.add(10);
		System.out.println(h1);
		for(int i=0;i<a.length;i++) {
			h1.add(a[i]);
		}
		System.out.println(h1);
		for(Object o1:h1) {
			System.out.println(o1);
		}
	}

}
