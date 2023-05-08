package manishSirQues;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 
public class ThirtySeven37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Neither prime not composite");
		} else if (n == 2 || n == 3) {
			System.out.println("prime");
		} else {
			String x = prime(n);
			System.out.println(x);
		}

	}

	private static String prime(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return "not prime";
			}
		}
		return "prime";
	}
}
