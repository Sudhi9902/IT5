import java.util.ArrayList;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10 };
		int c[] = new int[5];
		ArrayList<Integer> a1 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
			a1.add(c[j]);
		}
		System.out.println(a1);
	}
}
