package manishSirQues;

import java.util.Scanner;

//WAP to print sum avg and factorial from 0 to entered no
public class Nineteen19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		double x = sc.nextInt();
		double sum = 0;
		double fact = 1;
		double avg = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
			fact *= i;
		}
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
		System.out.println("Average is " + sum / x);
	}
}
