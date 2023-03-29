package Basic;

import java.util.LinkedHashSet;


public class HelloWorld {

	public static void main(String[] args) {
		LinkedHashSet t1 = new LinkedHashSet();
		t1.add(20);
		t1.add(30);
		t1.add("hi");
		t1.add(20);
		t1.add(50);
		t1.add("bye");
		t1.add(60);
		System.out.println(t1);
	}

}
