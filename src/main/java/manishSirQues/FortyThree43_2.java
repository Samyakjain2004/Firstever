package manishSirQues;

//WAP to print a star solid pyramid
import java.util.Scanner;

public class FortyThree43_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows- ");
		int r = sc.nextInt();

		for (int i = 1; i <= r; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
		}
	}
}
