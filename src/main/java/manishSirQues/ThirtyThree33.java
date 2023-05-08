package manishSirQues;

import java.util.Scanner;

//Take a number 9834 and display one by one like {9,8,3,4}
public class ThirtyThree33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int x = sc.nextInt();
		int y = 0;
		y = x;
		int n = 0;
		int count = 0;
		for (int i = 0; x != 0; i++) {
			n = x % 10;
			x = x / 10;
			count++;
		}
		int[] arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = y % 10;
			y = y / 10;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}
}
