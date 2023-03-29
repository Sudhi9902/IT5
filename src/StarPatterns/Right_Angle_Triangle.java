package StarPatterns;
/***
 * 
 * @author sudarshan
 *
 */
public class Right_Angle_Triangle {
	public static void main(String[] args) {
		System.out.println("Rigth-angle triangle");
		int row = 5;
		// For printing Right angle Triangle
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println("Rectangle-Pattern");
		int row1 = 5;
		// For printing Rectangle
		int column = 5;
		for (int i = 1; i <= row1; i++) {
			for (int j = 1; j <= column; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		System.out.println("Reverse triangle pattern");
		for (int i = 1; i <= row1; i++) {
			// For printing reverse Trinagle
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + " ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		for (int i = row1; i >= 1; i--) {
			// For printing opposite Trinagle
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + " ");
			}
			for (int k = i; k <= column; k++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		for (int i = row; i >= 1; i--) {
			// for printing reverse right angle
			for (int j = 1; j <= i; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println("pyramid-pattern");
		// For printing pyramid
		for (int i = 1; i <= row1; i++) {
			for (int j = i; j < column; j++) {
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("#" + " ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("=========================================");
		System.out.println("Hollow rectangle pattern");
		// For printing hollow rectangle
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == 1 || j == 5 || i == 5 || j == 1) {
					System.out.print("#" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		System.out.println("============================================");
		System.out.println("Reverse pyramid pattern");
		// For reverse printing pyramid
		for (int i = row1; i >= 0; i--) {
			for (int j = i; j < column; j++) {
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("#" + " ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.println("diamond-pattern");
		for (int i = 1; i <= row; i++) {
			System.out.print(" ");
			for (int j = i; j <= column; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#" + ' ');
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			System.out.print(" ");
			for (int j = i; j <= column; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#" + ' ');
			}
			System.out.println();
		}
		System.out.println("=================================");
		System.out.println("Trapezoidal-pattern");
		int space = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < column; k++) {
				System.out.print("#  ");
			}
			System.out.println();
			space++;
		}
	}
}
