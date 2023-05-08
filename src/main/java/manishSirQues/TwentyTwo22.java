package manishSirQues;

import java.util.Scanner;

//WAP to print sum multiplication and average of that array
public class TwentyTwo22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int x = sc.nextInt();
		double[] arr = new double[x];
		System.out.println(arr.length);
		double sum = 0;
		double fact = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]");
			int n = sc.nextInt();
			arr[i] = n;
			sum += arr[i];
			fact *= arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Sum of entered array is- " + sum);
		System.out.println("Multilication of entered array is " + fact);
		System.out.println("Average of enterd array is " + sum / x);

	}
}
