
public class Npattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {//for Z pattern
		//	for (int j = 1; j <= 5; j++) {//for Reverse zpattern
				if(j==i||i==1||i==5) {
				//if (j == 1 || j == 5 || j == i) {//for N pattern
					System.out.print("z"+ " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
