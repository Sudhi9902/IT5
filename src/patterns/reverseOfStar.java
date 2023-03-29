package patterns;

public class reverseOfStar {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j < 5; j++) {
				if ( i==2&&j==4 ) {
					System.out.print(j + " ");
				}
				else if(j==2&&j==3&&i==3) {
					System.out.println(j+" ");
				}
				else {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}

	}

}
