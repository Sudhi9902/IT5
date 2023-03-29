package patterns;

public class ReverseRightAngleTriangle {

	public static void main(String[] args) {
		int a = 5+3;
		char b = 'A';
		for (int i = 1; i <=5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1) {
					System.out.print(a-- + " ");
				} else {
					System.out.print(b++ + " ");
				}
			}
			System.out.println();
		}
		int c = 5+3;
		char d = 'G';
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1||i==1) {
					System.out.print(c-- + " ");
				} else {
					System.out.print(d++ + " ");
				}
			}
			System.out.println();
		}
	}

}
