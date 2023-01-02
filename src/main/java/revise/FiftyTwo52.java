package revise;

import java.util.Scanner;

public class FiftyTwo52 {
//Design a very smart command based calculator that will take following arguments 
//Start > it will start the calculator 
//Stop > it will stop the calculator 
//add num1 num2  > will add the numbers 
//sub num1 num2 > will subtract the numbers 
//mul num1 num2 > will multiply the numbers 
//div num1 num2 > will divide the numbers 
//mod num1 num2 > will get the modular division of num1 num2
//per num1 num2 will get the percentage
	public static void main(String[] args) {
		for (double i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Start > it will start the calculator ");

			String s = sc.nextLine();
			if (s.equals("start") || s.equals("Start")) {

				for (double j = 0; j >= 0; j++) {
					Scanner sc1 = new Scanner(System.in);

					System.out.println("Enter add will add the numbers ");
					System.out.println("Enter sub will subtract the numbers ");
					System.out.println("Enter mul will multiply the numbers  ");
					System.out.println("Enter div will divide the numbers");
					System.out.println("Enter mod will get the modular division");
					System.out.println("Enter per will get the percentage ");
					System.out.println("Enter stop to power off");
					String z = sc.next();

					if (z.equals("add")) {
						System.out.println("Enter num1- ");
						double x = sc.nextDouble();
						System.out.println("Enter num2- ");
						double y = sc.nextDouble();

						System.out.println(x + y);

					} else if (z.equals("sub")) {
						System.out.println("Enter num1- ");
						double x = sc.nextDouble();
						System.out.println("Enter num2- ");
						double y = sc.nextDouble();

						System.out.println(x - y);
					} else if (z.equals("mul")) {
						System.out.println("Enter num1- ");
						double x = sc.nextDouble();
						System.out.println("Enter num2- ");
						double y = sc.nextDouble();

						System.out.println(x * y);
					} else if (z.equals("div")) {
						System.out.println("Enter num1- ");
						double x = sc.nextDouble();
						System.out.println("Enter num2- ");
						double y = sc.nextDouble();

						System.out.println(x / y);
					} else if (z.equals("mod")) {
						System.out.println("Enter num1- ");
						double x = sc.nextDouble();
						System.out.println("Enter num2- ");
						double y = sc.nextDouble();

						System.out.println(x % y);
					} else if (z.equals("per")) {
						System.out.println("Enter num1- ");
						double x = sc.nextDouble();
						System.out.println("Enter num2- ");
						double y = sc.nextDouble();

						System.out.println((x / y * 100) + "%");
					} else if (z.equals("stop")) {

						break;
					} else {
						System.out.println("Enter a valid command");
					}
				}
			} else {
				System.out.println("Power off");
			}
		}
	}
}