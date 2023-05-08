package manishSirQues;

import java.util.Random;
import java.util.Scanner;

//Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." 
//The program should use a loop that repeats until the user correctly guesses the random number.
public class FortyFour44 {
	public static void main(String[] args) {
		// int x=(int) Math.random();
		Random ran = new Random();
		int x = ran.nextInt(100);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i >= 0; i++) {
			System.out.println("Enter the closest no you guessed");
			int n = sc.nextInt();
			if (n == x) {
				System.out.println("You found it");
				break;
			} else if (n > x) {
				System.out.println("You have entered greater no");
			} else {
				System.out.println("You have entered smaller no");
			}
		}
	}
}
