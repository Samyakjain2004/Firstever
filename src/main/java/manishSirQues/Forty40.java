package manishSirQues;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
public class Forty40 {
	public static void main(String[] args) {
		int countp = 0;
		int countn = 0;
		int countz = 0;
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a no.");
			int n = sc.nextInt();

			if (n > 0) {
				countp++;
			} else if (n < 0) {
				countn++;
			} else {
				countz++;
			}
			System.out.println("Do you want to enter more no y/n?");
			char ch = sc.next().charAt(0);
			if (ch == 'y') {

			} else {
				break;
			}
		}
		System.out.println("No of +ve nos " + countp);
		System.out.println("No of -ve nos " + countn);
		System.out.println("No of zeroes " + countz);
	}
}
