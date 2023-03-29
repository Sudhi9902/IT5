package Basic;

import java.util.ArrayList;

public class NewArrayListAddition {

	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		for (Object a2 : a1) {
			int a3 = (int) a2;
			sum = sum + a3;
			System.out.println(a3);
		}
		System.out.println(sum);
	}

}
