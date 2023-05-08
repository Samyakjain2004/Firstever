package manishSirQues;

import java.util.Scanner;

//WAP to check whether no is multiplier of 2 3 or 6
public class Nine9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int x = sc.nextInt();
		String s = multi(x);
		System.out.println(x + " is " + s);
	}

	private static String multi(int x) {
		// TODO Auto-generated method stub
		if (x % 6 == 0) {
			return "Multiplier of 6";
		} else if (x % 3 == 0) {
			return "Multiplier of 3";
		} else if (x % 2 == 0) {
			return "Multiplier of 2";
		}
		return "Not multiplier of 2, 3 & 6";
	}
}
