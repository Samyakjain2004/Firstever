package manishSirQues;

import java.util.Scanner;

//WAP to check leap year or not
public class Seven7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int x = sc.nextInt();
		String s = leap(x);
		System.out.println(x + " is " + s);
	}

	private static String leap(int x) {
		// TODO Auto-generated method stub
		if (x % 4 == 0) {
			return "leap year";
		}
		return "not a leap year";
	}
}
