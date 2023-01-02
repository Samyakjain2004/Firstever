package handler;

import java.util.Scanner;

public class Factorial {
	// To find factorial
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number-");
		int x = sc.nextInt();
		int mul = 1;

		for (int i = x; i > 0; i--) {
			mul = mul * i;
		}
		System.out.println("Factorial " + mul);
	}

}
