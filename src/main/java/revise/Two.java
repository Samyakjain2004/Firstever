package revise;

import java.util.Scanner;

public class Two {
//To add mul sub and div two numbers

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr first number- ");
		double x = sc.nextInt();
		System.out.println("Enter second number- ");
		double y = sc.nextInt();
		double subt = x - y;
		double div = x / y;
		double sum = x + y;
		System.out.println("Sum=" + sum);
		System.out.println("Multiply" + x * y);
		System.out.println("Divide" + div);
		System.out.println("Subtract" + subt);

	}
}
