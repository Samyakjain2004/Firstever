package manishSirQues;

import java.util.Scanner;

//WAP to print mathematical expression for a table
public class Thirteen13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no whose table you want to print- ");
		int x = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
	}
}
