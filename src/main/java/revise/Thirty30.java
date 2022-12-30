package revise;

public class Thirty30 {
//Take array and display element from both side at consecutive places
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length / 2; i++) {
			System.out.print(arr[i] + " " + arr[arr.length - 1 - i] + " ");
		}
	}
}
