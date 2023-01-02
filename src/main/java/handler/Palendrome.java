package handler;

import java.util.Scanner;

public class Palendrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string- ");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		boolean isPalendrome = checkStringPalendrome(arr);
		System.out.println(isPalendrome);

	}

	public static boolean checkStringPalendrome(char[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == arr[arr.length - i - 1]) {

			} else {
				return false;
			}

		}
		return true;
	}
}
