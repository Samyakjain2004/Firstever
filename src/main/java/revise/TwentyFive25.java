package revise;

import java.util.Scanner;

public class TwentyFive25 {
//to add number in an array at start
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int[] arr1 = new int[arr.length + 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be added- ");
		int n = sc.nextInt();
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			arr1[i + 1] = arr[i];
			
		}
		arr1[0] = n;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
}
