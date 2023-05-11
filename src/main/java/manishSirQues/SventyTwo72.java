package manishSirQues;

import java.util.Scanner;

//WAP to check position of only Ith bit otherwise print -1
public class SventyTwo72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < 31; i++) {
			if ((n >> i & 1) == 1) {
				count++;
				if (count == 1) {
					System.out.println("Found first set bit at " + (i + 1));
				} else if (count == 2) {
					System.out.println("-1");
					break;
				}
			}
		}
	}
}
