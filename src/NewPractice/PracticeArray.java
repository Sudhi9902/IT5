package NewPractice;

public class PracticeArray {

	public static void main(String[] args) {
		// print only the duplicate values in the array
		System.out.println("print only the duplicate values in the array");
		int a[] = { 1, 2, 2, 4, 5, 6, 5, 4 };
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		System.out.println("====================================================");
		System.out.println("Compare elements of array with max and sum max number");
		int arr[] = new int[] { 25, 11, 7, 75, 56 };
		int[] b = new int[arr.length];
		int max = arr[1];
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with max
			if (arr[i] > max)
				b[i] = arr[i];
		}
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
			System.out.println(b[i]);
		}
		System.out.println("Largest element sum in given array: " + sum);
		System.out.println("====================================================");
	}

}
