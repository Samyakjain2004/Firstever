package manishSirQues;

import java.util.Scanner;

//WAP to check whether no is positive or negative
public class Three3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		String x = posOrNev(n);
		System.out.println(n + " is " + x);
	}

	private static String posOrNev(int n) {
		// TODO Auto-generated method stub
		if (n > 0) {
			return "positive";
		} else if (n < 0) {
			return "negative";
		}
		return "zero";
	}
}
