package handler;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseString {
	// using swap
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string-");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i]);

		// }
		System.out.println(Arrays.toString(arr));
	}
}
