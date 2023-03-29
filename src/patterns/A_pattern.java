package patterns;

import java.time.LocalDateTime;

public class A_pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1||j==5) {
					System.out.print("#" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
//		LocalDateTime SystemDateTime = LocalDateTime.now();
//		System.out.println(SystemDateTime.getDayOfMonth());
//		System.out.println(SystemDateTime.getMonthValue());
//		System.out.println(SystemDateTime.getHour());
//		System.out.println(SystemDateTime);
//=============================================================================
		String s1 = "sum";
		for (int i = 0; i <= s1.length() - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s1.charAt(j) + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= s1.length(); i++) {
			System.out.print("" + "  ");
			for (int j = i; j <= s1.length() - 1; j++) {
				System.out.print(s1.charAt(j) + " ");
			}
			System.out.println();

		}
		System.out.println("============================================");
		for (int i = 0; i <= s1.length() - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s1.charAt(j) + " ");
			}
			System.out.println();

		}
		for (int i = s1.length(); i < 5; i++) {
			System.out.print("  ");
			for (int j = 2; j < 3; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

}
