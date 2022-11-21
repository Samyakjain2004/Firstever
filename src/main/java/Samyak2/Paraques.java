package Samyak2;

import java.util.Scanner;
import java.util.Scanner;
public class Paraques {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Amount of pocket money recieved?-");
		int a=sc.nextInt();
		
		Scanner sca= new Scanner (System.in);
		System.out.println("Price of one plate kachori?-");
		int b=sc.nextInt();
		
		Scanner scb= new Scanner (System.in);
		System.out.println("Out of pocket money 3 registers have to be bought, What is the price of register 1-");
		int r1=sc.nextInt();
		
		Scanner scc= new Scanner (System.in);
		System.out.println("Price of register 2-");
		int r2=sc.nextInt();
		
		Scanner scd= new Scanner (System.in);
		System.out.println("Price of register 3-");
		int r3=sc.nextInt();
		
		int r=a-(r1+r2+r3);
		
		if(r>=b) {
			System.out.println("Let's have some kachori, you have enough amount of money left ");
		}
		
		else {
			System.out.println("You need to save money to eat kachori");
		}
	}
}
