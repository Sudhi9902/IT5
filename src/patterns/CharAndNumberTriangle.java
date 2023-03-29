package patterns;

public class CharAndNumberTriangle {

	public static void main(String[] args) {
		int m = 65;
		char c = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("@" + " ");
			for (int k = i; k <= 5; k++) {
				System.out.print((char) m++ + " ");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		char r = 'A';
		int k = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ");
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1) {
					System.out.print(r++ + " ");
				} else {
					System.out.print(k+++" ");
				}
			}
			System.out.println();
		}
	}

}
