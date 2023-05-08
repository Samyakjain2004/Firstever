package manishSirQues;

import java.util.Scanner;

//WAP to make odd position twice in array
public class TwentyOne21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]");
			int x = sc.nextInt();
			arr[i] = x;
			if (i % 2 == 0) {

			} else {
				arr[i] = 2 * arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
