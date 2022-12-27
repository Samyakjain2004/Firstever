package revise;

import java.util.Scanner;

public class TwentySix26 {
//To add number in an array at last
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int[] arr1 = new int[arr.length + 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be added at last-");
		int n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr1.length - 1] = n;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
