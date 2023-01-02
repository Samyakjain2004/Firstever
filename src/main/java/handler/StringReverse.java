package handler;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of string");
	int l=sc.nextInt();
	char[] arr= new char[l];
	char[] arr1=new char[arr.length];
	for (int i = 0; i < l; i++) {
		System.out.println("Enter character");
		char c=sc.next().charAt(0);
		 c=arr[i];
	}
	
	for (int i = 0; i < l; i++) {
		arr1[arr.length-i-1]=arr[i];
	}
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}
	for (int i = 0; i < arr1.length; i++) {
		if(arr[i]==arr1[i]) {
			System.out.println("Palendrome");
			break;
		}
		else {
			System.out.println("Not a palendrome");
			break;
		}
	}
}
}
