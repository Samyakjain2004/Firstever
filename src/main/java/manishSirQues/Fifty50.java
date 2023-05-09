package manishSirQues;

import java.util.Scanner;

public class Fifty50 {

	// Take the input from user that how many balls have to be thrown in an over.
	// A ball is said to be valid if the speed of the ball is less than 150kmph.
	// We have to count only valid balls in an over.
	// For n balls take the input from the user for the speed of the ball.
	// Calculate in how many balls an over will be completed.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many balls are there in an over- ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter speed of ball in kmph-");
			int v = sc.nextInt();
			if (v < 150) {
				System.out.println("Valid ball thrown" + i);
			} else {
				System.out.println("Speed should be less than 150kmph, throw again!!!");
				i--;
			}
		}
		System.out.println("Over completed");
	}
}
