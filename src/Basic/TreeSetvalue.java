package Basic;

import java.util.TreeSet;

public class TreeSetvalue {

	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(30);
		t1.add(20);
		t1.add(50);
		t1.add(60);
		System.out.println(t1);
		// t1.add(50.5);//Exception in thread "main" java.lang.ClassCastException: class
		// java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer
		// and java.lang.Double
		TreeSet t2 = new TreeSet();
		t2.add("hey");
		t2.add("Apple");
		t2.add("ball");
		t2.add("zebra");
		System.out.println(t2);
		System.out.println(t2.descendingSet());// DescendingOrder of a Set
		TreeSet t3 = new TreeSet();
		t3.add("Sharoon");
		t3.add("sudarshan");
		t3.add("Ankitha");
		t3.add("Bru");
		t3.add("Chan");
		t3.add("Nagendra");
		System.out.println(t3);

	}

}
