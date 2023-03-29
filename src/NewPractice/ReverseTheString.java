package NewPractice;

public class ReverseTheString {

	public static void main(String[] args) {
		// Reverse of a String
		String s = "ELF2022SELENIUM";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
			// System.out.println( s.charAt(i));
		}
		System.out.println(rev);
		System.out.println();

		// Reverse of the String From Middle Value
		String s1 = "ELF2022SELENIUM";
		String rev1 = "";

		for (int i = s1.length() - 1; i >= (s1.length() / 2); i--) {
			rev1 = rev1 + s1.charAt(i);
		}
		System.out.println(rev1);
		System.out.println();
		// Extracing only the Numbers From The String
		String s2 = "ELF2022SELENIUM";
		String rev12 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9') {
				rev12 = rev12 + s2.charAt(i);
			}
		}
		System.out.println(rev12);
		System.out.println();
		// Extract Only the Alphabets From The String
		String s3 = "ELF2022SELasENIUM";
		String rev3 = "";
		String rev4 = "";
		for (int i = 0; i < s3.length(); i++) {
			if (s3.charAt(i) >= 'a' && s3.charAt(i) <= 'z') {
				rev3 = rev3 + s3.charAt(i);
			} else if (s3.charAt(i) >= 'A' && s3.charAt(i) <= 'Z') {
				rev4 = rev4 + s3.charAt(i);
			}
		}
		System.out.println("The small alphabet" + ": " + rev3);
		System.out.println();
		System.out.println("The big Alphabet: " + rev4);
		System.out.println();
		// Extract the number From String And revesrse that number
		String s5 = "ELF2022SELENIUM";
		String rev6 = "";
		String rev7 = "";
		for (int i = 0; i < s5.length(); i++) {
			if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9') {
				rev6 = rev6 + s5.charAt(i);
			}
		}
		for (int i = rev6.length() - 1; i >= 0; i--) {
			rev7 = rev7 + rev6.charAt(i);
		}
		System.out.println(rev6);
		System.out.println();
		System.out.println(rev7);
	
	}
}