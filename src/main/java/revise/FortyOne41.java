package revise;

import java.util.Scanner;

public class FortyOne41 {
//program to enter number till user wants and at last display max and min
	public static void main(String[] args) {

		int min = 0;
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number- ");
			int x = sc.nextInt();
			int max = x;
			if (x >= max) {
				max = x;
			} else {
				max = max;
			}
			System.out.println("Do u want to continue entering numbers y/n?");
			char y = sc.next().charAt(0);

			if (y == 'n') {
				System.out.println("max- " + max);
				break;
			}
		}
	}
}
