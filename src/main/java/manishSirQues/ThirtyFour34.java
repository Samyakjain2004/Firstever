package manishSirQues;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
public class ThirtyFour34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no whose table you want to print- ");
		int x = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
	}
}
