package revise;

import java.util.Scanner;

public class ThirtyFive35 {
//program that prompts the user to input an integer and then outputs the number with the digits reversed.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int l = sc.nextInt();

		int[] arr = new int[l];
		int[] arr1 = new int[arr.length];
		int y = 0;

		for (int i = 0; i < l; i++) {
			System.out.println("arr[" + i + "]");
			int x = sc.nextInt();
			arr[i] = x;
		}

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[arr.length - 1 - i];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
