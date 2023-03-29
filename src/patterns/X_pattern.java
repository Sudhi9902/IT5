package patterns;

public class X_pattern {

	public static void main(String[] args) {
		int x=10;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				if (j == i||(i+j==x+1)) {
					System.out.print("Sd" + " ");
				}else {
					System.out.print(" "+" ");
				}
			}

			System.out.println();
		}
	}

}
