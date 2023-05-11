package manishSirQues;

import java.util.Scanner;

//WAP to check whether a no is even or not
public class SixtySix66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		String x = eveOdd(n);
		System.out.println(x);
	}

	private static String eveOdd(int n) {
		if ((n & 1) == 1) {
			return "odd";
		}

		// TODO Auto-generated method stub
		return "even";
	}
}
