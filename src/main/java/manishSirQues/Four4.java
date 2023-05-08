package manishSirQues;

import java.util.Scanner;

//WAP to take three nos from user and print greatest
public class Four4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int x = sc.nextInt();
		System.out.println("Enter second no");
		int y = sc.nextInt();
		System.out.println("Enter third no");
		int z = sc.nextInt();
		int g = great(x, y, z);
	}

	private static int great(int x, int y, int z) {
		// TODO Auto-generated method stub
		if (x >= y && x >= z) {
			System.out.println(x + " is greatest");
		} else if (y >= x && y >= z) {
			System.out.println(y + " is greatest");
		} else if (z >= x && z >= y) {
			System.out.println(z + " is greatest");
		}
		return 0;
	}
}
