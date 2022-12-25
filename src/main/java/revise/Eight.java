package revise;

import java.util.Scanner;

public class Eight {
//To find average
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double x = sc.nextInt();
		System.out.println("Enter second number");
		double y = sc.nextInt();
		System.out.println("Enter third number");
		double z = sc.nextInt();
		System.out.println("Enter fourth number");
		double a = sc.nextInt();
		System.out.println("Enter fifth number");
		double b = sc.nextInt();

		double avg = (a + b + x + y + z) / 5;
	}
}
