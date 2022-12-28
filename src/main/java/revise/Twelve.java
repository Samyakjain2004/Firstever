package revise;

import java.util.Iterator;
import java.util.Scanner;

public class Twelve {
//Print consecutive integers till x
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number- ");
		int x = sc.nextInt();

		for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}
	}
}
