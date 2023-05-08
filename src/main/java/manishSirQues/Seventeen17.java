package manishSirQues;

import java.util.Scanner;

//WAP to print all odd no between 2 nos
public class Seventeen17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no- ");
		int x = sc.nextInt();
		System.out.println("Enter last no- ");
		int y = sc.nextInt();

		for (int i = x; i <= y; i++) {
			if (i % 2 == 0) {

			} else {
				System.out.println(i);
			}
		}
	}
}
