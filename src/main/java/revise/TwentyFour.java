package revise;

import java.util.Scanner;

public class TwentyFour {
//Find element in array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int l = sc.nextInt();

		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]");
			int x = sc.nextInt();
			arr[i]=x;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Enter number to be found- ");
		int n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("Element found at arr[" + i + "]");
				break;
			} 
		}
	}
}
