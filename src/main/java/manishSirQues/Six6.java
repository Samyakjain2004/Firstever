package manishSirQues;

import java.util.Scanner;

//WAP to check entered alphabet is a vowel or consonant
public class Six6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		String s = apha(c);
		System.out.println(c + " is " + s);
	}

	private static String apha(char c) {
		// TODO Auto-generated method stub
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return "vowel";
		}
		return "consonant";
	}
}
