package recursion;

import java.util.Scanner;

public class AgainBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to find");
		int x = sc.nextInt();
		int f = 0;
		int l = arr.length;

		int bin = findBin(arr, f, l, x);
		System.out.println("Found " + x + " at " + bin);
	}

	private static int findBin(int[] arr, int f, int l, int x) {
		int mid = (f + l) / 2;
		if (x == arr[mid]) {
			return mid;
		} else if (x > arr[mid]) {
			f = mid + 1;
		} else if (x < arr[mid]) {
			l = mid - 1;
		}
		return findBin(arr, f, l, x);
	}
}
