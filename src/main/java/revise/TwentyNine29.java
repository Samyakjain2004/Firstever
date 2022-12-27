package revise;

public class TwentyNine29 {
//To add 2 arrays at consecutive places
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] arr1 = { 4, 5, 6 };
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i] + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
