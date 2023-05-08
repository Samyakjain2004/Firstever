package manishSirQues;

import java.util.Scanner;

//WAP to Print name till I become 10 giving initial value zero
public class Ten10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String s=sc.nextLine();
	int x=0;
	while (x<=10) {
		System.out.println(s);
		x++;
	}
}
}
