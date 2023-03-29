package StarPatterns;

public class LanuchEmptyBrowser {

	public static void main(String[] args) {
		String s = "SUDARSHAN";
//		int count = 0;
		char b;
		for (char c = 'Z'; c >= 'A'; c--) {
			int count = 0;
			for (int i = 0; i <= s.length() - 1; i++) {
				b = s.charAt(i);
				//int count = 0;
				if (b == c) {
					count++;
					System.out.println(b+" the alphabet count" + count);
				}
			}
		}
//		System.out.println(" the alphabet count" + count);

	}

}
