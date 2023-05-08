package manishSirQues;
//WAP to print table of n till x

import java.util.Scanner;

public class Sixteen16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no whose table you want to print- ");
		int n = sc.nextInt();
		System.out.println("Till when you want to print? ");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
