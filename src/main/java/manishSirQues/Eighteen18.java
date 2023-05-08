package manishSirQues;

import java.util.Scanner;

//WAP to print third alternative no between 2 nos
public class Eighteen18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no- ");
		int x = sc.nextInt();
		System.out.println("Enter last no- ");
		int y = sc.nextInt();

		for (int i = x; i <= y; i += 4) {
			System.out.println(i);
		}
	}
}
