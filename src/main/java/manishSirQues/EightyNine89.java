package manishSirQues;

import java.util.Scanner;

//WAP to shift same elements one side using sorting
public class EightyNine89 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of element");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element");
			int x = sc.nextInt();
			arr[i] = x;
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				} else {

				}
			}

		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println("arr[" + j + "]" + arr[j]);
		}
	}
}
