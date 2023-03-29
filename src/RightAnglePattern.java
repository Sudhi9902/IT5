
public class RightAnglePattern {

	public static void main(String[] args) {
		char a = 'A';
		for (int i = 1; i <= 8; i++) {
			System.out.println(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
				// if ( i % 2 == 0) {
				if (j % 2 == 0 && i % 2 == 0) {
					System.out.print(a + "  ");
				} else {
					System.out.print("1" + "  ");
				}
			}
//			for (int i1 = 8; i1 >= 1; i1--) {
//				System.out.println(" ");
//				for (int j = 1; j <= i1; j++) {
//					System.out.print(" ");
//					// if ( i % 2 == 0) {
//					if (j % 2 == 0 && i1 % 2 == 0) {
//						System.out.print("0" + "  ");
//					} else {
//						System.out.print("1" + "  ");
//					}
//				}
			System.out.println();
		}

	}
}
