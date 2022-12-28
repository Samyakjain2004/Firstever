package revise;

import java.util.Scanner;

public class Thirteen {
//Write mathematical expression for a table
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number whose table is to be printed-");
		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(x + "*" + i + "=" + x * i);
		}
	}
}
