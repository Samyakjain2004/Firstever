package revise;

import java.util.Scanner;

public class ThirtyNine39 {
//program to calculate HCF of Two given number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number- ");
		int x = sc.nextInt();

		System.out.println("Enter Secomd number- ");
		int y = sc.nextInt();
		int z = 0;

		for (int i = 1; i <= x & i <= y; i++) {
			if (x % i == 0 & y % i == 0) {

				if (i > z) {
					z = i;
				}
			}

		}
		System.out.println("HCF- " + z);
	}
}
