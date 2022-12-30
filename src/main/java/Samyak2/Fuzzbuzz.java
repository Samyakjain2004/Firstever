package Samyak2;

import java.util.Scanner;
public class Fuzzbuzz {

	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your favourite number");
		int number=sc.nextInt();

		if(number%3==0){
		System.out.println("Fuzz");
		}

		else if(number%2==0){
		System.out.println("Buzz");
		}

		else if(number%6==0){
		System.out.println("Fuzz Buzz");
		}

		else{
		System.out.println("Be happy");
		}
		}
}
