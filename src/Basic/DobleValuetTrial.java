package Basic;

import java.util.ArrayList;
import java.util.Iterator;

public class DobleValuetTrial {

	public static void main(String[] args) {
		double sum = 0;
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("hello");
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(true);
		a1.add(20.66);
		System.out.println(a1);
		Iterator var = a1.iterator();
		
		while (var.hasNext()) {
			try {
				int a2 = (int) var.next();
				sum = sum + a2;
			} catch (Exception e) {
				
				continue;
			}

		}
	
		
		System.out.println(sum);
	}
}