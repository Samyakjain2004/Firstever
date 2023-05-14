package manishSirQues;

import java.util.Scanner;

//WAP to print insertion order in reverse
public class FiftyFive55 {
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
		rev(arr, 0);
	}

	private static void rev(int[] arr, int i) {
		// TODO Auto-generated method stub
		if (i >= arr.length) {
			System.out.println("end");
			return;
		}
		rev(arr, i += 1);
		System.out.println(arr[i]);
	}
}
