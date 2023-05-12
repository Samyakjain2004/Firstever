package manishSirQues;

import java.util.Scanner;

//WAP to print fibionaki series
public class NinetyOne91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want in series? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter first element- ");
		int x = sc.nextInt();
		System.out.println("Enter second element- ");
		int y = sc.nextInt();
		arr[0] = x;
		arr[1] = y;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
