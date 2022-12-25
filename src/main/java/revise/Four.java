package revise;

import java.util.Scanner;

public class Four {
	// Take three no from user and print greatest
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int x = sc.nextInt();
		System.out.println("Enter second number-");
		int y = sc.nextInt();
		System.out.println("Enter third number-");
		int z = sc.nextInt();

		if (x >= y & x >= z) {
			System.out.println(x);
		} else if (y >= x & y >= z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}
	}
}
