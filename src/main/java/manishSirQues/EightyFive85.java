package manishSirQues;

import java.util.Scanner;

//WAP to reverse a string
public class EightyFive85 {
	static int top=-1;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string- ");
	String s=sc.next();
	
	char[] arr=s.toCharArray();
	char[] arr1=new char[arr.length];
	for (int i = 0; i < arr1.length; i++) {
		push(arr,arr1,i);
	}
	while(top!=-1) {
		pop(arr1);
	}
	}
private static void pop(char[] arr1) {
	// TODO Auto-generated method stub
	System.out.print(arr1[top]);
	top-=1;
}

private static void push(char[] arr, char[] arr1, int i) {
	// TODO Auto-generated method stub
	top+=1;
	arr1[top]=arr[i];
}
}
