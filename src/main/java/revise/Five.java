package revise;

import java.util.Scanner;

public class Five {
//Take no from one to seven and print day name
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in range from one to seven-");
		int x = sc.nextInt();

		if (x == 1) {
			System.out.println("Sumday");
		} else if (x == 2) {
			System.out.println("Monday");
		} else if (x == 3) {
			System.out.println("Tuesday");
		} else if (x == 4) {
			System.out.println("Wednesday");
		} else if (x == 5) {
			System.out.println("Thursday");
		} else if (x == 6) {
			System.out.println("Friday");
		} else if (x == 7) {
			System.out.println("Saturday");
		} else {
			System.out.println("out of range");
		}
	}
}
