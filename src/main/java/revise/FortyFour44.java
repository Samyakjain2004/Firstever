package revise;

import java.util.Random;
import java.util.Scanner;

public class FortyFour44 {
//program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." 
//The program should use a loop that repeats until the user correctly guesses the random number.
	public static void main(String[] args) {
		Random ran=new Random();
		int x=ran.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i >= 0; i++) {
			System.out.println("Enter number you feel closest- ");
			int y = sc.nextInt();

			if (x > y) {
				System.out.println("Entered number is lesser");
			} else if (y > x) {
				System.out.println("Entered number is greater");
			} else {
				System.out.println("Correct number guessed");
				break;
			}
		}
	}
}
