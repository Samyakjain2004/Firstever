package manishSirQues;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
public class FortyOne41 {
	public static void main(String[] args) {
		int count=0;
		int[] arr = new int[100];
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a no.");
			int n = sc.nextInt();
			arr[i] = n;

			System.out.println("Do you want to enter more no y/n?");
			
			char ch = sc.next().charAt(0);
			count++;
			if (ch == 'y') {

			} else {
				break;

			}
		}

		

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max >= arr[i]) {
				max = max;
			} else {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 0; i < count; i++) {
			if (min >= arr[i]) {
				min = arr[i];
			} else {
				min = min;
			}
		}
		System.out.println("Largest no entered " + max);
		System.out.println("Smallest no enetered " + min);

	}
}
