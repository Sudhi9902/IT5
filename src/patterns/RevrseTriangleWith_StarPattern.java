package patterns;

public class RevrseTriangleWith_StarPattern {

	public static void main(String[] args) {
		char b='A';
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				if (j == 1 || j == 5 || j == i) {
					System.out.print(b++ + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
		//====================================================================
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 10; j++) {
				if (j == 1 || j == 5 || j == i) {
					System.out.print(b++ + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}

	}

}
