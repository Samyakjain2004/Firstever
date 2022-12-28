package Samyak1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int v=sc.nextInt();
	
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter second number");
		int w=sc.nextInt();

		Scanner scb=new Scanner(System.in);
		System.out.println("Enter third number");
		int x=sc.nextInt();

		Scanner scc=new Scanner(System.in);
		System.out.println("Enter fourth number");
		int y=sc.nextInt();

		Scanner scd=new Scanner(System.in);
		System.out.println("Enter fifth number");
		int z=sc.nextInt();

		int a=(v+w+x+y+z)/5;
		System.out.println("Average of five numbers entered is-"+a);
		}
}
