package Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class conversionOfHashintoArray {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		System.out.println(h1);
		ArrayList a1=new ArrayList(h1);
		System.out.println(a1);
		LinkedHashSet l1=new LinkedHashSet();
		l1.add("ragu");
		l1.add("nishu");
		l1.add("sudhi");
		System.out.println(l1);
	}

}
