package revise;

public class TwentyEight28 {
//Take 2 array of characters and display it one by one alternatively
	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'e' };
		char[] arr1 = { 'b', 'd', 'f' };
		char[] arr2 = new char[arr.length + arr1.length];
		for (int i = 0; i < arr.length; i++) {

			arr2[i + i] = arr[i];

		}
		for (int i = 0; i < arr1.length; i++) {
			arr2[i + i + 1] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
