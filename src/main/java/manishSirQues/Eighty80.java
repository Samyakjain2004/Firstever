package manishSirQues;

import java.util.Scanner;

//WAP to Implement stack with the help of array
public class Eighty80 {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements- ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
			push(arr, n, arr1, i);
		}
		System.out.println("All elements pushed");
		peek(arr1);
		System.out.println("Popping elemnts of stack- ");
		for (int i = top; i > -1; i--) {
			pop(arr1, i, n);
		}
	}

	private static void peek(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.println("Element at top- " + arr1[top]);
	}

	private static void pop(int[] arr1, int i, int n) {
		// TODO Auto-generated method stub
		System.out.println(arr1[top]);
		top -= 1;
	}

	private static void push(int[] arr, int n, int[] arr1, int i) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = arr[i];

	}

}
