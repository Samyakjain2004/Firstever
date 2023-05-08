package manishSirQues;

import java.util.Scanner;

//WAP to enter no from 1 to 7 and print weekdays
public class Five5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		String x = day(n);
		System.out.println(x);
	}

	private static String day(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
			return "Monday";
		} else if (n == 2) {
			return "Tuesday";
		} else if (n == 3) {
			return "Wednesday";
		} else if (n == 4) {
			return "Thursday";
		} else if (n == 5) {
			return "Friday";
		} else if (n == 6) {
			return "Saturday";
		} else if (n == 7) {
			return "Sunday";
		}
		return "Enter in range 1 to 7";
	}
}
