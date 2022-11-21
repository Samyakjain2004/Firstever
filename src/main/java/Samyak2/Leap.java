package Samyak2;

import java.util.Scanner;
public class Leap {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();

		if(number%4==0){
		System.out.println("Entered number year is a leap year");
		}

		else{
		System.out.println("Entered number year is a non-leap year");
		}
		}
}

