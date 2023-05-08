package manishSirQues;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class ThirtySix36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many no you want to enter? ");
		int n = sc.nextInt();
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter your no.");
			int x = sc.nextInt();
			if (x >= 0) {
				pos += x;
			} else {
				neg += x;
			}
		}
		System.out.println("Sum of positive integers" + pos);
		System.out.println("Sum of negative integers" + neg);
	}
}
