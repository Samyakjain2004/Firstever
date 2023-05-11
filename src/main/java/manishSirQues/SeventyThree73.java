package manishSirQues;

import java.util.Scanner;

//WAP to take 2 bit position and find no formed between between them
public class SeventyThree73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		System.out.println("Starting from right enter first bit- ");
		int x = sc.nextInt();
		System.out.println("Enter second bit- ");
		int y = sc.nextInt();
		int o = n >> (x - 1);
		int sum = 0;
		for (int i = 0; i <= y - x + 1; i++) {
			int p = o & (1 << i);
			sum += p;
		}
		System.out.println("New no- " + sum);
	}
}
