package revise;

import java.util.Scanner;

public class Seven {
//To check whether it is a leap year or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year- ");
		int x = sc.nextInt();

		if (x % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Non leap year");
		}
	}
}
