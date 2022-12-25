package revise;

import java.util.Scanner;

public class Fifteen {
//print reverse series
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int x = sc.nextInt();
		System.out.println("Enter last number-");
		int y = sc.nextInt();

		for (int i = y; i >= x; i--) {
			System.out.println(i);
		}

	}
}
