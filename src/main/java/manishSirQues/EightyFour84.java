package manishSirQues;

import java.util.Scanner;

//WAP to calculate no of pair of brackets
public class EightyFour84 {
	static int top = -1;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression");
		String s = sc.next();

		char[] arr = s.toCharArray();
		char[] arr1 = new char[arr.length];

		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] == '(') {
				push(arr, arr1, i);
			} else if (arr[i] == ')') {
				pull(arr1);
			} else {

			}
		}
		System.out.println("No of pair of brackets" + count);
	}

	private static void pull(char[] arr1) {
		// TODO Auto-generated method stub
		if (top < -1) {
			top -= 1;
		}
		count++;
		top -= 1;

	}

	private static void push(char[] arr, char[] arr1, int i) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = arr[i];
	}
}
