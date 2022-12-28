package revise;

import java.util.Scanner;

public class ThirtySeven37 {
//program that prompts the user to input a positive integer.
	// It should then output a message indicating whether the number is a prime
	// number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int x = sc.nextInt();
		if (x == 2) {
			System.out.println("Prime number");
		} else if (x == 1 | x == 0) {
			System.out.println("Neither a prime nor a composite number");

		}

		else if (x > 2) {
			for (int i = 2; i < x; i++) {
				if (x % i != 0) {
					System.out.println("Prime number");

				} else {
					System.out.println("Composite number");
					break;
				}

			}
		}

	}
}