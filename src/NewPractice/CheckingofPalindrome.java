package NewPractice;

import java.util.Scanner;

public class CheckingofPalindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner bru = new Scanner(System.in);
		System.out.println("Enter the number to check");
		String s1 = bru.next();
		String rev = "";
		int temp = s1.length();
		for (int i = temp - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println("The Entered number is a palindrome: " + rev);
		} else {
			System.out.println("not a palindrome");
		}
	}
}
