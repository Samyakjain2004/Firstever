package manishSirQues;

import java.util.Scanner;

////Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again.
//If so, the loop should repeat; otherwise it should terminate.
public class FortFiv45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int x = sc.nextInt();

		for (int i = 0; i >= 0; i++) {
			System.out.println("Enter a no.");
			int y = sc.nextInt();
			x += y;
			System.out.println("Do u want to add more nos? y/n");
			char ch = sc.next().charAt(0);
			if (ch == 'y') {

			} else {
				System.out.println("Sum of entered nos is " + x);
				break;
			}
		}
	}
}
