package manishSirQues;

import java.util.Scanner;

//WAP to create an array
public class Twenty20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=");
			int x = sc.nextInt();
			arr[i] = x;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
