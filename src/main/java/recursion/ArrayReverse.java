package recursion;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		
		methodReverse(arr,  0);
		
	}

	private static void methodReverse(int[] arr, int i) {
		if (i > arr.length - 1) {
			return;
		}
		
		
		methodReverse(arr, i + 1);
		System.out.println(arr[i]);
	}

}
