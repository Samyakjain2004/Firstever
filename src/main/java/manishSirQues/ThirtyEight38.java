package manishSirQues;

import java.util.Scanner;

//Write a program to find the factorial value of any number entered through the keyboard. 
public class ThirtyEight38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact *= i;

		}
		System.out.println("Factorial of " + n + " is " + fact);
	}
}
