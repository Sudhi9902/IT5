


import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
