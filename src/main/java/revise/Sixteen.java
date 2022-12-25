package revise;

import java.util.Scanner;

public class Sixteen {
//To print table of n till x
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number whose table is to be printed-");
		int n = sc.nextInt();
		System.out.println("Enter number till number to be multiplied");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}
}
