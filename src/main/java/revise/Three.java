package revise;

import java.util.Scanner;

public class Three {
	// To check no is positive or negative
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number-");
		int x = sc.nextInt();
		if (x >= 0) {
			System.out.println("Entered no is positive");

		} else {
			System.out.println("Entered no is negative");
		}
	}
}