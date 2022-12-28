package revise;

import java.util.Scanner;

public class TwentyTwo {
//Take a no from user which is the length of array then print array of that length
	// and its sum multiplication and average
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array-");
		int l = sc.nextInt();
		double sums = 0;
		double mul = 1;
		double[] arr = new double[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter arr[" + i + "]- ");
			int x = sc.nextInt();
			arr[i] = x;
			sums = sums + arr[i];
			mul = mul * arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println(" ");
		System.out.println("Sum- " + sums);
		System.out.println("Average= " + sums / arr.length);
		System.out.println("Multiplication- " + mul);
	}
}