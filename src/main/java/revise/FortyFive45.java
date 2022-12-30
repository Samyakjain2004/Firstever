package revise;

import java.util.Scanner;

public class FortyFive45 {
//loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again.
//If so, the loop should repeat; otherwise it should terminate.
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number- ");
			int x = sc.nextInt();

			sum += x;
			System.out.println("Do u want to continue adding numbers y/n? ");
			char y = sc.next().charAt(0);
			if (y == 'n') {
				System.out.println("sum- " + sum);
				break;
			}
		}
	}
}
