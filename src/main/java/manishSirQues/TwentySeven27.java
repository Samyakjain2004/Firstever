package manishSirQues;

import java.util.Scanner;

//WAP to print no of times an element is repeated in an array
public class TwentySeven27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element");
			int x = sc.nextInt();
			arr[i] = x;
		}
		int count = 0;
		System.out.println("Enter element you want to check freq");
		int z = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == z) {
				count++;
			}
		}
		System.out.println("Freq of " + z + " is " + count);
	}
}
