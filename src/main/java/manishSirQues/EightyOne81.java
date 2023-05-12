package manishSirQues;

import java.util.Scanner;

//WAP to implement queue with the help of array
public class EightyOne81 {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
			push(arr, arr1, i);
		}
		System.out.println("All elements pushed");

		peek(arr1);
		System.out.println("Popping elements in queue");

		pop(arr1);

	}

	private static void pop(int[] arr1) {
		// TODO Auto-generated method stub
		int i = 0;
		while (top != -1) {
			System.out.println(arr1[i]);
			arr1[i] = arr1[i + 1];
			top -= 1;
			i++;
		}
	}

	private static void peek(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.println("Element at peek " + arr1[top]);

	}

	private static void push(int[] arr, int[] arr1, int i) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = arr[i];
	}
}
