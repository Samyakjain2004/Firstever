package manishSirQues;

import java.util.Scanner;

public class FortyThree43_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows- ");
		int n = sc.nextInt();
		int x = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			x += 2;
			for (int j = 2 * n - x; j >= 1; j--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
		}
	}
}
