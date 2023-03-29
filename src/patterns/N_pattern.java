package patterns;

public class N_pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (j == 1 || j == 5 || j == i) {// for N pattern
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

}
