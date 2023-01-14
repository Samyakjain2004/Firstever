package recursion;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string- ");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();

		methodReverse(arr, 0);
	}

	public static void methodReverse(char[] arr, int i) {
		if (i > arr.length - 1) {
			return;
		}
		methodReverse(arr, i + 1);
		System.out.println(arr[i]);
	}
}
