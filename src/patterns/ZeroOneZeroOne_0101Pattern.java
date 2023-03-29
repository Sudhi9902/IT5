package patterns;

public class ZeroOneZeroOne_0101Pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i % 2 == 0) {
					System.out.print(j % 2+" ");
				} else if (j % 2 == 1) {
					System.out.print("0"+" ");
				}else {
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}

	}

}
