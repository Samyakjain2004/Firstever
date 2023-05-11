package manishSirQues;

import java.util.Iterator;
import java.util.Scanner;

//WAP to find non repeating elements in an array
public class Seventy70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements-");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
		}
		int z = 0;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] >= arr[i + 1]) {
					z = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = z;
				} else {

				}
			}
		}
		System.out.println("Non repeating elements- ");
		if (arr[0] != arr[1]) {
			System.out.println(arr[0]);
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}
		if (arr[arr.length - 2] != arr[arr.length - 1]) {
			System.out.println(arr[arr.length - 1]);
		}
	}
}
