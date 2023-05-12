package manishSirQues;

import java.util.Scanner;

//WAP to shift same elements one side using hashing
public class Ninety90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] arr1 = new int[10000];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
			arr1[arr[i]]++;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0) {
				for (int j = arr1[i]; j > 0; j--) {
					System.out.println(i);
				}
			}
		}
	}
}