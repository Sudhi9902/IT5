package NewPractice;

public class SwapingOfNumberWithoutVariable {

	public static void main(String[] args) {
		// Swaping of two number without using third variable
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
