package revise;

import java.util.Scanner;

public class Seventeen {
//Print all odd no between two no
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int x = sc.nextInt();
		System.out.println("Enter last number-");
		int y = sc.nextInt();
		if (x % 2 == 0) {
			for (int i = x + 1; i <= y; i += 2) {
				System.out.println(i);
			}
		} else {
			for (int i = x; i <= y; i += 2) {
				System.out.println(i);
			}
		}
	}
}
