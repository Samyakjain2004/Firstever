package manishSirQues;

import java.util.Scanner;

//Write a program to calculate the sum of following series where n is input by user. 
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
public class FortyTwo42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n");
		System.out.println("Enter value of n");
		double n = sc.nextDouble();
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}
		System.out.println("Sum of series formed "+sum);
	}
}
