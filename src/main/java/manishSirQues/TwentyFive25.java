package manishSirQues;

import java.util.Scanner;

//WAP to add no in start in an array
public class TwentyFive25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("Enter element");
			int x = sc.nextInt();
			arr[i] = x;
		}
		System.out.println("Enter element you want to add at last");
		int y = sc.nextInt();
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = y;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
