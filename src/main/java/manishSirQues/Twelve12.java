package manishSirQues;

//WAP to print consecutive integers till x
import java.util.Scanner;

public class Twelve12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no-  ");
		int x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}
	}
}
