package manishSirQues;

import java.util.Iterator;
import java.util.Scanner;

//WAP to find average
public class Eight8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nos are there?");
		double n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter no- ");
			int x = sc.nextInt();
			sum += x;
		}
		double avg;
		avg = sum / n;
		System.out.println("Average of entered nos are " + avg);
	}
}
