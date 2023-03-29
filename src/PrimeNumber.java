


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		try (Scanner br = new Scanner(System.in)) {
			System.out.println("enter the value");
			int a = br.nextInt();
			System.out.println("enter the end range value");
			int b = br.nextInt();
			int temp=a;
			int count = 0;
			for (int i = 2; i < b; i++) {
				if (a % i == 0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(temp+"="+"is a Prime number");
			}
			else {
				System.out.println(temp+"is not a pime number");
			}
		}
	}
}
