package revise;

import java.util.Scanner;

public class Eleven {
//Repeat till memorise
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in no of times homework will be memorized-");
		int x = sc.nextInt();
		int count = 1;
		while (count <= x) {
			System.out.println("Homework not learnt");
			if (count == x) {
				System.out.println("Homework learnt");
			}
			count++;
		}
	}
}
