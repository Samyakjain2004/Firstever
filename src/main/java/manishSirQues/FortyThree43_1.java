package manishSirQues;

//WAP to print a x*y matrix both solid and hollow
import java.util.Scanner;

public class FortyThree43_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows you want in matrix- ");
		int r = sc.nextInt();
		System.out.println("Enter no of columns in matrix- ");
		int c = sc.nextInt();
		System.out.println("Solid");
		for (int i = 0; i < r; i++) {
			System.out.println("");
			for (int j = 0; j < c; j++) {
				System.out.print(" * ");
			}
		}
		System.out.println("Hollow ");
		int n = 4;
		for (int i = 0; i < r; i++) {
			System.out.println("");
			for (int j = 0; j < c; j++) {
				if (i == 0 || i == r - 1) {
					System.out.print(" * ");
				} else {
					if (j == 0 || j == c - 1) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}
				}
			}
		}
	}
}
