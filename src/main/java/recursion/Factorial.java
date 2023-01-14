package recursion;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number- ");
	int x=sc.nextInt();
	
	int fact=findFact(x);
	System.out.println(fact);
}

private static int findFact(int x) {
	if (x<1) {
		return 1;
	}
	return x*findFact(x-1);
}
}
