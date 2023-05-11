package manishSirQues;

import java.util.Scanner;

//WAP to set Ith bit 1
public class SixtyNine69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = sc.nextInt();

		System.out.println("Which bit you want to set 1?");
		int i = sc.nextInt();

		int x = n | (1 << (i - 1));
		int y = n & (1 << (i - 1));
		if (y == 0) {
			System.out.println("Initial bit was 0");
			System.out.println("After setting " + i + " bit 1 new no is " + x);
		} else {
			System.out.println("Initial bit was 1");
			System.out.println("After setting " + i + " bit 1 new no is " + x);
		}
	}
}
