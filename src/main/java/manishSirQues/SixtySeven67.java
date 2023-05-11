package manishSirQues;

import java.util.Scanner;

//WAP to check Ith bit from right
public class SixtySeven67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		System.out.println("Which bit from right you want to check?");
		int i = sc.nextInt();
		int j = 1;
		// for (int j2 = 1; j2 < i; j2++) {
		int k = n >> i - 1;
		// }
		if ((k & 1) == 1) {
			System.out.println("The " + i + " bit is- 1");
		} else {
			System.out.println("The " + i + " bit is- 0");

		}

	}
}
