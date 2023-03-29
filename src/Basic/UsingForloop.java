package Basic;

import java.util.ArrayList;

public class UsingForloop {

	public static void main(String[] args) {
		int sum = 0;
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("hello");
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(true);
		System.out.println(a1);
		for (int i = 0; i < a1.size(); i++) {
			Object a3 = a1.get(i);
			try {
				Integer a4 = (Integer) a3;
				sum += a4;
				System.out.println(a4);
			} catch (Exception e) {
				continue;
			}

		}
		System.out.println(sum);
	}

}
