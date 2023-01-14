package recursion;

import java.util.Scanner;

public class TwoPowerN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter power");
	int n=sc.nextInt();
	
	int two=findPower(n);
	System.out.println(two);
}

private static int findPower(int n) {
	if (n<1) {
		return 1;
	}
	if (n==1) {
		return 2;
	}
	return 2*findPower(n-1);
}
}
