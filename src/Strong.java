
import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		System.out.println("enter a value");
		try (Scanner s1 = new Scanner(System.in)) {
			for (int j = 1; j <= 1000; j++) {
				int num = j;
				int temp = num;
				int sum = 0;
				while (num > 0) {
					int fact = 1;
					int rem = num % 10;
					for (int i = rem; i >= 1; i--) {
						fact = fact * i;
					}
					sum = sum + fact;
					num = num / 10;
				}
				if (sum == temp) {
					System.out.println(temp + " is strong number ");
				} else {
					System.out.println(temp + " is not Strong number ");
				}
			}
		}
	}
}
