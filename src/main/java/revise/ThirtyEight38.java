package revise;

import java.util.Scanner;

public class ThirtyEight38 {
//program to find the factorial value of any number entered through the keyboard. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number- ");
		int x = sc.nextInt();
		int y = 1;

		for (int i = x; i > 0; i--) {
			y = i * y;
		}
		System.out.println("Factorial of " + x + " is " + y);
	}
}
