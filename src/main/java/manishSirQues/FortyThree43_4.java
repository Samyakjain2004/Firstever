package manishSirQues;

//WAP to form a triangle equilateral, left angled and right angled
import java.util.Scanner;

public class FortyThree43_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows- ");
		int n = sc.nextInt();
		System.out.println("Equilateral");
		for (int i = 1; i <= n; i++) {
			System.out.println(" ");
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
		}
		System.out.println(" ");
		System.out.println("Right Angled");
		for (int k = 1; k <= n; k++) {
			System.out.println("");
			for (int l = 1; l <= n - k; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= k; m++) {
				System.out.print("*");
			}
		}
		System.out.println(" ");
		System.out.println("Left angled");
		for (int x = 1; x <= n; x++) {
			System.out.println("");
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			for (int z = 1; z <= n - x; z++) {
				System.out.print(" ");
			}
		}
	}
}
