package Basic;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteratorMethod {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("hello");
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(20.66);
		a1.add(true);
		System.out.println(a1);
		Iterator var = a1.iterator();
		while (var.hasNext()) {
			System.out.println(var.next());
		}
	}
}
