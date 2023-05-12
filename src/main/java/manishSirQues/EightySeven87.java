package manishSirQues;

import java.util.Scanner;

//WAP to find middle element of stack
public class EightySeven87 {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element");
			int x = sc.nextInt();
			arr[i] = x;
			push(arr, arr1, i);
		}
		mid(arr1);
	}

	private static void mid(int[] arr1) {
		// TODO Auto-generated method stub
		if (top % 2 == 0) {
			System.out.println(arr1[top / 2]);
		} else {
			System.out.println(arr1[top / 2]);
			System.out.println(arr1[((top + 1) / 2)]);

		}
	}

	private static void push(int[] arr, int[] arr1, int i) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = arr[i];
	}
}
