package revise;

import java.util.Scanner;

public class Six {
// To check whether entered alphabet is a vowel or consonant
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char x = sc.next().charAt(0);
		if (x == 'a' | x == 'e' | x == 'i' | x == 'o' | x == 'u') {
			System.out.println("vowel");
		} else {
			System.out.println("Consonant");
		}
	}
}
