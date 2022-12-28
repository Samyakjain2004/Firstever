package revise;

import java.util.Scanner;

public class ThirtySix36 {
//program that reads a set of integers, and then prints the sum of the even and odd integers.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total number to be entered- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number-");
			int x = sc.nextInt();
			arr[i] = x;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even = even + arr[i];
			} else {
				odd = odd + arr[i];
			}
		}
		System.out.println("Sum of even terms- " + even);
		System.out.println("Sum of odd terms- " + odd);
	}
}
