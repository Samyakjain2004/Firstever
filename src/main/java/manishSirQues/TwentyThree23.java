package manishSirQues;

import java.util.Scanner;

//WAP to find max and min in an array
public class TwentyThree23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]");
			int x = sc.nextInt();
			arr[i] = x;

		}
		max = arr[0];
		min = arr[0];
		System.out.println(min);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];

			} else {
				max = max;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= min) {
				min = min;

			} else {
				min = arr[i];
				;

			}
		}
		System.out.println("Max is" + max);
		System.out.println("Min is" + min);
	}
}
