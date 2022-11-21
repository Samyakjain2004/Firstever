package Samyak2;

import java.util.Scanner;
public class Greatest {
public static void main(String[] args) {
	
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	
	Scanner sca= new Scanner (System.in);
	System.out.println("Enter Second number");
	int b=sc.nextInt();
	
	Scanner scb= new Scanner (System.in);
	System.out.println("Enter third number");
	int c=sc.nextInt();
	
	int d=a-b-c;
	int e=b-a-c;
	
	if(a>=b & a>=c) {
		System.out.println("Greatest number entered is "+a);
	}
	
	else if(b>=a & b>=c) {
		System.out.println("Greatest number entered is "+b);
	}
	
	else {
		System.out.println("Greatest number entered is "+c);
	}
}
}
