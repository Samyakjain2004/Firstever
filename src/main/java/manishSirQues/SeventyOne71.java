package manishSirQues;

import java.util.Scanner;

//WAP to count no of set bits
public class SeventyOne71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < 31; i++) {
			if ((n >> i & 1) == 1) {
				count++;
			}
		}
		System.out.println("No of set bits are " + count);
	}
}
