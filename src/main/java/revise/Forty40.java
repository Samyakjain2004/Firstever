package revise;

import java.util.Scanner;

public class Forty40 {
//program to enter the numbers till the user wants and 
//at the end it should display the count of positive, negative and zeros entered.
	public static void main(String[] args) {
		System.out.println("Hello");
		int pos = 0;
		int neg = 0;
		int zer = 0;
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number- ");
			String y = sc.nextLine();
			
			System.out.println("Type 00 if you want to check number of positive negative or zero entered");
			//String y=sc.nextLine();
			int x=sc.nextInt();
			
			if (x > 0) {
				pos++;
				
			} else if (x < 0) {
				neg++;
				
			}
			else if (x==00) {
				System.out.println("positive number="+pos);
				System.out.println("Negative number="+neg);
				System.out.println("Zero="+zer);
				break;
			}
			else {
				zer++;
				
			}
		}

	}
}
