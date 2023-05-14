package manishSirQues;

import java.util.Scanner;

//WAP to print insertion order in array
public class FiftyFour54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
		}
		insert(arr, 0);
	}

	private static void insert(int[] arr, int i) {
		// TODO Auto-generated method stub
		if (i >= arr.length) {
			return;
		}
		System.out.println(arr[i]);
		insert(arr, i += 1);
	}
}
