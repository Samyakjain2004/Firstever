package manishSirQues;

import java.util.Scanner;

//Wap to check whether a no is exact power of 2
public class SixtyFive65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		String x = exact(n);
		System.out.println(x);
	}

	private static String exact(int n) {
		// TODO Auto-generated method stub
		if (((n) & (n - 1)) == 0) {
			return "Exact power of 2";
		}
		return "Not exact power of 2";
	}
}
