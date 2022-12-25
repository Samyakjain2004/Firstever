package revise;

import java.util.Scanner;

public class Eighteen {
//Write all third alternate no b/w 2 no
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int x = sc.nextInt();

		System.out.println("Enter last number-");
		int y = sc.nextInt();

		for (int i = x; i <= y; i += 4) {
			System.out.println(i);
		}
	}
}
