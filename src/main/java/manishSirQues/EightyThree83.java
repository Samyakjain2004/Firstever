package manishSirQues;

import java.util.Scanner;

//WAP to check redundant parenthesis
public class EightyThree83 {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression");
		String s = sc.next();
		char[] arr = s.toCharArray();
		char[] arr1 = new char[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] != ')') {
				push(arr, arr1, i);
			} else {
				pop(arr1);
			}
		}

	}

	private static void pop(char[] arr1) {
		// TODO Auto-generated method stub
		for (int j = 0; j < 3; j++) {
			if (arr1[top] != '(') {
				top -= 1;
			} else {
				System.out.println("Redundant parenthesis");
				break;
			}
		}
	}

	private static void push(char[] arr, char[] arr1, int i) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = arr[i];

	}
}
