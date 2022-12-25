package revise;

import java.util.Scanner;

public class Nineteen {
//Write program to print factorial sum avg
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number-");
		double x = sc.nextInt();
		double fact = 1;
		double sum = 0;

		for (double i = x; i > 0; i--) {
			System.out.println(i);
			fact = fact * i;
			sum = sum + i;
		}
		System.out.println("Factorial" + fact);
		System.out.println("Sum-" + sum);
		System.out.println("Average-" + sum / x);
	}
}
