package revise;

import java.util.Scanner;

public class ThirtyFour {
	// Input a no and print its table
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no whose table you want to be printed-");
		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(x * i);
		}
	}
}
