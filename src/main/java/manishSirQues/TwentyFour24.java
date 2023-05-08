package manishSirQues;

import java.util.Scanner;

//WAP to find element in an array
public class TwentyFour24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter elements- ");
			int x = sc.nextInt();
			arr[i] = x;
		}
		System.out.println("Enter no you want to find- ");
		int z = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == z) {
				System.out.println("Found " + z + " at arr[" + i + "]");
			}
		}
	}
}
