package revise;

import java.util.Scanner;

public class Nine {
//Take no and check whether no is multiplier of 2 3 or 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x % 6 == 0) {
			System.out.println("Fuzzbuzz");
		} else if (x % 3 == 0) {
			System.out.println("Buzz");
		} else if (x % 2 == 0) {
			System.out.println("Fuzz");
		}
	}
}
