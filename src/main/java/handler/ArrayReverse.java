package handler;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr1[arr.length - i - 1] = arr[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}
}
