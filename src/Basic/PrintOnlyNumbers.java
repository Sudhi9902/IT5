package Basic;

import java.util.ArrayList;

public class PrintOnlyNumbers {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Comparable> a1 = new ArrayList<Comparable>();
		a1.add(10);
		a1.add("hello");
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(true);
		System.out.println(a1);
		for (Object a2 : a1) {
			try {
				Integer a3 = (Integer) a2;
				sum += a3;
				System.out.println(a2);
			} catch (Exception e) {
				continue;
			}

		}
		System.out.println(sum);
	}
}
