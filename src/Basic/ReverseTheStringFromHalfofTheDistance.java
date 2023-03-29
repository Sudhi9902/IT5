package Basic;

import java.util.Scanner;

public class ReverseTheStringFromHalfofTheDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String s = sc.next();
		String rev = "";
		for (int i = s.length() - 1; i >= (s.length() / 2); i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
