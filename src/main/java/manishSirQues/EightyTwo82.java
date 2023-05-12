package manishSirQues;

import java.util.Scanner;

//WAP to check parenthesis
public class EightyTwo82 {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your expression- ");
		String s = sc.next();

		char[] arr = s.toCharArray();
		char[] arr1 = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				push(arr, arr1, i);
			} else if (arr[i] == ')') {
				pop(arr1);
			} else {

			}
		}
		if (top == -1) {
			System.out.println("parenthesis");
		} else {
			System.out.println("Not parenthesis");
		}
	}

	private static void pop(char[] arr1) {
		// TODO Auto-generated method stub
		top -= 1;
	}

	private static void push(char[] arr, char[] arr1, int i) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = arr[i];
	}
}
