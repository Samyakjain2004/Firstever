package manishSirQues;

import java.util.Scanner;

//WAP to divide ad mul sub 2 nos
public class Two2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		double x = sc.nextInt();
		System.out.println("Enter second number-");
		double y = sc.nextInt();
		double su = sum(x, y);
		double sub = subtract(x, y);
		double mul = multiply(x, y);
		double div = divide(x, y);
		System.out.println("Sum of " + x + " & " + y + " is " + su);
		System.out.println("Subtraction of " + x + " & " + y + " is " + sub);
		System.out.println("Multiplication of " + x + " & " + y + " is " + mul);
		System.out.println("Division of " + x + " & " + y + " is " + div);
	}

	private static double divide(double x, double y) {
		double d = 0;
		d = x / y;
		return d;
	}

	private static double multiply(double x, double y) {
		// TODO Auto-generated method stub
		double m;
		m = x * y;
		return m;
	}

	private static double subtract(double x, double y) {
		// TODO Auto-generated method stub
		double s;
		s = x - y;
		return s;
	}

	private static double sum(double x, double y) {
		// TODO Auto-generated method stub
		double k;
		k = x + y;
		return k;
	}
}
