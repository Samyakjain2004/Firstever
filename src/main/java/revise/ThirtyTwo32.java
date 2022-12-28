package revise;

public class ThirtyTwo32 {
//Take 2 arrays and multiply consecutive places from last
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = { 6, 7, 8, 9 };
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i] * arr1[arr.length - i - 1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
