package manishSirQues;

import java.util.Scanner;

//WAP to reverse a sentence using stack
public class EightySix86 {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence- ");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		String[] arr1 = new String[arr.length];
		String t = "";
		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] == ' ') {
				push(arr, arr1, i, t);
				t = "";
			} else if (i == arr.length - 1) {
				t += arr[i];
				push(arr, arr1, i, t);
				t = "";
			} else {
				t += arr[i];
			}
		}
		while (top != -1) {
			pop(arr1);
		}
	}

	private static void pop(String[] arr1) {
		// TODO Auto-generated method stub
		System.out.println(arr1[top]);
		top -= 1;
	}

	private static void push(char[] arr, String[] arr1, int i, String t) {
		// TODO Auto-generated method stub
		top += 1;
		arr1[top] = t;
	}
}
