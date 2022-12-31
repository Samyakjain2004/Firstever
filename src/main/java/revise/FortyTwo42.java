package revise;

import java.util.Scanner;

public class FortyTwo42 {
//program to calculate the sum of following series where n is input by user. 
//   1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n till sum to be found of series 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n");
		double n = sc.nextDouble();
		double sum = 0;
		for (double  i = 1; i <= n; i++) {
			sum = sum + 1 / i;
			
			System.out.println(sum);
		}
		System.out.println("Sum of series 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n = " + sum);
	}
}
