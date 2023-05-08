package manishSirQues;

import java.util.Scanner;

//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
public class ThirtyFive35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. ");
		int x = sc.nextInt();
		int y = 0;
		int rev = 0;
		for (int i = 0; x != 0; i++) {
			y = x % 10;
			rev = rev * 10 + y;
			x = x / 10;
		}
		System.out.println("reversed no- " + rev);
	}
}
