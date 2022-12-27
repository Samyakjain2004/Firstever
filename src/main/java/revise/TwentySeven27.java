package revise;

import java.util.Scanner;

public class TwentySeven27 {
//To find how many times a number is repeated in an array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int l = sc.nextInt();

		int arr[] = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]");
			int x = sc.nextInt();
			arr[i] = x;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter number to count- ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("Found element at- " + i);
				count++;
			}
		}
		System.out.println("Found element " + n + "  " + count + "no of times");
	}
}
